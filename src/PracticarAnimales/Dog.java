package PracticarAnimales;

/**
 * En una clase normal si queres importar metodos de otras case tenemos que indicarlos
 * despues de la palabra "extends" que significa que puede o debe importar todos los
 * métodos de la clase abstracta, al menos uno que sea abstracto.
 * Los métodos de la clase abstracta no tienen cuerpo, es decir que no tienen llave
 * por lo tanto podemos definir el cuerpo en otra clase, en este ejemplo de codigo,
 * el método onoMatopeya() es un método a la vez abstracto de la clase Animal, por lo
 * tanto podemos definir el sonido que queramos que haga cada animal, en este caso
 * un perro.
 */

class Dog extends Animal {
    public void onoMatopeya(){
        System.out.println("Wow!!");
    }
    public void animalSound() {
        System.out.println("sonido - Perro");
    }

    public void cuantasPatas(){
        System.out.println("Tengo 4 patas");
    }

}
