package hu.szamalk.modell;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.rmi.UnexpectedException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Konyv implements Cloneable, Serializable {
    private String cim;
    private String szerzo;
    private int kiadasiEv;

    public Konyv(String cim, String szerzo, int kiadasiEv) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.kiadasiEv = kiadasiEv;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public int getKiadasiEv() {
        return kiadasiEv;
    }

    public void setKiadasiEv(int kiadasiEv) {
        this.kiadasiEv = kiadasiEv;
    }



    public String egyformaEketKonyv(Konyv k1,Konyv k2){
        String szoveg;
        if (k1.cim == k2.cim && k1.szerzo == k2.szerzo){
            szoveg = "Egyezik a két könyv címe és szerzője.";
        } else {
            szoveg = "Nem egyezik a két könyv címe és szerzője.";
        }
        return szoveg;
    }


    public void cimAlapjanRendez(ArrayList lista){
        Collator collator = Collator.getInstance();
        Collections.sort(lista);
        System.out.println("Rendezett címek: " + lista);
    }



    public void szerzoAlapjanRendez(ArrayList lista){
        Collator collator = Collator.getInstance();
        Collections.sort(lista, collator);
        System.out.println("Rendezett szerzők: " + lista);
    }

    public void kiadasiEvAlapjanRendez(ArrayList lista){
        Comparator<Konyv> kiadasiEvComparator = (p1, p2) -> Integer.compare(p1.kiadasiEv, p2.kiadasiEv);
        Collections.sort(lista, kiadasiEvComparator);
        System.out.println("Rendezett kiadasiÉvek: " + lista);
    }


    public void nincs6betu(Konyv konyv) throws NemLetezoKonyvException {
        int hossz;
        if (konyv.cim.length() <= 6 ){
            System.out.println("6 betűből áll a könyv címe");
        } else {
            throw new NemLetezoKonyvException();
        }
    }





    @Override
    public String toString() {
        return "Konyv{" +
                "cim='" + cim + '\'' +
                ", szerzo='" + szerzo + '\'' +
                ", kiadasiEv=" + kiadasiEv +
                '}';
    }
}
