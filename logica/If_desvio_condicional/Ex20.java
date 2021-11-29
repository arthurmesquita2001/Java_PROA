package desvio_condicional;

import java.util.Scanner;

/**
 * Ler dois valores (considere que não serão lidos valores iguais) e escrever na ordem crescente.
 * @author Arthur Mesquita Rocha
 */
public class Ex20 {
    public static void main(String[] args) {
        String retorno;
        retorno=crescente();
        System.out.println(retorno);
    }
    public static String crescente(){
        Scanner buffer = new Scanner(System.in);
        int h,i;

        System.out.println("Entrada 2 valores");
        h=buffer.nextInt();
        i=buffer.nextInt();

        if(h>i){
            return (i+" , "+h);
        }else{
            return (h+" , "+i);
        }
    }
}   
