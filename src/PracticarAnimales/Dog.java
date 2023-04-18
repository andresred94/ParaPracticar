package PracticarAnimales;
class Dog extends Animal {
    /**********************************
     * metodos propios de la clae Dog *
     **********************************/
    public void onoMatopeya(){
        System.out.println("Guauf!!!!");
    }
    /*****************************************
     * metodos abstractos de la clase Animal *
     *****************************************/
    public void animalSound() {
        System.out.println("sonido - Perro");
    }

    /************************************************
     * metodos implementados de la interfaz Animals *
     ************************************************/
    public void cuantassPatas(){
        System.out.println("Tengo cuatro patas");
    }

}
