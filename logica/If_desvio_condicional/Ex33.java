package desvio_condicional;

import java.util.Scanner;

/**
 *Ler dois valores e imprimir uma das três mensagens a seguir:
//‘Números iguais’, caso os números sejam iguais
//‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
//‘Segundo maior’, caso o segundo seja maior que o primeiro.
@author Arthur Mesquita Rocha
 */

public class Ex33 {
    public static void main(String[] args) {
        Valores();
    }
    public static void Valores(){
        Scanner buffer= new Scanner(System.in);

        int x,y;

        System.out.println("Numero");
        x=buffer.nextInt();
        System.out.println("Numero");
        y=buffer.nextInt();
        

        if(x>y){
            System.out.println("Primeiro é maior");
        }
        else if(y>x){
            System.out.println("Segundo é maior");
        }
        else{
            System.out.println("Iguais");
        }
    }

    
}
