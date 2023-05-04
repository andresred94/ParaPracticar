package EjerciciosColecciones.Listas.Ejercicio1;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Almacenar {
    // atributos de la clase
    Scanner sc = new Scanner(System.in);
    public ArrayList numEnteros;

    // setter y getter
    public ArrayList getNumEnteros() {
        return numEnteros;
    }
    public void setNumEnteros(ArrayList numEnteros) {
        this.numEnteros = numEnteros;
    }

    // metodos contrusctores
    public Almacenar() {
        numEnteros = new ArrayList<Integer>();
    }

    // métodos de la clase
    public void  ingresarNumero () {
        int numIngresado;
        System.out.println("Ingresa una lista de números para ingresar al ArrayList (presiona 'q' para terminar)");
        String tecla;
        while (true) {
            System.out.println("Ingresa un número o presiona 'q' para salir:");
            tecla = sc.next();
            if (!tecla.equals("q")) {
                numIngresado = Integer.parseInt(tecla);
                numEnteros.add(numIngresado);
            } else {
                break; // salir del bucle
            }
        }
    }
    public void mostrarNumeroElementos (){
        int cantEle = numEnteros.size();
        System.out.println("La cantidad de elementos son: "+cantEle);
    }
    public void mostrarSumaElementos (){
        int sumaEle = 0;
        for (int i = 0; i < numEnteros.size(); i++) {
            int numList = (int) numEnteros.get(i);
            sumaEle+=numList;
        }
        System.out.println("La suma de los elementos es "+sumaEle);

    }


}
