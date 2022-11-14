import java.util.Date;

public class Propietario {

    private String nombre;
    private String CPF;
    private String RG;
    private Direccion direccion;
    private Date fechaNacimiento;
    private String expresar;
    private String completar;


    public Propietario(String nombre, String CPF, String RG, Direccion direccion) {
        this.nombre = nombre;
        this.CPF = CPF;
        this.RG = RG;
        this.direccion = direccion;
    }


}
