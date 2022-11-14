class Auto {

    private String modelo;
    private String color;
    private String anio;
    private Marca marca;
    private String chasis;
    private Propietario propietario;
    private int velocidadMax;
    private int velocidadActual;
    private String numPuerto;
    private boolean techoSolar;
    private int numMarcha;
    private boolean transAutomatic;

    public Auto(Propietario propietario, Marca marca) {
        this.propietario = propietario;
        this.marca = marca;
    }
    public Auto(){

    }

    public int acelarion(){
        this.velocidadActual++;
        return this.velocidadActual;
    }
    public int frenado(){
        this.velocidadActual = 0;
        return this.velocidadActual;
    }
    public int cambioMarcha(int numMarcha){
        this.numMarcha = numMarcha;
        if(!(this.numMarcha > 0 && this.numMarcha <=5)){
            return this.numMarcha;

        }
        return this.numMarcha;
    }

    public int reduceMarcha(int marchaActual){
        this.numMarcha = marchaActual;
        if(this.numMarcha <= 5  && this.numMarcha >=2){
            this.numMarcha --;
        }

        return this.numMarcha;
    }

    public String mostrarVolumenCombustible(){
        return "Full";
    }
    public String caldularAutonomiaDeViaje(){

        return "TanqueGasolina/km";
    }

}

