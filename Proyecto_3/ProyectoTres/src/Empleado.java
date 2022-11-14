import java.util.ArrayList;

public class Empleado {

    String nombre;
    String Apellido;
    double salarioMensual;

    ArrayList <Empleado> empleado ;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.Apellido = apellido;
        this.salarioMensual = salarioMensual * 12;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }

    //método para el incremento del salario
    public double Incremento(){

        double porcentaje = this.salarioMensual * 0.1;
        return this.salarioMensual + porcentaje;
    }
}
