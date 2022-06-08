package jogosolimpicos;

import java.util.Scanner;

/**
 *
 * @author Fernanda
 */
public class JogosOlimpicos {

    public static void main(String[] args) {
        int opcao = -1, i;
        double[] notaAux = new double[5]; //vetor auxiliar para receber notas
        double[] distanciaAux = new double[3]; //vetor auxiliar para receber distância dos arremessos
        String nomeAux; // String auxiliar para receber nome do competidor
        Scanner menu = new Scanner(System.in);
        Scanner recNome = new Scanner(System.in);
                    
        while(opcao!=0){
            System.out.println("\tMENU");
            System.out.println("1 - Ginastica Artística ");
            System.out.println("2 - Arremesso de Peso ");
            System.out.println("0 - Sair ");
            System.out.print("Digite a modalide: ");
            opcao = menu.nextInt();
         switch (opcao) {
            case 1:
                System.out.println("Digite os dados do 1º competidor");
                GinasticaArtistica gin1 = new GinasticaArtistica(); 
                System.out.print("Digite o nome: ");
                nomeAux = recNome.nextLine();
                gin1.setNome(nomeAux); 
                
                for(i=0; i<notaAux.length; i++){
                 System.out.printf("Digite a %do nota: ", i+1);
                 notaAux[i] = new Scanner(System.in).nextDouble();
                }
                gin1.setNotas(notaAux);
                gin1.organizarNotas();
                gin1.print();
                
                System.out.println("\nDigite os dados do 2º competidor");
                GinasticaArtistica gin2 = new GinasticaArtistica();
                System.out.print("Digite o nome: ");
                nomeAux = recNome.nextLine();
                gin2.setNome(nomeAux);
                
                for(i=0; i<notaAux.length; i++){
                 System.out.printf("Digite a %do nota: ", i+1);
                 notaAux[i] = new Scanner(System.in).nextDouble();
                }
                gin2.setNotas(notaAux);
                gin2.organizarNotas();
                gin2.print();
                if(gin1.soma > gin2.soma ){
                    System.out.println("\nVencedor: " + gin1.getNome());
                }else{
                    System.out.println("\nVencedor: " + gin2.getNome());
                }
                 
            break;
            case 2:
              System.out.println("Digite os dados do 1º competidor");
                ArremessoDePeso arr1 = new ArremessoDePeso();
                System.out.print("Digite o nome: ");
                nomeAux = recNome.nextLine();
                arr1.setNome(nomeAux);
                
                for(i=0; i<distanciaAux.length; i++){
                 System.out.printf("Digite a distância do %do arremesso: ", i+1);
                 distanciaAux[i] = new Scanner(System.in).nextDouble();
                }
                arr1.setDistancia(distanciaAux);
                arr1.organizarArremessos();
                arr1.print();
                
                System.out.println("\nDigite os dados do 2º competidor");
                ArremessoDePeso arr2 = new ArremessoDePeso();
                System.out.print("Digite o nome: ");
                nomeAux = recNome.nextLine();
                arr2.setNome(nomeAux);
                
                for(i=0; i<distanciaAux.length; i++){
                 System.out.printf("Digite a distância do %do arremesso: ", i+1);
                 distanciaAux[i] = new Scanner(System.in).nextDouble();
                }
                arr2.setDistancia(distanciaAux);
                arr2.organizarArremessos();
                arr2.print();                             

                for(int j=0; j<distanciaAux.length; j++ ){
                    if(arr1.maiorLancamento1[2-j]>arr2.maiorLancamento1[2-j]){
                        System.out.println("\nVencedor: " + arr1.getNome());
                        break;
                    }else{
                        if(arr1.maiorLancamento1[2-j]<arr2.maiorLancamento1[2-j]){
                            System.out.println("\nVencedor: " + arr2.getNome());
                            break;
                        }else{
                            System.out.printf("\nEmpate %do maior arremesso.", j +1);
                        }
                    }
                    System.out.print(" " + arr1.maiorLancamento1[2-j]);
                    System.out.print(" " + arr2.maiorLancamento1[2-j]);
                }           
                System.out.println("\n");
              break;  
            default:
               System.out.println("Opcao invalida");
               break;
            }
                
        }   
        }
}
