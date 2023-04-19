package PracticaClasesAnidadas;

public class Main {
    public static void main(String[] args) {
        /**
        Instancia un objeto llamado "myInner" de la clase anidada "InnerClass"
        que se encuentra dentro de la clase "OuterClass"
         */
        OuterClass.InnerClass myInner;
        /**
        En la siguiente linea se le asigna al objeto creado anteriormente llamado
        "myInner" la clase llamada "InnerClass" que tiene sus atributos
         */
        myInner = new OuterClass.InnerClass();
        OuterClass myOuter = new OuterClass();
        /**
        Por ultimo en esta linea imprime el atributo que se encuentra dentro
        de la clase "InnerClass" que es la "y"
         */
        System.out.println(myInner.y);
        /**
         * En esta linea imprime el atributo X de la clase OuterClass
         */
        System.out.println(myOuter.x);
    }
}
