public class Onibus {
    private int numDeAcentos;
    private String placa;
    private String marca;
    private boolean circulando;

    public Onibus(int numDeAcentos, String placa, String marca) {
        this.numDeAcentos = numDeAcentos;
        this.placa = placa;
        this.marca = marca;
        this.circulando = false;
    }

    public void iniciarItinerario() {
        this.circulando = true;
        System.out.println("O ônibus iniciou seu trajeto.");
    }

    public void terminarItinerario() {
        if (circulando) {
            System.out.println("O ônibus chegou ao terminal.");
            circulando = false;
        } else {
            System.out.println("O onibus ainda não iniciou seu trajeto");
        }
    }

    public int getNumDeAcentos() {
        return numDeAcentos;
    }

    public void setNumDeAcentos(int numDeAcentos) {
        this.numDeAcentos = numDeAcentos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isCirculando() {
        return circulando;
    }
}
