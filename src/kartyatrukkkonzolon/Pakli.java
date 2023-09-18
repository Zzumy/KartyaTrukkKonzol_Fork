package kartyatrukkkonzolon;

public class Pakli {

    private Kartya[] kartyak;

    public Pakli() {
        kartyak = new Kartya[22];
        feltolt();
    }

    public void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length && i < kartyak.length; e++) {
                kartyak[i++] = new Kartya(szin + "_" + ertekek[e]);
            }
        }
    }

    public void kirak() {
        for (int i = 1; i < kartyak.length; i++) {
            System.out.printf("%-8s", kartyak[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }

    public void kever(int oszlop) {
        Kartya[] ujPakli = new Kartya[22];
        switch (oszlop) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = kartyak[20 - (i - 1) * 3];
                    ujPakli[i + 7] = kartyak[19 - (i - 1) * 3];
                    ujPakli[i + 14] = kartyak[21 - (i - 1) * 3];
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = kartyak[19 - (i - 1) * 3];
                    ujPakli[i + 7] = kartyak[20 - (i - 1) * 3];
                    ujPakli[i + 14] = kartyak[21 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = kartyak[19 - (i - 1) * 3];
                    ujPakli[i + 7] = kartyak[21 - (i - 1) * 3];
                    ujPakli[i + 14] = kartyak[20 - (i - 1) * 3];
                }
                break;
        }
        kartyak = ujPakli;
    }

    public void ezVolt() {
        System.out.println("A választott lap: " + kartyak[11]);
    }

}
