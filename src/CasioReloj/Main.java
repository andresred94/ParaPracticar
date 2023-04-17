package CasioReloj;
/**
 * @Version: 17/04/2023
 * @autor: Andres bravo
 */

public class Main {
    public static void main(String[] args) {
        /*
        Se crea un objeto de la clase RelojDigital llamado clock
         */
        RelojDigital clock = new RelojDigital();
        clock.agregarOyente(new EscuchaReloj() {
            @Override
            public void update(int hours, int minutes, int seconds) {
                System.out.println(clock.getTime());
            }
        });
        clock.inicio();
        // aqui añado otra linea
        // Mantenemos el programa ejecutando durante 10 segundos
        // aun no se sube a git?
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Quizas si añado esto?");
        clock.stop();
        //otra aqui
        //??
        //no se guardaaa
    }
}

