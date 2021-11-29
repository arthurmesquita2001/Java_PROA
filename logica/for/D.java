package for_repeticao;
/**
 * @author
 * Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
//1 até 500.
 */
public class D {
    
    public static void main(String[] args) {
        Soma_valores_pares_quinhentos();
    }
    public static void Soma_valores_pares_quinhentos(){
        int x=0,i=1;

        for(i=1;i<=500;i++){
            
            if(i%2==0){
                x+=i;
            }
        }
        System.out.println(" A soma dos 500 primeiros num pares é "+x);
    }
}


