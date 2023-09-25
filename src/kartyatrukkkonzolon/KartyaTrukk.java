package kartyatrukkkonzolon;

import java.util.Scanner;

public final class KartyaTrukk {

    private static final Scanner sc = new Scanner(System.in);
    private final Pakli pakli = new Pakli();
    
    public KartyaTrukk() {
        indit();
    }

    void indit() {
        for (int ix = 0; ix < 3; ix++) {
            pakli.kirak();
            int oszlop = melyik();
            pakli.kever(oszlop);
        }
        pakli.ezVolt();
    }

    private static int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
}
