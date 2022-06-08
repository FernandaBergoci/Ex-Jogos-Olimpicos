package jogosolimpicos;

import java.util.Arrays;

/**
 *
 * @author Fernanda
 */
public class GinasticaArtistica {
    protected String nome;
     protected double[] notas = new double[5];
     protected double soma=0;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double[] getNotas( ){
        return notas;
    }
    public void setNotas(double[] notas){
        this.notas = notas;
    }
    public double getSoma(){
        return soma;
    }
    public void setSoma(double soma){
        this.soma = soma;
    }
    
    public void organizarNotas(){
       Arrays.sort(notas);
       for(int i=1; i<notas.length; i++){
          this.soma += this.notas[i];  
        }
    }
    public void print(){
        System.out.println("\nNome: "+ this.nome);
        System.out.print("Pontuação ");
        for(int i=0; i<notas.length; i++){
            System.out.print(" " + this.notas[i] + " ");  
        }
        System.out.println("\nExcluindo o valor mais baixo - Total de pontos: "+ this.soma);
    }
    
}
