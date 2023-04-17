package PracticaVehiculos;
import java.util.Scanner;
public class Mercedez extends Moto implements Vehiculo{
    //atributos de la clase
    private String modelo = "AK-47";
    private int ruedas = 2;
    private String combustible = "gasolina";
    private String marca = "Mercedez";
    private String vehiculo = "moto";

    // Metodos Setter y Getter
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getRuedas() {
        return ruedas;
    }
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public String getCombustible() {
        return combustible;
    }
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    // metodos normales
    public void presentacionVehiculo() {
        System.out.println("soy una "+vehiculo+" de la marca "+marca+" del modelo "+modelo);
    }
    public void tipoDvehiculo(){
        System.out.println("un vehiculo de "+ruedas+" ruedas ["+vehiculo+"]");
    }
    public void cantidadDruedas(){
        System.out.println("y tengo "+ruedas+" ruedas.");
    }
    public void tipoDcombustible(){
        System.out.println("funciono con "+combustible);
    }


    //Metodos de la clase abstracta Moto

    @Override
    public void dosRuedas() {
        super.dosRuedas();
    }
    @Override
    public void cantidadFaros() {
        super.cantidadFaros();
    }

    //ToDo estos metodos de la interfaz son obligatorios todos?
    //Metodos de la interfaz Vehiculo
    @Override
    public void tipoVehiculo() {
        System.out.println("Es una moto?");
    }
    @Override
    public void cantidadRuedas(){
        System.out.println("Tiene dos ruedas?");
    }
    @Override
    public void tipoCombustible() {
        System.out.println("Contamina con gasolina?");
    }

}
