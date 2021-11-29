package repeticao_do_while;

import java.util.Scanner;

/**
 * @author Arthur Mesquita Rocha
 * Elaborar um programa que apresente o resultado inteiro da divisão de dois números quaisquer.
//Para a elaboração do programa, não utilizar em hipótese alguma o conceito do operador aritmético
//DIV. A solução deve ser alcançada com a utilização de looping. Ou seja, o programa deve
//apresentar como resultado (quociente) quantas vezes o divisor cabe no dividendo.
 */
public class j {
    public static void main(String[] args) {
        Ope_divisao();
    }
    public static void Ope_divisao(){
        int x,z,vezes=0;
        Scanner i = new Scanner(System.in);

        System.out.println("Digite os valores respectivamente");
        x=i.nextInt();
        z=i.nextInt();
        
        if(z>x){
            System.out.println("0");
        }
        else{ 
            do{
            x=x-z;
            vezes++;
            
            
         }while(x>=z);}
         System.out.println(vezes);
       
    }
}
