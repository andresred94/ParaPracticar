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
        //Lo que está dentro de la funcion "agregarOyente" como parametro es una clase
        //anonima de la interfaz EscuchaReloj
        clock.agregarOyente(new EscuchaReloj() {
        @Override
        public void update(int hours, int minutes, int seconds) {
                System.out.println(clock.getTime());
            }
        });
        clock.inicio();
        //Entre parentesis se muestra la cantidad de tiempo que se ejecuta la hora (10 segundos)
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //método stop de la clase Reloj
        clock.stop();


    }
}

