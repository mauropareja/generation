public class Marca {
    private int numModelo;
    private  int anioLanzammiento;
    private int codIdentificador;

    public Marca(int numModelo, int anioLanzammiento, int codIdentificador) {
        this.numModelo = numModelo;
        this.anioLanzammiento = anioLanzammiento;
        this.codIdentificador = codIdentificador;
    }

    public int getNumModelo() {
        return numModelo;
    }

    public int getAnioLanzammiento() {
        return anioLanzammiento;
    }

    public int getCodIdentificador() {
        return codIdentificador;
    }

    public void setNumModelo(int numModelo) {
        this.numModelo = numModelo;
    }

    public void setAnioLanzammiento(int anioLanzammiento) {
        this.anioLanzammiento = anioLanzammiento;
    }

    public void setCodIdentificador(int codIdentificador) {
        this.codIdentificador = codIdentificador;
    }
}
