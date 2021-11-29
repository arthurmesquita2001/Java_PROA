package while_repeticao;

import java.util.Scanner;
 
/**
 *  Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do
//somatório e a média aritmética dos valores lidos.
@author AMR
 */
public class I {
    public static void main(String[] args) {
        somatorio_divido_10();
    }
    public static void somatorio_divido_10(){
        Scanner buffer = new Scanner(System.in);
        int x,cont=0;
        double res=0;
        while(cont<10){
            System.out.println("-");
            x=buffer.nextInt();

            res=res+x;
            cont++;
        }
        System.out.println((res/10));
    }
}
