package CuentasBancarias;

public class Titular {
    //Atributos de la clase Titular
    private String DNI;
    private String nombre;
    private String apellido1;
    private String apellido2;

    //metodos Getter
    public String getDNI() {
        return DNI;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido2() {
        return apellido2;
    }
    public String getApellido1() {
        return apellido1;
    }

    //Metodos Setter
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    //metodos constructores
    public Titular(String DNI, String nombre, String apellido1, String apellido2) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }


    //Metodos generales


}
