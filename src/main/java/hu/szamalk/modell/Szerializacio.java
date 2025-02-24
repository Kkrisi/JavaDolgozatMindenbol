package hu.szamalk.modell;

import java.io.*;
import java.util.Arrays;

public class Szerializacio {
    private static final String FAJL_NEV = "adatok.txt";
    private Media media;
    private Media[] mediak;

    public Szerializacio() {
        media = new Media(11, 4500, BestSeller);
        mediak = new Media[5];
        mediak[0] = media;
        mediak[1] = new Media(22, 2300, Regiseg);

        szerializacio();
        deszerializacio();
    }

    private void szerializacio() {
        try (ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream(FAJL_NEV))){
            objKi.writeObject(media);
            objKi.writeObject(mediak);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void deszerializacio() {
        try(ObjectInputStream objBe = new ObjectInputStream(new FileInputStream(FAJL_NEV))){
            Media beMedia = (Media) objBe.readObject();
            Media[] beMediaTomb = (Media[]) objBe.readObject();
            System.out.println("A beolvasott értékek:");
            System.out.println("egy media: " + beMedia);
            System.out.println("a tömb: ");
            Arrays.asList(beMediaTomb).forEach(ember1 -> System.out.println(ember1));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
