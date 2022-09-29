package Empresa;

import javax.swing.JOptionPane;

public class Rh {
    public static void main(String[] args) {
        Funcionario func = new Funcionario(JOptionPane.showInputDialog(null,"Nome do funcionário", "Nome", JOptionPane.INFORMATION_MESSAGE),
                                           JOptionPane.showInputDialog(null,"Departamento do funcionário","Departamento",JOptionPane.INFORMATION_MESSAGE),
                                           JOptionPane.showInputDialog(null,"Data de admissão", "Admissão", JOptionPane.INFORMATION_MESSAGE),
                                           JOptionPane.showInputDialog(null,"Informe o RG do funcionário", "RG", JOptionPane.INFORMATION_MESSAGE),
                                           Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o salário do funcionário", "Salário",JOptionPane.INFORMATION_MESSAGE)));
        String[] opcao={"Aumento","Anual","Sair"};
        int val, aumento;
        do{
        val=JOptionPane.showOptionDialog(null,"Informe a opção desejada para o funcionário", "Opção", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao, opcao[0]);
        
        if(val==0){
            aumento=Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o percentual de aumento de salario","Percentual de aumento", JOptionPane.INFORMATION_MESSAGE));
            func.salario=func.recebeAumento(aumento);
            JOptionPane.showMessageDialog(null, "O salário atual do funcionário é: R$"+func.salario,"Novo salário", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(val==1){
            JOptionPane.showMessageDialog(null,"O salário anual do funcionário é: R$"+func.calculaGanhoAnual(),"Ganho anual",JOptionPane.INFORMATION_MESSAGE);
        }
        }while(val<2);
    }
}
