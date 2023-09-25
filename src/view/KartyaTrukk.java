package view;

import java.util.Scanner;
import model.Pakli;

public final class KartyaTrukk {

    private static final Scanner sc = new Scanner(System.in);
    private final Pakli pakli = new Pakli();

    public KartyaTrukk() {
        indit();
    }

    void indit() {
        for (int ix = 0; ix < 3; ix++) {
            kirak();
            int oszlop = melyik();
            pakli.kever(oszlop);
        }
        System.out.println(pakli.ezVolt().getLeiras());
    }

    private static int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("\n\rMelyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            System.out.println("");
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }

    public void kirak() {
        for (int i = 1; i < pakli.getKartyak().length; i++) {
            System.out.printf("%-8s", pakli.getKartyak()[i].getLeiras());
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }

}
