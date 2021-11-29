package desvio_condicional;

import java.util.Scanner;

/**
 * Ler 3 valores (considere que não serão informados valores iguais) e escrever em ordem crescente
@author Arthur Mesquita Rocha
 */

public class Ex30 {
    public static void main(String[] args) {
        Ordenar();
    }
    public static void Ordenar(){
        Scanner buffer= new Scanner(System.in);

        int valor,valor1,valor2;

        System.out.println("Entre com 3 números");
        valor=buffer.nextInt();
        valor1=buffer.nextInt();
        valor2=buffer.nextInt();

        if(valor>valor1 && valor1>valor2){
            System.out.println(valor2+" < "+valor1+" < "+valor);
        }
        else if(valor1>valor && valor>valor2){
            System.out.println(valor2+" < "+valor+" < "+valor1);
        }
        else if(valor2>valor1 && valor1>valor){
            System.out.println(valor+" < "+valor1+" < "+valor2);
        }
        else if(valor1>valor2 && valor2>valor){
            System.out.println(valor+" < "+valor2+" < "+valor1);
        }
        else if(valor>valor2 && valor2>valor1){
            System.out.println(valor1+" < "+valor2+" < "+valor);
        }
        else{
            System.out.println(valor1+" < "+valor+" < "+valor2);
        }
    }

    
}
