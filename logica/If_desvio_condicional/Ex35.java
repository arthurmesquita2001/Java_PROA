package desvio_condicional;

import java.util.Scanner;

/**
 Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
//seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
//que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
@author Arthur Mesquita Rocha
 */

public class Ex35 {
    public static void main(String[] args) {
        Valor_combustivel();
    }
    public static void Valor_combustivel(){
        Scanner buffer= new Scanner(System.in);

        char tipo_combustivel;
        double litro,tot;
        

        System.out.println("Tipo de combustível (L ou G)");
        tipo_combustivel=buffer.next().charAt(0);
        System.out.println("Quantidade total");
        litro=buffer.nextDouble();
        

        if((tipo_combustivel=='A')&&(litro<=20)){
            tot=2.9*litro*0.97;
            System.out.println("R$ "+tot);
        }
        else if((tipo_combustivel=='A')&&(litro>20)){
            tot=2.9*litro*0.95;
            System.out.println("R$ "+tot);
        }
        else if((tipo_combustivel=='G')&&(litro<=20)){
            tot=3.3*litro*0.96;
            System.out.println("R$ "+tot);
        }
        else{
            tot=3.3*litro*0.94;
            System.out.println("R$ "+tot);
        }
    }

    
}
