public class Application {
    public static void main(String[] args) {
        Onibus onibus = new Onibus(44,"JLW-4193","Scania");

        onibus.iniciarItinerario();
        onibus.terminarItinerario();
    }
}
