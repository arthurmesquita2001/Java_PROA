package desvio_condicional;

import java.util.Scanner;

/**
 * Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
//maiores.
@author Arthur Mesquita Rocha
 */

public class Ex29 {
    public static void main(String[] args) {
        Soma_valores();
    }
    public static void Soma_valores(){
        Scanner buffer= new Scanner(System.in);

        int valor,valor1,valor2;

        System.out.println("Entre com 3 números");
        valor=buffer.nextInt();
        valor1=buffer.nextInt();
        valor2=buffer.nextInt();

        if(valor>valor1 && valor1>valor2){
            System.out.println("Os dois maiores são "+valor+" e "+valor1+" somando ambos é "+(valor+valor1));
        }
        else if(valor1>valor && valor>valor2){
            System.out.println("Os dois maiores são "+valor+" e "+valor1+" somando ambos é "+(valor+valor1));
        }
        else if(valor2>valor1 && valor1>valor){
            System.out.println("Os dois maiores são "+valor1+" e "+valor2+" somando ambos é "+(valor1+valor2));
        }
        else if(valor1>valor2 && valor2>valor){
            System.out.println("Os dois maiores são "+valor2+" e "+valor1+" somando ambos é "+(valor2+valor1));
        }else{
            System.out.println("Os dois maiores são "+valor+" e "+valor2+" somando ambos é "+(valor+valor2));
        }

    }

    
}
