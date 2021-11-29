package desvio_condicional;

import java.util.Scanner;

/**
Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço
// unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total
// a pagar (total a pagar = total - desconto), sabendo-se que:
// - Se quantidade <= 5 o desconto será de 2%
// - Se quantidade > 5 e quantidade <=10 o desconto será de 3%
// - Se quantidade > 10 o desconto será de 5%

@author Arthur Mesquita Rocha
 */

public class Ex40 {
    public static void main(String[] args) {
       Total_pagar();
    }
    public static void Total_pagar(){
        Scanner buffer= new Scanner(System.in);

        String nome;
        int quantidade;
        double valor;
        

        System.out.println("Produto");
        nome=buffer.nextLine();

        System.out.println("Quantidade");
        quantidade=buffer.nextInt();

        System.out.println("Valor unitário");
        valor=buffer.nextDouble();
        
        if(quantidade<=5){
            System.out.println("Você terá que pagar R$ "+(quantidade*valor*0.98));
        }
        else if(quantidade>5 && quantidade<=10){
            System.out.println("Você terá que pagar R$ "+(quantidade*valor*0.97));
        }
            else{
                System.out.println("Você terá que pagar R$ "+(quantidade*valor*0.95));
            }
        }
        
        
    }

    
