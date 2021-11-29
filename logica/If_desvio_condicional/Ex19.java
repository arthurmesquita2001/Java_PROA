package desvio_condicional;

import java.util.Scanner;

/**
 * Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.
 * @author Arthur Mesquita Rocha
 */
public class Ex19 {
    public static void main(String[] args) {
        Bigger();
    }

    public static void Bigger(){
        Scanner buffer = new Scanner(System.in);

        int x,y;

        System.out.println("Entrada 2 valores");
        x=buffer.nextInt();
        y=buffer.nextInt();

        if(x>y){
            System.out.println(x+" > "+y);
        }else{
            System.out.println(x+" < "+y);
        }

    }
}
