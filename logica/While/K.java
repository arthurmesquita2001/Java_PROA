package while_repeticao;
import java.util.Scanner;
/**
 * Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha,
//banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do
//nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área
//do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar
//calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor
//total acumulado da área residencial.
 */
public class K {
    public static void main(String[] args) {
        funcao_K();
    }
    public static void funcao_K(){
        
        Scanner exercicio = new Scanner(System.in);
        Scanner exercicio_q = new Scanner(System.in);
        String comodo,q="SIM";
        double largura,comprimento,area_total=0;

        while(q.equals("SIM")){
            System.out.println("Nome:");
            comodo=exercicio_q.nextLine();
            System.out.println("Largura:");
            largura=exercicio.nextDouble();
            System.out.println("Comprimento:");
            comprimento=exercicio.nextDouble();

            System.out.println((largura*comprimento)+" m²");
            area_total+=(largura*comprimento);

            System.out.println("Fazer outra vez?");
            q=exercicio_q.nextLine();
        }
        System.out.println(area_total);
        
    }
}
