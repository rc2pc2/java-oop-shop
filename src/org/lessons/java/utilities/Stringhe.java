package org.lessons.java.utilities;

public class Stringhe {
    
    public String sostituisciTutteLeOccorrenze(String stringaDaModificare, char carattereDaSostituire, char carattereSostituente){
        
        StringBuilder stringBuilder = new StringBuilder(stringaDaModificare);

        // @ ciclo per ogni carattere
        for (int i = 0; i < stringaDaModificare.length(); i++){
            // & in base al carattere da sostituire
            if (stringaDaModificare.charAt(i) == carattereDaSostituire ){
                stringBuilder.setCharAt(i, carattereSostituente);
            }
        }
        
        return stringBuilder.toString();
    }
}
