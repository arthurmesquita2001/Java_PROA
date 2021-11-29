package while_repeticao;

/**
 * @author
 Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar
//se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução
//se, perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo.
 */

public class D {
    public static void main(String[] args) {
           valores_impares();
    }
    public static void valores_impares(){
        int n=1;

        while(n<=20){
            if(n%2==1){
            System.out.println(n);
            }
            n++;
        }
    }
}
