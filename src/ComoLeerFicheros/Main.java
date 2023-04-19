package ComoLeerFicheros;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main (String [] args){
        /**
         * Para poder leer un fichero usamos la clase FileWriter indicando en el constructor
         * al momento de crear el objeto de la clase la ruta donde se encuentra el archivo.
         * La ruta de este archivo tiene que tener la ruta relativa o absoluta.
         */
        //Try Catch para escribir
        try (FileWriter fw = new FileWriter("./src/ComoLeerFicheros/fichero1.txt")) {
            fw.write("Esta es una prueba de como escribir en un archivo");
        } catch (IOException e) {
            System.out.println("Error al encontrar el arhivo");
        }

        /**
         * Para leer un archivo es casi exactamente igual que como se escribte pero cambiando
         * a la clase FileReader con el metodo read().
         */
        //try cath para leer
        try (FileReader fr = new FileReader("./src/ComoLeerFicheros/fichero1.txt")) {
            int caracter;
            while  ((caracter=fr.read()) != -1){
                System.out.print((char)caracter);
            }
        } catch (IOException e) {
            System.out.println("Error al encontrar el arhivo");
        }
    }



}
