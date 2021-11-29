package desvio_condicional;
import java.util.Scanner;
 /**
 *Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo)
 * @author Arthur
 */

public class Ex15 {
    public static void main(String args[]){

        positivo();
    }
    public static void positivo(){
        Scanner buffer = new Scanner (System.in);
        int w;
        System.out.println("Qual o número ?");
        w=buffer.nextInt();

        if(w>=0){
            System.out.println("É POSITIVO");
        }
        else{
            System.out.println("É NEGATIVO");  
        }
    }
    
}
