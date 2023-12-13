package org.student.lesson;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Corso corso = new Corso();
        Random random = new Random();

        // Aggiungi un numero casuale di studenti tra 10 e 20
        int numeroStudenti = random.nextInt(11) + 10;

        for (int i = 1; i <= numeroStudenti; i++) {
            int percentualeAssenze = random.nextInt(101);
            double mediaVoti = random.nextDouble() * 5;
            Studente studente = new Studente(i, percentualeAssenze, mediaVoti);
            corso.aggiungiStudente(studente);
        }

        // Mostra l'elenco degli studenti
        corso.mostraElencoStudenti();

        // Mostra la percentuale di studenti promossi
        System.out.println("Percentuale studenti promossi: " + corso.percentualePromossi() + "%");
    }
}

