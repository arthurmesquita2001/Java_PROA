package repeticao_do_while;
/**
 * @author Arthur Mesquita Rocha
 * Elaborar um programa que efetue o cálculo e no final apresente o somatório do número de grãos de
//trigo que se pode obter num tabuleiro de xadrez, obedecendo à seguinte regra: colocar um grão de
//trigo no primeiro quadro e nos quadros seguintes o dobro do quadro anterior. Ou seja, no primeiro
//quadro coloca-se 1 grão, no segundo quadro colocam-se 2 grãos (neste momento têm-se 3 grãos),
//no terceiro quadro colocam-se 4 grãos (tendo neste momento 7 grãos), no quarto colocam-se 8
//grãos (tendo-se então 15 grãos) até atingir o sexagésimo quarto (64o
//) quadro. Utilize variáveis do
//tipo real como acumuladores.
 */
public class d {
    public static void main(String[] args) {
        graos_trigo();
    }
    public static void graos_trigo(){
        int cont = 0;
        double  acumulador = 0.0;

do {
    acumulador = acumulador + Math.pow(2, cont);
    cont++;
}
while (cont <= 64);

System.out.println("O valor é: " + acumulador);
    }
    
}
