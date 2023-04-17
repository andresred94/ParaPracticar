package PracticaVehiculos;

public class Iveco extends Bus implements Vehiculo {
    //atributos de la clase
    private String modelo = "Daily";
    private int ruedas = 6;
    private String combustible = "diesel";
    private String marca = "Iveco";
    private String vehiculo = "bus";

    // Metodos setter y getter

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

    //metodos normales
    public void presentacionVehiculo() {
        System.out.println("soy un "+vehiculo+" de la marca "+marca+" del modelo "+modelo);
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

    //Metodos de la clase abstracta Bus
    @Override
    public void seisRuedas() {
        super.seisRuedas();
    }
    @Override
    public void cantidadFaros() {
        super.cantidadFaros();
    }

    //metodos de la interfaz Vehiculo
    @Override
    public void tipoVehiculo() {
        System.out.println("Transporta pasajeros?");
    }
    @Override
    public void cantidadRuedas() {
        System.out.println("Suele tener seis ruedas?");
    }
    @Override
    public void tipoCombustible() {
        System.out.println("Contamina con diesel?");
    }

}
