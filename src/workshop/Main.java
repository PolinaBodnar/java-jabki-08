package workshop;
import workshop.payment.CreditCardPayment;
import workshop.playable.Playable;
import workshop.playable.Song;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        CreditCardPayment payment = new CreditCardPayment(BigDecimal.TEN);
        payment.validate();
        payment.process();
        payment.complete();


        Song song = new Song("Песня про лето");
        song.play();

        Playable playable = new Song("Песня про весну!");
        playable.play();

        List<String> list = new ArrayList<>();
    }
}