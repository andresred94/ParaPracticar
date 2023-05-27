package EjerciciosColecciones.Listas.Ejercicio2;
import java.util.ArrayList;
import java.util.Scanner;

public class Colores {
    // atributos de la clase
    private Scanner sc;
    private ArrayList<String> colors;

    // setter y getter
    public ArrayList<String> getColors() {
        return colors;
    }

    // constructores
    public Colores() {
        sc = new Scanner(System.in);
        colors = new ArrayList<>();
    }

    // metodos de la clase
    public void ingresarColores() {
        String color;
        while (true) {
            System.out.println("Ingrese un color (o presione q para salir):");
            color = pedirColor();
            if (color.equals("q")) {
                break;
            }
            colors.add("\u001B[31m"+color);
        }
    }
    public String pedirColor() {
        return sc.nextLine();
    }
    public void mostrarColores(){
        System.out.println("El ArrayList contiene los colores:");
        for (int i = 0; i < colors.size(); i++) {
            String listaColores = colors.get(i);
            System.out.println(listaColores);
        }
    }
    public void ingresarColor() {
        System.out.println("Ingresa un color:");
        String color = sc.nextLine();

        // Se agrega un objeto Color al ArrayList con el color y su formato de texto ANSI correspondiente
        switch (color) {
            case "negro":
                colors.add(String.valueOf(new Color(color, "\u001B[30m")));
                break;
            case "rojo":
                colors.add(String.valueOf(new Color(color, "\u001B[31m")));
                break;
            case "verde":
                colors.add(String.valueOf(new Color(color, "\u001B[32m")));
                break;
            default:
                System.out.println("Color no válido.");
                break;
        }
    }
    //todo implementar los colores?

}
