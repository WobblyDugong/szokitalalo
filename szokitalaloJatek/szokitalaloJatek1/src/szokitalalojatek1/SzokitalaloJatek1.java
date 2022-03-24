
package szokitalalojatek1;

import java.util.Random;
import java.util.Scanner;

public class SzokitalaloJatek1 {

    public static void main(String[] args) {
        String szo = gondoltszo();
        String tipp = tippeltszo();
        // jobetuE(szo);
    }

    static void jobetuE(String szo) {
        String tipp = "ab";
        szo = "aa";
        char[] tippDarabolt = tipp.toCharArray();
        char[] szoDarabolt = szo.toCharArray();
        char[] joBetuk = new char[2];
        char[] rosszBetuk = new char[2];
        System.out.println("jobetük:" + joBetuk.length);
        // String darabolt1 = darabolt[0], darabolt2 = darabolt[1];
        int index = 0;
        while (index < tippDarabolt.length) {
            int kindex = 0;
            while (kindex < szoDarabolt.length && !(tippDarabolt[index] == szoDarabolt[kindex])) {
                kindex++;
            }
            boolean talalt = kindex < szoDarabolt.length;
            if (talalt) {
                // joBetuk[index] = tiprivateppDarabolt[index];
            } else {
                rosszBetuk[index] = tippDarabolt[index];
            }
            index++;
        }

        // boolean talalt = index < karakterek.length;
        // System.out.println(talalt);
        System.out.println("Jó betűk: ");
        for (int i = 0; i < joBetuk.length; i++) {
            System.out.println(joBetuk[i]);
        }
        System.out.println("Rossz betűk:");
        for (int i = 0; i < rosszBetuk.length; i++) {
            System.out.println(rosszBetuk[i]);
        }
    }

    public static String gondoltszo() {
        String[] szavak = { "őz", "ló", "só" };
        Random rnd = new Random();
        int also = 0, felso = 2;
        String gondoltszo = szavak[rnd.nextInt(felso - also + 1) + also];
        return gondoltszo;
    }

    public static String tippeltszo() {
        Scanner beker = new Scanner(System.in);
        System.out.println("Adja meg a tippjét: ");
        String tipp = beker.nextLine();
        return tipp;
    }
}
