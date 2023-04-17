package PracticaPerson;
import java.util.Scanner;
public class Person {
    //Herramientas
    static Scanner sc = new Scanner(System.in);
    //atrributos
    private String name;
    private String apellido;
    private String apellido2;
    private String colorPiel;
    private String ciudad;
    private String pais;
    private int edad;
    private int altura;


    // Getter
    public String getName() { return name; }
    public String getApellido(){ return apellido; }
    public String getApellido2(){ return apellido2; }
    public String getColorPiel(){ return colorPiel; }
    public String getCiudad(){ return ciudad; }
    public String getPais(){ return pais; }
    public int getEdad(){ return edad; }
    public int getAltura(){ return altura; }

    // Setter
    public void setName(String newName) { this.name = newName; }
    public void setApellido(String newApellido){ this.apellido = newApellido; }
    public void setApellido2(String newApellido2){ this.apellido2 = newApellido2; }
    public void setColorPiel(String newColorPiel){ this.colorPiel = newColorPiel; }
    public void setCiudad(String newCiudad){ this.ciudad = newCiudad; }
    public void setPais(String newPais){ this.pais = newPais; }
    public void setEdad(int newEdad){ this.edad = newEdad; }
    public void setAltura(int newAltura){ this.altura = newAltura; }


    //metodos
    /**
     * Metodo que solicita un nombre que lee por teclado y lo establece a la variable
     * @Noparam
     */
    public void ingresarNombre(){
        System.out.println("Ingresa un nombre");
        String nomP = sc.nextLine();
        setName(nomP);
    }
    /**
     * Metodo que solicita un apellido que lee por teclado y lo establece a la
     * variable
     * @Noparam
     */
    public void ingresaApellido(){
        System.out.println("Ingresa un apellido");
        String ape = sc.nextLine();
        setApellido(ape);
    }
    /**
     * Metodo que muestra el nombre que se ha ingresado
     */
    public void muestraNombre (){
        String nom = getName();
        System.out.println("El nombre ingresado es: "+nom);
    }
    /**
     * Metodo que muestra el apellido que se ha ingresado
     */
    public void muestraApellido (){
        String ape = getApellido();
        System.out.println("El apellido ingresado es: "+ape);
    }

}




