package desvio_condicional;

import java.util.Scanner;
 /**
 *Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
//contrário escrever NÃO É MAIOR QUE 10!
 * @author Arthur
 */

public class Ex14 {
    public static void main(String args[]){

        verificacao();
    }
    public static void verificacao(){
        Scanner buffer = new Scanner (System.in);
        int w;
        System.out.println("Qual o número ?");
        w=buffer.nextInt();

        if(w>10){
            System.out.println("É MAIOR QUE 10!");
        }
        else{
            System.out.println("NÃO É MAIOR QUE 10!");  
        }
    }
}
