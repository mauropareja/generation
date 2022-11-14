package Factura;

public class Factura {

    String Numero;
    String Descripcion;
    int cantCompraArticulo;
    double precio;

    public Factura(String numero, String descripcion, int cantCompraArticulo, double precio) {
        this.Numero = numero;
        this.Descripcion = descripcion;
        this.cantCompraArticulo = cantCompraArticulo;
        this.precio = precio;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getCantCompraArticulo() {
        return cantCompraArticulo;
    }

    public void setCantCompraArticulo(int cantCompraArticulo) {
        this.cantCompraArticulo = cantCompraArticulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotalFactura() {

        if (this.precio >= 0) {
            double valor = this.precio * (double)this.cantCompraArticulo;

            if (valor >= 0) {
                return valor;
            } else {
                valor = 0;
            }
            return valor;
        } else {
            setPrecio(0.0);
        }
        return 0;
    }
}