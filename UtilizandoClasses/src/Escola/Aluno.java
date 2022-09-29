
package Escola;
public class Aluno {
    public String matricula;
    public String nome;
    public float n1, n2, aA, nF;

    public Aluno(String matricula, String nome, float n1, float n2, float aA) {
        this.matricula = matricula;
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.aA = aA;
    }

    public Aluno() {
    }
    
    
    public float Media(float n1,float n2, float aA){
        float media;
        media = (float) (((n1+n2)*0.25)+(aA*0.2));
        return media;
    }
    
    float Final(float media){
    this.nF= (float) ((6-media)/0.3);
    if(this.nF>0){
        return this.nF;
    }else{
        return 0;
    }
    }
}