

import java.util.Scanner;
/**
 *
 * @author Arthur
 */
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double y;
   
   Scanner buffer = new Scanner(System.in);
   
   System.out.println("Digite o raio");
   y=buffer.nextDouble();
   
   System.out.println("Area da circunferência é"+" "+(Math.PI*(Math.pow(y, 2))));
           
    }
    
}
