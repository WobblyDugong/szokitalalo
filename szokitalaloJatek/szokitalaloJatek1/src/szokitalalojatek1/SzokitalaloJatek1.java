/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package szokitalalojatek1;

/**
 *
 * @author Péter
 */
public class SzokitalaloJatek1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jobetuE();
    }

    private static void jobetuE() {
        String tipp = "ab";
        String szo = "aa";
        char[] tippDarabolt = tipp.toCharArray();
        char[] szoDarabolt = szo.toCharArray();
        char[] joBetuk = new char[2];
        char[] rosszBetuk = new char[2];
        System.out.println("jobetük:"+joBetuk.length);
        //String darabolt1 = darabolt[0], darabolt2 = darabolt[1];
        int index = 0;
        while (index < tippDarabolt.length) {
            int kindex = 0;
            while (kindex < szoDarabolt.length && !(tippDarabolt[index] == szoDarabolt[kindex])) {
                kindex++;
            }
            boolean talalt = kindex < szoDarabolt.length;
            if (talalt) {
                joBetuk[index] = tippDarabolt[index];
            } else {
                rosszBetuk[index] = tippDarabolt[index];
            }
            index++;
        }

        //boolean talalt = index < karakterek.length;
        //System.out.println(talalt);
        System.out.println("Jó betűk: ");
        for (int i = 0; i < joBetuk.length; i++) {
            System.out.println(joBetuk[i]);
        }
        System.out.println("Rossz betűk:");
        for (int i = 0; i < rosszBetuk.length; i++) {
            System.out.println(rosszBetuk[i]);
        }
        
        
        
        
    }

}
