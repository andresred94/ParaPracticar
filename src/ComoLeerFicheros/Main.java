package ComoLeerFicheros;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main (String [] args){
        /*FileWriter fw;
        {
            try {
                fw = new FileWriter ("./src/fichero1.txt");
            } catch (IOException e) {
                throw new RuntimeException(e);
                }
        }*/

        try (FileWriter fw = new FileWriter("./src/ComoLeerFicheros/fichero1.txt")) {
            fw.write("Esta es una prueba de como escribir en un archivo");
        } catch (IOException e) {
            System.out.println("Error al encontrar el arhivo");
        }
        try (FileWriter fw = new FileWriter("./src/ComoLeerFicheros/fichero1.txt")) {
            fw.write("Esta es una prueba de como escribir en un archivo");
        } catch (IOException e) {
            System.out.println("Error al encontrar el arhivo");
        }
    }



}
