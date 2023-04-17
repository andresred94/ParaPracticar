package PracticaVehiculos;
import java.util.Scanner;
public class Audi extends Coche implements Vehiculo{
    //Atributos
    private String modelo = String.valueOf(Modelos.AUDIR8);
    private int ruedas = 4;
    private String combustible = "Diesel";
    //asignamos el String enum AUDI a la variable dentro de la clase Audi
    private String marca = String.valueOf(Marcas.AUDI);
    private String vehiculo = "coche";

    //metodos normales
    public void aceleracionMaxima() {
        System.out.println("Soy un "+vehiculo+" de la marca "+marca+" del modelo "+modelo);
    }
    public void tipoDvehiculo(){
        System.out.println("Un vehiculo de "+ruedas+" ruedas ["+vehiculo+"]");
    }
    public void cantidadDruedas(){
        System.out.println("y tengo "+ruedas+" ruedas.");
    }
    public void tipoDcombustible(){
        System.out.println("funciono con "+combustible);
    }

    //metodos de la clase abstracta Coche
    @Override
    public void cuatroRuedas() {
        super.cuatroRuedas();
    }
    @Override
    public void cantidadFaros() {
        super.cantidadFaros();
    }

    //metodos de la interfaz Vehiculo
    @Override
    public void tipoVehiculo() {
        System.out.println("Soy un coche?");
    }
    @Override
    public void cantidadRuedas() {
        System.out.println("Tengo 4 ruedas?");
    }
    @Override
    public void tipoCombustible() {
        System.out.println("Contamino con diesel?");
    }
}
