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
        String tipp = "őr";
        String szo = "őr";
        char[] tippDarabolt = tipp.toCharArray();
        char[] szoDarabolt = szo.toCharArray();
        char[] joBetuk = new char[2];
        char[] rosszBetuk = new char[2];
        //char[] joHelyenVannak = new char[2];
        //String darabolt1 = darabolt[0], darabolt2 = darabolt[1];
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
                rosszBetuk[rosszBetuk.length+rosszBetuIndex-2] = tippDarabolt[index];
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
        
        

        //boolean talalt = index < karakterek.length;
        //System.out.println(talalt);
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

}
