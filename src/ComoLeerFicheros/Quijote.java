package ComoLeerFicheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Quijote {
   int contarLetrasMinusculas(String fichero){
        int numeroLetras = 0;
        int letra;
        try (FileReader fr = new FileReader(fichero)){
            while ((letra = fr.read()) != -1) {
                System.out.println((char)letra);
            }
        }
        catch (FileNotFoundException e ) {
            System.out.println("No se ha encontrado el fichero"+fichero);
        }
        catch (IOException e) {
            System.out.println("Error de E/S: "+e.getMessage());
        }
       return numeroLetras;
   }
}
