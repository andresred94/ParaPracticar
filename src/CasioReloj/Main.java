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
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clock.stop();


    }
}

