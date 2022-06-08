package jogosolimpicos;

import java.util.Arrays;

/**
 *
 * @author Fernanda
 */
public class ArremessoDePeso {
    protected String nome;
    protected double[] distancia = new double[3];
    protected double maiorLancamento1[] = new double[3];
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double[] getDistancia( ){
        return distancia;
    }
    public void setDistancia(double[] distancia){
        this.distancia = distancia;
    }   
    public void organizarArremessos(){
       Arrays.sort(this.distancia);
       System.arraycopy(distancia, 0, this.maiorLancamento1, 0, distancia.length);
    }
        
    public void print(){
        System.out.println("\nNome: "+ this.nome);
        System.out.print("Distância dos arremessos: ");
        for(int i=0; i<distancia.length; i++){
            System.out.print(" " + this.maiorLancamento1[i] + " ");  
        }
        System.out.println("\n");
    }
    
}