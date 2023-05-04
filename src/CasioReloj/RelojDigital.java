package CasioReloj;
import javax.swing.Timer;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class RelojDigital extends Reloj {
    //Atributos de la clase RelojDigital
    final private Set<EscuchaReloj> listeners;
    final private Timer timer;
    private String time;

    /********************************************
     * Metodos propios de la clase RelojDigital *
     ********************************************/
    public RelojDigital() {//metodo constructor de la clase RelojDigital
        this.listeners = new HashSet<>();
        this.time = getCurrentTime(); // inicializar la variable time con la hora actual
        this.timer = new Timer(1000, e -> {
            this.time = getCurrentTime(); // actualizar la variable time cada segundo
            notificarOyente();
        });
    }
    private String getCurrentTime() {//Metodo para obtener el tiempo que esta dentro de la clase Reloj

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(new Date());
        /*LocalTime now = LocalTime.now();
        return now.toString();*/
    }
    /*****************************************************
     * Metodos implementados de la clase abstracta Reloj *
     *****************************************************/
    @Override
    public void agregarOyente(EscuchaReloj listener) {
        listeners.add(listener);
    }
    @Override
    public void removeListener(EscuchaReloj listener) {
        listeners.remove(listener);
    }

    /**************************************************
     * Metodos abstractos de la clase abstracta Reloj *
     **************************************************/
    @Override
    public void notificarOyente() {
        for (EscuchaReloj listener : listeners) {
            listener.update(getHours(), getMinutes(), getSeconds());
        }
    }
    @Override
    public void inicio() {
        timer.start();
    }
    @Override
    public void stop() {
        timer.stop();
    }
    @Override
    public int getHours() {
        return Integer.parseInt(time.substring(0, 2));
    }
    @Override
    public int getMinutes() {
        return Integer.parseInt(time.substring(3, 5));
    }
    @Override
    public int getSeconds() {
        return Integer.parseInt(time.substring(6, 8));
    }
    @Override
    public String getTime() {
        return time;
    }
}

