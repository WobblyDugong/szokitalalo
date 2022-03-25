package szokitalalojatek1;

import java.util.Random;
import java.util.Scanner;

public class SzokitalaloJatek1 {

    public static void main(String[] args) {
        String szo = gondoltszo();
        String tipp = tippeltszo(szo);
        // jobetuE(szo, tipp);
    }

    static void jobetuE(String szo, String tipp) {

        char[] tippDarabolt = tipp.toCharArray();
        char[] szoDarabolt = szo.toCharArray();
        char[] joBetuk = new char[2];
        char[] rosszBetuk = new char[2];
        //char[] joHelyenVannak = new char[2];
        //String darabolt1 = darabolt[0], darabolt2 = darabolt[1];
        //System.out.println("jobetük:" + joBetuk.length);
        // String darabolt1 = darabolt[0], darabolt2 = darabolt[1];
        int index = 0;
        int joBetuIndex = 0;
        int rosszBetuIndex = 0;
        //int joHelyenVannakIndex = 0;

        while (index < tippDarabolt.length) {
            int kindex = 0;
            while (kindex < szoDarabolt.length && !(tippDarabolt[index] == szoDarabolt[kindex])) {
                kindex++;
            }
            boolean talalt = kindex < szoDarabolt.length;
            boolean joHelyenVan = index == kindex && talalt;
            if (talalt) {
                joBetuk[index/*joBetuk.length+joBetuIndex-2*/] = tippDarabolt[index];
                //joBetuIndex++;
            } else {
                rosszBetuk[rosszBetuk.length + rosszBetuIndex - 2] = tippDarabolt[index];
                rosszBetuIndex++;
            }

            /*if (talalt) {
                for (int i = 0; i < tippDarabolt.length && !(tippDarabolt[i] == szoDarabolt[index]); i++) {
                    System.out.println(i);
                }
              
                /*joHelyenVannak[joHelyenVannak.length+joHelyenVannakIndex-2] = tippDarabolt[index];
                joHelyenVannakIndex++;
            }*/
            index++;
        }

        // boolean talalt = index < karakterek.length;
        // System.out.println(talalt);
        System.out.println("Jó betűk: ");
        for (int i = 0; i < joBetuk.length; i++) {
            System.out.println(joBetuk[i]);
        }

        /*System.out.println("Jó helyen van:");
        for (int i = 0; i < joHelyenVannak.length; i++) {
            System.out.println(joHelyenVannak);

        }*/
        System.out.println("Rossz betűk:");
        for (int i = 0; i < rosszBetuk.length; i++) {
            System.out.println(rosszBetuk[i]);
        }
    }

    public static String gondoltszo() {
        String gondoltszo = "";
        String[] szavak = {"az", "lo", "so"};
        Random rnd = new Random();
        int also = 0, felso = 2;
        gondoltszo = szavak[rnd.nextInt(felso - also + 1) + also];
        System.out.println(gondoltszo);
        return gondoltszo;
    }

    public static String tippeltszo(String szo) {
        String tipp = "";
        boolean tippJo = false;
        do {
            Scanner beker = new Scanner(System.in);
            System.out.println("Adja meg a tippjét: ");
            tipp = beker.nextLine();
            tippJo = tipp.matches("ő") && tipp.matches("ű") && tipp.matches("ó");
        } while (!tipp.matches("[a-zA-Z]+") && tippJo || tipp.length() != szo.length());
        return tipp;
    }
}
