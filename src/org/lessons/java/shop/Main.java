package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.lessons.java.utilities.Stringhe;

public class Main {

    public static void main(String[] args) {
        Prodotto pallone = new Prodotto("Pallone da volley","Pallone da volley superleggero, si muove col vento", 
                                new BigDecimal(15.125120f), new BigDecimal(0.22f));
        System.out.println(pallone.getPrezzoBase().setScale(2, RoundingMode.UP));
        System.out.println(pallone.getPrezzoConIva().setScale(2, RoundingMode.DOWN));
        System.out.println(pallone.getNomeEsteso());

        Stringhe stringheHelper = new Stringhe();
        System.out.println(stringheHelper.sostituisciTutteLeOccorrenze("ciao sono una frase piena di a e di e", 'a', 'x'));

    }
}
