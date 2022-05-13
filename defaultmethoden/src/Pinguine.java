public class Pinguine {

    public interface Vogel {
        default void schwimmt() {
            System.out.println("Ich fliege. Schwimmen ist für Pinguine!");
        }
    }

    public interface Seevogel extends Vogel {
        default void schwimmt() {
            System.out.println("Ich paddle vor mich hin.");
        }
    }

    public interface Grosspinguine extends Vogel, Seevogel {
        default void schwimmt() {
            System.out.println("Ich tauche gern.");
        }
    }

    public static class Pinguin implements Vogel {}

    public static class Kaiserpinguin extends Pinguin implements Vogel, Seevogel, Grosspinguine {}
}
