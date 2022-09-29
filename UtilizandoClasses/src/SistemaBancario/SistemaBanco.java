package SistemaBancario;

import javax.swing.JOptionPane;

public class SistemaBanco {

    public static void main(String[] args) {
        Conta cliente;
        String opcao[] = {"Extrato", "Saque", "Deposito", "Sair"};
        int resp = 0, confirm = 1;
        double valor;

        cliente = new Conta(JOptionPane.showInputDialog(null, "Informe o nome do titular da conta", "Nome", JOptionPane.INFORMATION_MESSAGE),
                Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor a ser depositado", "Deposito", JOptionPane.INFORMATION_MESSAGE)));

        JOptionPane.showMessageDialog(null, "Conta criada: número " + cliente.getConta());

        do {
            resp = JOptionPane.showOptionDialog(null, "Qual ação gostaria de fazer", "Conta", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao, opcao[0]);

            if (resp == 0) {

                JOptionPane.showMessageDialog(null, "Saldo em conta: R$" + cliente.getSaldo() + "\nCheque Especial: R$" + cliente.getLimite(), "Extrato", JOptionPane.INFORMATION_MESSAGE);
            } else if (resp == 1) {
                confirm=1;
                while (confirm == 1) {
                    valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor a ser sacado", "Saque", JOptionPane.INFORMATION_MESSAGE));
                    if (valor <= cliente.getSaldo()) {
                        cliente.saque(valor);
                        JOptionPane.showMessageDialog(null, "Saque efetuado\nSaldo em conta: R$" + cliente.getSaldo());
                        confirm=0;
                    } else if (valor <= (cliente.getSaldo() + cliente.getLimite())) {
                        confirm=JOptionPane.showConfirmDialog(null, "Gostaria de usar o limite do cheque especial\n(Juros de 50000% a.m)", "Utilização do cheque especial", JOptionPane.YES_NO_OPTION);
                        if (confirm == 0) {
                            cliente.saque(valor);
                            JOptionPane.showMessageDialog(null, "Saque efetuado\nSaldo em conta: R$" + cliente.getSaldo());
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Saldo Insuficiente","Saque",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Saldo Insuficiente","Saque",JOptionPane.ERROR_MESSAGE);
                        confirm=0;
                    }
                }
            } else if (resp == 2) {

                cliente.deposito(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor a ser depositado", "Deposito", JOptionPane.INFORMATION_MESSAGE)));
                JOptionPane.showMessageDialog(null, "Deposito efetuado\nSaldo da conta: R$" + cliente.getSaldo());

            }
            
        } while (resp < 3);
    }

}
