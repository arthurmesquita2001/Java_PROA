
import java.util.Scanner;
 /**
 *
 * @author Arthur
 */

 public class Quadrado {

    public static void main(String args[]) {
        
        Scanner buffer = new Scanner(System.in);

        double x;

        System.out.println("Digite o valor do lado");
        x=buffer.nextDouble();

        System.out.println("Quadrado de lado "+x+" tem a área de "+(Math.pow(x, 2)));


    }
    

 }
