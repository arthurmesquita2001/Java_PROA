package while_repeticao;
/**
 * @author
 * Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
//1 até 500.
 */
public class C {

    public static void main(String[] args) {
        Soma_valores_pares_quinhentos();
    }
    public static void Soma_valores_pares_quinhentos(){
        int x=0,i=1;

        while(i<=500){
            
            if(i%2==0){
                x+=i;
            }
            i++;
        }
        System.out.println(" A soma dos 500 primeiros num pares é "+x);
    }
}

