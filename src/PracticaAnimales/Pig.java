package PracticaAnimales;

// Pig "implements" the Animal interface
class Pig implements Animals {
    //Métodos implementados de la interfaz Animals
    public void cuantasPatas() {
        // Metodo de la interfaz "Animals"
        System.out.println("Tengo 4 patas");
    }
    public void onoMatopeya() {
        // cuerpo del metodo de la interfaz Animals
        System.out.println("oink oink");
    }
}
