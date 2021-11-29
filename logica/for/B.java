package for_repeticao;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Resultados_tb();
    }
    public static void Resultados_tb(){
        Scanner buffer = new Scanner(System.in);
        int x,i=1;
        System.out.println("Qual o valor que você quer saber a tabuada?");
        x=buffer.nextInt();

        for(i=1;i<=10;i++){
            System.out.println(x+" ° "+i+" = "+(x*i));
        }
    }
}

