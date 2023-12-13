package org.student.lesson;

public class Studente {
    private int id;
    private int percentualeAssenze;
    private double mediaVoti;

    public Studente(int id, int percentualeAssenze, double mediaVoti) {
        this.id = id;
        this.percentualeAssenze = percentualeAssenze;
        this.mediaVoti = mediaVoti;
    }

    public int getId() {
        return id;
    }

    public int getPercentualeAssenze() {
        return percentualeAssenze;
    }

    public double getMediaVoti() {
        return mediaVoti;
    }

    public boolean isPromosso() {
        if (percentualeAssenze > 50) {
            return false;
        } else if (percentualeAssenze >= 25 && mediaVoti > 2) {
            return true;
        } else {
            return percentualeAssenze < 25 && mediaVoti >= 2;
        }
    }
}

