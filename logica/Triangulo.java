
import java.util.Scanner;

/** @author Arthur Mesquita
 * 
*/
public class Triangulo {
    
    public static void main(String args[]) {
        double area;
        area=area_triangulo();
        System.out.println(area);
    
    
        }
        public static double area_triangulo(){
            double b,h;
            Scanner buffer= new Scanner(System.in);
            
            
                System.out.println("Digite o valor da base");
                b=buffer.nextDouble();
    
                System.out.println("Digite o valor da altura");
                h=buffer.nextDouble();
    
    
                
            return b*h/2;
            
            
        }
}
