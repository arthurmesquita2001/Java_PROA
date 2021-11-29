package desvio_condicional;

import java.util.Scanner;
/**
 Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades
//dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma
//das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais
//novo com a mulher mais velha.
@author Arthur Mesquita Rocha
 */

public class Ex36 {
    public static void main(String[] args) {
        idades();
    }
    public static void idades(){
        Scanner buffer= new Scanner(System.in);

        int idade_homem1,idade_homem2,idade_mulher1,idade_mulher2;
        

        System.out.println("IDADE DOS HOMENS");
        idade_homem1=buffer.nextInt();
        idade_homem2=buffer.nextInt();
        
        System.out.println("IDADE DAS WOMANS");
        idade_mulher1=buffer.nextInt();
        idade_mulher2=buffer.nextInt();
        

        if((idade_homem1>idade_homem2)&&(idade_mulher1>idade_mulher2)){
            System.out.println((idade_homem1+idade_mulher2));
        }
        else if((idade_homem1>idade_homem2)&&(idade_mulher2>idade_mulher1)){
            System.out.println((idade_homem1+idade_mulher1));
        }
        else if((idade_homem2>idade_homem1)&&(idade_mulher1>idade_mulher2)){
            System.out.println((idade_homem2+idade_mulher2));
        }
        else{
            System.out.println((idade_homem2+idade_mulher1));
        }
    }

    
}
