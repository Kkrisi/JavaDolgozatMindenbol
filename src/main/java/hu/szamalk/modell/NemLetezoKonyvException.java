package hu.szamalk.modell;

public class NemLetezoKonyvException extends Throwable {
    public static void main(String[] args) {
        String message = "A könyv címe hosszab mint 6 betű";
        super(message);
    }
}
