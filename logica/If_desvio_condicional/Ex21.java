package desvio_condicional;

import java.util.Scanner;

/**
 *  Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
//minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
//de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
 * @author Arthur Mesquita Rocha
 */
public class Ex21 {
    public static void main(String[] args) {
        String retorno;
        retorno=horario();
        System.out.println(retorno);
    }
    public static String horario(){
        Scanner buffer = new Scanner(System.in);
        int comeco,fim;

        System.out.println("Inicio e fim do jogo");
        comeco=buffer.nextInt();
        fim=buffer.nextInt();

        if(fim-comeco > 0){
            return ("A duração do jogo foi de:"+(fim-comeco)+" horas");
        }else{
            return ("A duração do jogo foi de:"+(fim-comeco+24)+" horas");
        }
    }
}
  

