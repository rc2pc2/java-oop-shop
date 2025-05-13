package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di prodotti che vuoi creare:");
        int numeroProdottiDaAggiungere = Integer.parseInt(scanner.nextLine());

        if (numeroProdottiDaAggiungere > 5){
            numeroProdottiDaAggiungere = 5;
        }

        Prodotto[] prodotti = new Prodotto[numeroProdottiDaAggiungere];

        for (int i = 0; i < prodotti.length ; i++) {
            System.out.println("Inserisci il nome del prodotto che vuoi inserire:");
            String nomeProdotto = scanner.nextLine();
            
            System.out.println("Inserisci la descrizione del prodotto che vuoi inserire:");
            String descrizioneProdotto = scanner.nextLine();
            
            System.out.println("Inserisci il prezzo del prodotto che vuoi inserire:");
            BigDecimal prezzoProdotto = new BigDecimal(Float.parseFloat(scanner.nextLine()));

            System.out.println("Quale tipo di prodotto vuoi inserire?");
            System.out.println("Seleziona a scelta tra smartphone, tv, cuffie");
            String selezioneUtente = scanner.nextLine().trim().toLowerCase();

            switch (selezioneUtente) {
                case "tv":
                    System.out.println("Inserisci i pollici di questa televisione");
                    int pollici = Integer.parseInt(scanner.nextLine());

                    System.out.println("Inserisci i pollici di questa televisione");
                    boolean smart = Boolean.parseBoolean(scanner.nextLine());
                    
                    Televisore nuovaTv = new Televisore(nomeProdotto, selezioneUtente, prezzoProdotto, pollici, smart);
                    prodotti[i] = nuovaTv;
                    break;

                case "smartphone":
                    System.out.println("Inserisci il codice imei di questo smartphone");
                    String codiceImei = scanner.nextLine().toUpperCase();

                    System.out.println("Inserisci le dimensioni della memoria di questo smartphone");
                    int dimensioni = Integer.parseInt(scanner.nextLine());
                
                    Smartphone nuovoSmartphone = new Smartphone(nomeProdotto, selezioneUtente, prezzoProdotto, codiceImei, dimensioni);
                    prodotti[i] = nuovoSmartphone;
                    break;

                    
                case "cuffie":
                    System.out.println("Inserisci il colore delle cuffie");
                    String colore = scanner.nextLine();

                    System.out.println("Inserisci se queste cuffie sono wireless");
                    boolean wireless = Boolean.parseBoolean(scanner.nextLine());
                
                    Cuffie nuoveCuffie = new Cuffie(nomeProdotto, selezioneUtente, prezzoProdotto, colore, wireless);
                    prodotti[i] = nuoveCuffie;
                    break;
                    
                default:
                    prodotti[i] = new Prodotto(nomeProdotto, descrizioneProdotto, prezzoProdotto);
                    break;
            }
        }
        scanner.close();

        System.out.println("Contenuto del carrello:");
        for (Prodotto prodotto : prodotti) {
            System.out.println(prodotto);
            System.out.println("_____________________");
        }
    }
}
