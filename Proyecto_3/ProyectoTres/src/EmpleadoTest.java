import java.util.ArrayList;

public class EmpleadoTest {


    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Pepito", "Suarez", 2500);
        Empleado empleado2 = new Empleado("Maria", "Linares", 5500);

        ArrayList<Empleado>lista = new ArrayList<Empleado>();
        lista.add(empleado1);
        lista.add(empleado2);
        //objeto
        Empleado empleado = new Empleado();
        empleado.setEmpleado(lista);

        System.out.println("El salario del  empleado1 anual sin incremento es: "+ empleado1.getSalarioMensual());
        System.out.println("El salario del  empleado2 anual sin incremento es: "+ empleado2.getSalarioMensual());

        System.out.println("El salario del  empleado1 anual con incremento del 10% es: " +empleado1.Incremento());
        System.out.println("El salario del  empleado2 anual con incremento del 10% es: " +empleado2.Incremento());

        System.out.println("Número de empleados hasta la fecha: " +empleado.getEmpleado().size());

    }
}