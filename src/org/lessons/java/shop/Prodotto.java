package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

import org.lessons.java.utilities.Stringhe;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;

    public Prodotto(String nome, String descrizione, BigDecimal prezzo){
        Random randomGenerator = new Random();
        this.codice = randomGenerator.nextInt(111111111, 999999999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = new BigDecimal(0.22f);
    }

    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva){
        Random randomGenerator = new Random();
        this.codice = randomGenerator.nextInt(111111111, 999999999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva; // .22
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescrizione(){
        return this.descrizione;
    }

    public BigDecimal getPrezzoBase(){
        return this.prezzo;
    }

    public BigDecimal getPrezzoConIva(){
        return this.prezzo.add(this.prezzo.multiply(this.iva));
    }

    public String getNomeEsteso(){
        return this.toString();
    }

    public String trasformaInTrattinato(String frase){
        Stringhe stringheUtility = new Stringhe();
        return stringheUtility.sostituisciTutteLeOccorrenze(frase, ' ', '-');
    }

    @Override
    public String toString(){
        return String.format("%s-%s", this.codice, this.trasformaInTrattinato(this.nome));
    }
}
