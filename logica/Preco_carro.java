
import java.util.Scanner;

/**
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
//distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.
 */

/** @author Arthur Mesquita
 * 
*/

public class Preco_carro {
    public static void main(String args[]) {
        double custo_fabrica,custo_final;
        
        Scanner buffer= new Scanner(System.in);
        System.out.println("Digite o valor do preço de fábrica");
        custo_fabrica=buffer.nextDouble();
       
        custo_final=preco_final(custo_fabrica);
        System.out.println(custo_final);
    
    
        }
        public static double preco_final(double custo_fabrica){
            return ((custo_fabrica*0.28)+(custo_fabrica*0.45)+custo_fabrica);
            
        }
}
