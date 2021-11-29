import java.util.Scanner;
/**
 * @author Arthur Mesquita Rocha
 * Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.
 */
public class Comissao_vendedor {
    public static void main(String[] args) {
        Salario();
    }

    public static void Salario(){
        Scanner vendedor= new Scanner(System.in);

        int n_carro_vendidos;
        double valor_total_vend,salario,comissao;

        System.out.println("Digite o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido, respectivamente: ");
        n_carro_vendidos=vendedor.nextInt();
        valor_total_vend=vendedor.nextDouble();
        salario=vendedor.nextDouble();
        comissao=vendedor.nextDouble();

        System.out.println("O salário final será: R$"+(salario+(comissao*n_carro_vendidos)+(0.05*valor_total_vend)));

    }
}
