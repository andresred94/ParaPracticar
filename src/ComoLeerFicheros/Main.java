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
        //todo buscar como hacerlo en una clase.
        //Try Catch para escribir en un fichero
        /*try (FileWriter fw = new FileWriter("./src/ComoLeerFicheros/fichero1.txt")) {
            fw.write("Esta es una prueba de como escribir en un archivo");
            fw.write(" ");
            fw.write("Es una prueba con caracteres");
            fw.write(" ");
            fw.write("aunque un string tambien tiene  numero");
            fw.write(" ");
            fw.write("1");

        } catch (IOException e) {
            System.out.println("Error al encontrar el arhivo");
        }*/

        /**
         * Para leer un archivo es casi exactamente igual que como se escribte pero cambiando
         * a la clase FileReader con el metodo read().
         */
        //Todo implementarlo en una clase
        //try cath para leer un fichero
        /*try (FileReader fr = new FileReader("./src/ComoLeerFicheros/fichero1.txt")) {
            int caracter;
            while  ((caracter=fr.read()) != -1){
                System.out.print((char)caracter);
            }
        } catch (IOException e) {
            System.out.println("Error al encontrar el archivo");
        }*/

        /**
         * Para poder leer el contenido de un  directorio se utiliza una clase diferente
         * En este caso usamos la clase "File" y los metodos exists() y "isDirectory"
         * para comprobar si existe el directorio y si es un directorio
         * Para leer cada archivo o capreta que tenga el directorio usamos un bucle
         * for-each para almacenar los archivos en un array, por último para obtener el nombre
         * cada archivo usamos el metodo "getName()" para obtener el nombre de cada arhivo dentro
         * del array
         */
        // Como leer el contenido de una carpeta
        //Todo Implementarlo en una clase
        //Todo Buscar como hacerlo para que se ingrese como parametro al ejecutar el codigo
        File dr = new File("D:\\");
        if (dr.exists() && dr.isDirectory()){
            File [] files = dr.listFiles();
            for (File archivo: files) {
                System.out.println(archivo.getName());
            }
        } else {
            System.out.println("No se encuentra el directorio");
        }



    }



}
