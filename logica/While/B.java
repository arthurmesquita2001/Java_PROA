package while_repeticao;


/**
 * @author Arthur Mesquita Rocha
 * Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).
 */

public class B {
    public static void main(String[] args) {
        Soma_ceminteiros();
    }
    public static void Soma_ceminteiros(){

        int x=0,i=1;

        while(i<=100){
            x+=i;
            i++;
        }
        System.out.println(" A soma dos 100 primeiros num inteiros é "+x);
    }
}

