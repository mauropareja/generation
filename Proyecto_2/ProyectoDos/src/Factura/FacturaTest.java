package Factura;


public class FacturaTest {

    public static void main(String[] args) {
       Factura factura = new Factura("00", "medias",4, -5.700);

       System.out.println("la factura es: " +factura.getTotalFactura());

    }
}
