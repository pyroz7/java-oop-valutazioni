package org.student.lesson;

import java.util.ArrayList;
import java.util.List;

public class Corso {
    private List<Studente> studenti;

    public Corso() {
        this.studenti = new ArrayList<>();
    }

    public void aggiungiStudente(Studente studente) {
        studenti.add(studente);
    }

    public void rimuoviStudente(Studente studente) {
        studenti.remove(studente);
    }

    public void mostraElencoStudenti() {
        System.out.println("Elenco degli studenti:");
        for (Studente studente : studenti) {
            System.out.println("ID: " + studente.getId() +
                    ", Assenze: " + studente.getPercentualeAssenze() +
                    ", Media Voti: " + studente.getMediaVoti() +
                    ", Stato: " + (studente.isPromosso() ? "Promosso" : "Bocciato"));
        }
    }

    public double percentualePromossi() {
        long promossi = studenti.stream().filter(Studente::isPromosso).count();
        return (double) promossi / studenti.size() * 100;
    }
}

