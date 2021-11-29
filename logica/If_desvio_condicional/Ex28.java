package desvio_condicional;

import java.util.Scanner;

/**
 *  Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
@author Arthur Mesquita Rocha
 */

public class Ex28 {
    public static void main(String[] args) {
        Maior_valor();
    }
    public static void Maior_valor(){
        Scanner buffer= new Scanner(System.in);

        int valor,valor1,valor2;

        System.out.println("Entre com 3 números");
        valor=buffer.nextInt();
        valor1=buffer.nextInt();
        valor2=buffer.nextInt();

        if(valor>valor1 && valor>valor2){
            System.out.println(valor);
        }else if(valor1>valor && valor1>valor2){
            System.out.println(valor1);
        }else{
            System.out.println(valor2);
        }

    }

    
}
