package while_repeticao;
/**
 * @author Arthur Mesquita Rocha
 * Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de
//10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O
//programa deve apresentar os valores das duas temperaturas. A fórmula de conversão
//é 9C+160/5=F , sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
 */

public class H {
    public static void main(String[] args) {
        temperatura();
    }
    public static void temperatura(){
        int cont=0;

        while(cont<=100){
            System.out.println(cont+" °C = "+((9*cont+160)/5)+" °F");
            cont+=10;
        }
    }
}
