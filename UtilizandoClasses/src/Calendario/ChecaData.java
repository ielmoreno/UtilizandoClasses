package Calendario;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class ChecaData {
    public static void main(String[] args) {
        Data data=new Data(Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o dia com 2 digitos [dd]","Dia",JOptionPane.PLAIN_MESSAGE)),Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o mês com 2 digitos [MM]", "Mês",JOptionPane.PLAIN_MESSAGE)),Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o ano com 4 digitos [yyyy]","Ano",JOptionPane.PLAIN_MESSAGE)));
        
        JOptionPane.showMessageDialog(null,"A data digitado foi\n"+data.getDia()+"/"+data.getMesExtenso(data.getMes())+"/"+data.getAno(),"Data", JOptionPane.PLAIN_MESSAGE);
        if(data.compara(data)==1){
            JOptionPane.showMessageDialog(null, "A data enontra-se no:\nFuturo","Data futura",JOptionPane.PLAIN_MESSAGE);
        }
        else if (data.compara(data)==0) {
            JOptionPane.showMessageDialog(null, "A data enontra-se no:\nPresente","Data atual",JOptionPane.PLAIN_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "A data enontra-se no:\nPassado","Data passada",JOptionPane.PLAIN_MESSAGE);
        }
        
        Data dt2=new Data();
        
        dt2.clone(data);
        
        JOptionPane.showMessageDialog(null, "Data digitada: "+data.getDia()+"/"+data.getMesExtenso(data.getMes())+"/"+data.getAno()+"\nData clonada: "+dt2.getDia()+"/"+dt2.getMesExtenso(dt2.getMes())+"/"+dt2.getAno());
        
    }
    
}
