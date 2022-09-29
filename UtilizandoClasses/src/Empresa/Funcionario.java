package Empresa;
public class Funcionario {
    public String nome;
    public String departamento;
    public String admit;
    public String rg;
    public double salario;

    public Funcionario(String nome, String departamento, String admit, String rg, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.admit = admit;
        this.rg = rg;
        this.salario = salario;
    }
    
    
    double recebeAumento(int aumento){
    
        this.salario = ((double)aumento/100+1)*this.salario;
        
        return this.salario;
    }
    
    double calculaGanhoAnual(){
        double anual;
        anual = this.salario*12;
        
        return anual;
    }
    
}
