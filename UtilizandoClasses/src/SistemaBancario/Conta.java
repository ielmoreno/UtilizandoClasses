package SistemaBancario;

import java.util.Random;
import javax.swing.JOptionPane;

public class Conta {
    private String nome;
    private String conta;
    private double saldo;
    private double limite;
    
    public Conta(String nome, double saldo){
        this.nome = nome;
        Random rand = new Random();
        this.conta = String.valueOf( rand.nextInt(100000));
        this.saldo = saldo;
        this.limite = 1000.00;
    }

    public String getNome() {
        return nome;
    }

    public String getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }
    
    public void deposito(double valor){
        if (this.saldo<0) {
            this.limite = this.limite-this.saldo;
            this.saldo+=valor;
            
        }
        else{
            this.saldo+=valor;
        }
        
    }
    
    public void saque(double valor){
        if(valor>this.saldo){
            this.saldo= this.saldo-valor;
            this.limite= this.limite+this.saldo;
        }
        else{
            this.saldo-=valor;
        }
        
    }
    
    public void extrato(){
        
        
    }
}
