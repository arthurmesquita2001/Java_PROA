package desvio_condicional;
import java.util.Scanner;

/**
 *As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
//compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
//escreva o custo total da compra.
 * @author Arthur
 */

public class Ex16 {
    public static void main(String args[]){
        valor_final();
    }

    public static void valor_final(){
        Scanner buffer = new Scanner(System.in);
        int qtds;

        System.out.println("Unidades compradas: ");
        qtds=buffer.nextInt();

        if(qtds>12){
            System.out.println("Unidade = "+qtds+" x R$1,00 = R$ "+qtds);
        }
        else{
            System.out.println("Unidade = "+qtds+" x R$1,30 = R$ "+qtds*1.30);
        }
    }
}
