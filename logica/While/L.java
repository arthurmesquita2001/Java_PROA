package while_repeticao;
import java.util.Scanner;
/**
 * Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo
//seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo
//usuário.
@author Arhut Mesquita Rocha
 */
public class L {
    public static void main(String[] args) {
        menoremaior();
    }
    public static void menoremaior(){
        Scanner buf = new Scanner(System.in);
        int v1,v2,v;

        System.out.println("numero");
        v=buf.nextInt();

        v1=v;
        v2=v;

        while(v>=0){
           
            if(v>v1){
                v1=v;
            }
            else if(v<v2){
                v2=v;
            }
            System.out.println("numero");
            v=buf.nextInt();
        }

        System.out.println("O maior é "+v1+" e o menor é "+v2);
    }
}
