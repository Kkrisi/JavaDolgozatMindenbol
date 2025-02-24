package hu.szamalk.modell;

import java.io.*;
import java.util.*;

public class Gyujtemeny {
    private int ferohely = 5;
    private static final String FAJL_NEV = "adatok.bin";
    private Media media;
    private Media[] mediak;

    public Gyujtemeny(int ferohely, Media media, Media[] mediak) {
        this.ferohely = ferohely;
        this.media = media;
        this.mediak = mediak;
    }

    public int getFerohely() {
        return ferohely;
    }

    public void setFerohely(int ferohely) {
        this.ferohely = ferohely;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public Media[] getMediak() {
        return mediak;
    }

    public void setMediak(Media[] mediak) {
        this.mediak = mediak;
    }

    public void eladas(){
        // ...
        this.ferohely += 1;
    }

    public void vasarlas(){
        // ...
        this.ferohely -= 1;
    }


    public void mediaHashSet() {
        HashSet<Media> mediaSet = new HashSet<>();
        mediaSet.add(new Media1(1001, 4000, Regiseg));
        mediaSet.add(new Media2(1002, 3000, BestSeller));

        System.out.println("\nHashSet-ben lévő médiák:");
        for (Media m : mediaSet) {
            System.out.println(m);
        }
    }

    public void mediaHashSet() {
        HashMap<String, Media> mediaMap = new HashMap<>();
        mediaMap.put("Harry potter", new Media1(200, 6500, BestSeller));
        mediaMap.put("Tronok harca", new Media2(201, 6000, BestSeller));

        System.out.println("\nHashMap-ben lévő mediák:");
        for (String kulcs : mediaMap.keySet()) {
            System.out.println(kulcs + " - " + mediaMap.get(kulcs));
        }
    }




    @Override
    public String toString() {
        return "Gyujtemeny{" +
                "ferohely=" + ferohely +
                ", media=" + media +
                '}';
    }
}
