
import java.util.Scanner;
 /**
 *
 * @author Arthur
 */
public class Retangulo {
    public static void main(String args[]) {
    double area;
    area=area_retangulo();
    System.out.println(area);



    }

    public static double area_retangulo(){
        double b,h;
        Scanner buffer= new Scanner(System.in);
        
        
            System.out.println("Digite o valor da base");
            b=buffer.nextDouble();

            System.out.println("Digite o valor da altura");
            h=buffer.nextDouble();


            
        return b*h;
        
        
    }
}
