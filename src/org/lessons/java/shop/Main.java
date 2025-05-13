package org.lessons.java.shop;

import java.math.BigDecimal;
public class Main {

    public static void main(String[] args) {
        Prodotto pallone = new Prodotto("Pallone da volley","Pallone da volley superleggero, si muove col vento", new BigDecimal(15.125120f), new BigDecimal(0.22f));
        System.out.println(pallone); //# invoca in automatico il metodo toString();

        Smartphone twoPlus = new Smartphone("Smartphone Twwo Plus NN", "Two plus", new BigDecimal(999.99), "20D9UIBW981NBJIDH98", 32);
        System.out.println(twoPlus);

        Cuffie bonySmart = new Cuffie("Cuffie Bony Smart", "Bony", new BigDecimal(299.99), "Bianco", true);
        System.out.println(bonySmart);

        Televisore milips = new Televisore("Milips Al plasma", "Milips", new BigDecimal(1999.99), 59, false);
        System.out.println(milips);


        // Stringhe stringheHelper = new Stringhe();
        // System.out.println(stringheHelper.sostituisciTutteLeOccorrenze("ciao sono una frase piena di a e di e", 'a', 'x'));

    }
}
