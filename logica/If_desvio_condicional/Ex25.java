package desvio_condicional;

import java.util.Scanner;

/**
 * Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
//escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
//ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
@author Arthur Mesquita Rocha
 */

public class Ex25 {
    public static void main(String[] args) {
        saldo();
    }
    public static void saldo(){
        Scanner i = new Scanner(System.in);

        int numero;
        double credito,debito,saldo;

        System.out.println("Número da contar");
        numero=i.nextInt();

        System.out.println("Saldo");
        saldo=i.nextDouble();

        System.out.println("Crédito");
        credito=i.nextDouble();

        System.out.println("Débito");
        debito=i.nextDouble();

        if((saldo+credito-debito)>0){
            System.out.println("Saldo positivo ");
        }else{
            System.out.println("Saldo negativo");
        }

    }

    
}
