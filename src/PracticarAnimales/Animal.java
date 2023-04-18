package PracticarAnimales;

abstract class Animal {
    /*************************************************
     * métodos normales de la clase abstracta Animal *
     *************************************************/
    public void sleep() {
        System.out.println("Zzz-Animal");
    }
    public void comiendo() {
        System.out.println("Animal-comiendo");
    }

    /***************************************************
     * metodos abstractos de la clase abstracta Animal *
     ***************************************************/
    public abstract void animalSound();

}
