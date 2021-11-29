package desvio_condicional;

import java.util.Scanner;

/**
 *  Ler um valor e escrever se é positivo, negativo ou zero.
@author Arthur Mesquita Rocha
 */

public class Ex27 {
    public static void main(String[] args) {
        inteiro();
    }
    public static void inteiro(){
        Scanner buffer= new Scanner(System.in);

        int valor;

        System.out.println("Valor atual");
        valor=buffer.nextInt();

        if(valor>0){
            System.out.println("Positivo ");
        }else if(valor==0){
            System.out.println("Sem valor");
        }else{
            System.out.println("Valor negativo");
        }

    }

    
}
