package hu.szamalk.modell;

import java.io.Serializable;
import java.util.UUID;

public class Media implements Cloneable, Serializable {
    private UUID id;
    private int ar;
    private Kategorai kategoria;

    public Media(UUID id, int ar, Kategorai kategoria) {
        this.id = id;
        this.ar = ar;
        this.kategoria = kategoria;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public Kategorai getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategorai kategoria) {
        this.kategoria = kategoria;
    }

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", ar=" + ar +
                ", kategoria=" + kategoria +
                '}';
    }

    @Override
    public Media clone() throws CloneNotSupportedException{
        try {
            Media clone = (Media) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}


