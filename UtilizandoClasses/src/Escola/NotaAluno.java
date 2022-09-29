package Escola;

import javax.swing.JOptionPane;

public class NotaAluno {
    public static Aluno[] add(int c, Aluno[] alunos){
        Aluno[] nAlunos = new Aluno[c+2];
        for(int nC=0;nC<nAlunos.length;nC++){
            nAlunos[nC]= new Aluno();
            if(nC<=c){
                nAlunos[nC].matricula = alunos[nC].matricula;
                nAlunos[nC].nome = alunos[nC].nome;
                nAlunos[nC].n1 = alunos[nC].n1;
                nAlunos[nC].n2 = alunos[nC].n2;
                nAlunos[nC].aA = alunos[nC].aA;
                nAlunos[nC].nF = alunos[nC].nF;
            }
            else{
                nAlunos[nC].matricula = null;
                nAlunos[nC].nome = null;
                nAlunos[nC].n1 = 0;
                nAlunos[nC].n2 = 0;
                nAlunos[nC].aA = 0;
                nAlunos[nC].nF = 0;
            }
        }
        return nAlunos;
    }
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[1];
        int novo =4;
        
        for(int c=0;c<alunos.length;c++){
            alunos[c]= new Aluno(JOptionPane.showInputDialog(null,"Informe a matricula do aluno","Matricula",JOptionPane.INFORMATION_MESSAGE),
                                 JOptionPane.showInputDialog(null,"Informe o nome do aluno", "Nome", JOptionPane.INFORMATION_MESSAGE),
                                 Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a nota da primeira prova","Nota 1",JOptionPane.INFORMATION_MESSAGE)),
                                 Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a nota da segunda prova","Nota 2",JOptionPane.INFORMATION_MESSAGE)),
                                 Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a nota do trabalho", "Nota trabalho", JOptionPane.INFORMATION_MESSAGE)));
            
            
            alunos[c].nF = alunos[c].Final(alunos[c].Media(alunos[c].n1,alunos[c].n2,alunos[c].aA));
            novo = JOptionPane.showConfirmDialog(null, "Gostaria de cadastrar um novo aluno?", "Novo cadastro",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            
            if(novo==0){
                alunos = add(c,alunos);
            }
        }
        for(int c=0;c<alunos.length;c++){
            JOptionPane.showMessageDialog(null,"O aluno "+alunos[c].nome+" necessita de uma nota final igual a: "+ alunos[c].nF); ;
        }
        
        
    }
    
}
