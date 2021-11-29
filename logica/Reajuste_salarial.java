import java.util.Scanner;
 /**
 *Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário.
 * @author Arthur
 */

 public class Reajuste_salarial {

    public static void main(String args[]) {
        
        Scanner buffer = new Scanner(System.in);

        double salario, ajuste;

        System.out.println("Digite o salário e o reajuste:");
        salario=buffer.nextDouble();
        ajuste=buffer.nextDouble();

        System.out.println("Teu salário final será: R$"+((ajuste/100*salario)+salario));

    }
    

 }
