package EjerciciosColecciones.Listas.Ejercicio1;

public class Main {
    /*Crea un programa que lea una lista de números enteros desde
    teclado y los almacene en un ArrayList. A continuación, el
    programa deberá mostrar por pantalla el número de elementos
    de la lista y la suma de los mismos.
    * */

    public static void main(String[] args){
        Almacenar dato1 = new Almacenar();
        dato1.ingresarNumero();
        dato1.mostrarNumeroElementos();
        dato1.mostrarSumaElementos();
    }
}
