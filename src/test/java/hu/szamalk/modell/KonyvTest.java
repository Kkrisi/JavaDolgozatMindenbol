package hu.szamalk.modell;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class KonyvTest {

    @org.junit.jupiter.api.Test
    void egyformaEketKonyv() {
        Konyv k1 = new Konyv("cim1", "sz1", 1978);
        Konyv k2 = new Konyv("cim2", "sz2", 2001);
        assertEquals(k1, k2);
    }

    @org.junit.jupiter.api.Test
    void cimAlapjanRendez(ArrayList<Konyv> cimekLista) {
        ArrayList<Konyv> cimekLista = new ArrayList<>();
        cimekLista.add(new Konyv("Kis Vakond", "sz2", 2001));
        cimekLista.add(new Konyv("Star Wars", "sz1", 1978));
        cimAlapjanRendez(cimekLista);
    }

    @org.junit.jupiter.api.Test
    void szerzoAlapjanRendez() {
        ArrayList<Konyv> szerzokLista = new ArrayList<>();
        szerzokLista.add(new Konyv("cim2", "Kis Pista", 2001));
        szerzokLista.add(new Konyv("cim1", "Nagy Áron", 1978));
        szerzoAlapjanRendez(szerzokLista);
    }

    @org.junit.jupiter.api.Test
    void kiadasiEvAlapjanRendez() {
        ArrayList<Konyv> kiadasiEvekLista = new ArrayList<>();
        kiadasiEvekLista.add(new Konyv("cim2", "sz2", 2001));
        kiadasiEvekLista.add(new Konyv("cim1", "sz1", 1978));
        kiadasiEvAlapjanRendez(kiadasiEvekLista);
    }

    @org.junit.jupiter.api.Test
    void nincs6betu() {
        Konyv k1 = new Konyv("cim1", "sz1", 1978);
        nincs6betu(k1);
    }

    @org.junit.jupiter.api.Test
    void ferohely() {

    }

    @org.junit.jupiter.api.Test
    void kivetel() {

    }

    @org.junit.jupiter.api.Test
    void getterNemSetter() {

    }
}



