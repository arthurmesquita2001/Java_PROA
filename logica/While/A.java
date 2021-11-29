package while_repeticao;



import java.util.Scanner;

/**
 * @author
 * Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer
 */

public class A {
    public static void main(String[] args) {
        Resultados_tb();
    }
    public static void Resultados_tb(){
        Scanner buffer = new Scanner(System.in);
        int x,i=1;
        System.out.println("Qual o valor que você quer saber a tabuada?");
        x=buffer.nextInt();

        while(i<=10){
            System.out.println(x+" ° "+i+" = "+(x*i));
            i++;
        }
    }
}

