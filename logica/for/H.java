package for_repeticao;
import java.util.Scanner;
/**
 * @author
 * Elaborar um programa que apresente como resultado o valor de uma potência de uma base
//qualquer elevada a um expoente qualquer, ou seja, de BE
//, em que B é o valor da base e E o valor
//do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do
//portuguol (^).
 */

public class H {
    public static void main(String[] args) {
        potencia();
    }
    public static void potencia(){
        Scanner y = new Scanner(System.in);
        int base,expoente,cont=0,acumulador=0;

        System.out.println("Valor da base");
        base=y.nextInt();
        System.out.println("Valor do expoente");
        expoente=y.nextInt();

        acumulador=base;
        for(cont=0;cont<=expoente;cont++){
            if(cont==0){
                System.out.println(base+ " elevado a 0 = 1");
            }
            else if(cont==1){
                System.out.println(base+ " elevado a 1 = "+base);
            }
            else{
                    acumulador=acumulador*base;
                    System.out.println(base+" elevado a "+cont+ "=" + acumulador);
                    
            }   

        }
    }
}

