package desvio_condicional;

import java.util.Scanner;

/**
 *Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
//do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
@author Arthur Mesquita Rocha
 */

public class Ex32 {
    public static void main(String[] args) {
        Resultado();
    }
    public static void Resultado(){
        Scanner buffer1= new Scanner(System.in);
        Scanner buffer2= new Scanner(System.in);

        String time_A,time_B;
        int gol_time_A,gol_time_B;

        System.out.println("Nome do time");
        time_A=buffer1.nextLine();
        System.out.println("Gols");
        gol_time_A=buffer1.nextInt();
        System.out.println("Nome do time");
        time_B=buffer2.nextLine();
        System.out.println("Gols");
        gol_time_B=buffer2.nextInt();

        if(gol_time_A>gol_time_B){
            System.out.println(time_A);
        }
        else if(gol_time_B>gol_time_A){
            System.out.println(time_B);
        }
        else{
            System.out.println("EMPATOU");
        }
    }

    
}
