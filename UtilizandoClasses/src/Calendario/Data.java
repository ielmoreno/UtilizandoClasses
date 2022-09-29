package Calendario;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String mesExtenso[]= {"Janeiro",
                                  "Fevereiro",
                                  "Março",
                                  "Abril",
                                  "Maio",
                                  "Junho",
                                  "Julho",
                                  "Agosto",
                                  "Setembro",
                                  "Outubro",
                                  "Novembro",
                                  "Dezembro"};

    public Data() {
    }

    public Data(int dia, int mes, int ano) {
        boolean validador=false;
        if(isBissexto(ano)){
            if(mes<8 && mes%2==1 || (mes>7 && mes<13) && mes%2==0){
                if(dia>0 && dia<32){
                    validador=true;
                }
            }
            else if(mes==2){
                if(dia>0 && dia<30){
                    validador=true;
                }
            }
            else if (mes>0 && mes<13) {
                if(dia>0 && mes<31){
                    validador=true;
                }
                
            }
        }
        else{
          if(mes<8 && mes%2==1 || (mes>7 && mes<13) && mes%2==0){
                if(dia>0 && dia<32){
                    validador=true;
                }
            }
            else if(mes==2){
                if(dia>0 && dia<29){
                    validador=true;
                }
            }
            else if (mes>0 && mes<13) {
                if(dia>0 && mes<31){
                    validador=true;
                }
                
            }  
        }
        if(validador){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        }
        else{
            this.dia=01;
            this.mes=01;
            this.ano=01;
        }
    }
    
    public int compara(Data data){
        int cont=0;
        int teste=0;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
        teste=Integer.parseInt(dtf.format(LocalDateTime.now()));
        if (data.getAno()>=teste) {
            if(data.getAno()>teste){
                return 1;
            }
            
        }
        else{
            return -1;
        }
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM");
        teste=Integer.parseInt(dtf1.format(LocalDateTime.now()));
        if(data.getMes()>=teste){
            if (data.getMes()>teste) {
                return 1;
            }
        }
        else{
            return -1;
        }
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd");
        teste=Integer.parseInt(dtf2.format(LocalDateTime.now()));
        if (data.getDia()>=teste) {
            if(data.getDia()>teste){
                return 1;
            }
        }
        else{
            return -1;
        }
        return 0;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public String getMesExtenso(int mes) {
        String mExtendido = this.mesExtenso[mes-1];
        return mExtendido;
    }
    
    public boolean isBissexto(int ano){
        if(ano%4==0 && ano%100!=0){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public void clone(Data data){
        this.dia=data.getDia();
        this.mes=data.getMes();
        this.ano=data.getAno();
        
    }
}

