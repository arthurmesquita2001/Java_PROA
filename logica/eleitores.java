import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.SynthScrollBarUI;
public class eleitores {
    public static void main(String[] args) {
        Total_votos();
    }

    public static void Total_votos(){
        Scanner buffer = new Scanner (System.in);
        double eleitores,nulos,brancos,validos;

        System.out.println("Digite o total de votos");
        eleitores=buffer.nextDouble();
        System.out.println("Digite o total de votos nulos");
        nulos=buffer.nextDouble();
        System.out.println("Digite o total de votos brancos");
        brancos=buffer.nextDouble();

        validos=eleitores-(nulos+brancos);
        System.out.println("Porcentagem de válidos: "+(validos*100/eleitores)+"%");
        System.out.println("Porcentagem de nulos: "+(nulos*100/eleitores)+"%");
        System.out.println("Porcentagem de válidos: "+(brancos*100/eleitores)+"%");



        
    }
}
