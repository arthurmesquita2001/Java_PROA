
import java.util.Scanner;

/**
 * Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius (baseado na fórmula abaixo):
//C/5= F-32/9
 */

/** @author Arthur Mesquita
 * 
*/

public class Temperatura {

    public static void main(String args[]) {
        double temperaturaF;
        
        Scanner buffer= new Scanner(System.in);
        System.out.println("Digite o valor da temperatura em F");
        temperaturaF=buffer.nextDouble();
       
        temperaturaF=converter(temperaturaF);
        System.out.println("é igual a "+temperaturaF+ " ºC");
    
    
    
        }
        public static double converter(double temperaturaF){
            return (((temperaturaF-32)*5)/9);
            
        }
    

}
