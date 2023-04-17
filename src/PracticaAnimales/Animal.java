package PracticaAnimales;

abstract class Animal {
    /**
     * En una clase abstracta, definimos dos tipos de metodos que pueden ser
     * metodos abstractos es decir que no tienen cuerpo o no tienen llaves,
     * ademas se definen con la palabra "abstract".
     * Por ultimo tenemos los metodos normales los cuales podemos indicar un
     * cuerpo dentro del metodo que podra ser utilizado
     */
    //metodos abstracts de una clase abstracta
    public abstract void animalSound();


    //métodos normales de una clase abstracta
    public void sleep() {
        System.out.println("Zzz-Animal");
    }
    public void comiendo() {
        System.out.println("Animal-comiendo");
    }

}
