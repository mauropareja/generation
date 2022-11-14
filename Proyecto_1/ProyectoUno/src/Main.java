public class Main {
    public static void main(String[] args)
    {
        Direccion direccion =new Direccion("Cra19 #24n","La loma","6400001");
        Propietario persona = new Propietario("Pedro","1","2",direccion);
        Marca marca = new Marca(2022,2021,123);
        Auto coche = new Auto(persona,marca);
        System.out.println( coche.caldularAutonomiaDeViaje());
        System.out.println( coche.mostrarVolumenCombustible());
        System.out.println( coche.cambioMarcha(1));
        System.out.println( coche.acelarion());
        System.out.println( coche.frenado());
        System.out.println( coche.reduceMarcha(5));
    }
}