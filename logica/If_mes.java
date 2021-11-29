
import java.util.Scanner;
/**
 *Faça um algoritmo que leia o número escolhido pelo usuário e diga o mês do ano de acordo com o número. (Utilizando "Se" e "Escolha/caso")
 * @author Arthur
 */

public class If_mes {
    public static void main (String args[]){
        mes_aniversario();
    }

    public static void mes_aniversario(){ 
        Scanner buffer = new Scanner(System.in);
        int mes;

        System.out.println("Qual o número do mês que você nasceu: ");
        mes=buffer.nextInt();

        if (mes==1) {
            
                System.out.println("Janeiro");
        }
            else if(mes==2) {
                System.out.println("Fevereiro");
           }
        
            else if(mes==3) {
                System.out.println("Março");
       }
            else if(mes==4) {
                System.out.println("Abril");
   }
            else if(mes==5) {
                System.out.println("Maio");
            }
            else if(mes==6) {
                System.out.println("Junho");
            }
            else if(mes==7) {
                System.out.println("Julho");
            }
            else if(mes==8) {
                System.out.println("Agosto"); }
            else if(mes==9) {
                System.out.println("Setembro"); }
            else if(mes==2) {
                System.out.println("Outubro"); }
            else if(mes==2) {
                System.out.println("Novembro"); }
            else{
                System.out.println("Dezembro");
                }
    }
}
