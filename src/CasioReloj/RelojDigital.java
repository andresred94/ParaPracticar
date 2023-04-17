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
    private Timer timer;
    private String time;

    //metodo constructor de la clase RelojDigital
    public RelojDigital() {
        this.listeners = new HashSet<>();
        this.time = getCurrentTime(); // inicializar la variable time con la hora actual
        this.timer = new Timer(1000, e -> {
            this.time = getCurrentTime(); // actualizar la variable time cada segundo
            notificarOyente();
        });
    }

    //Metodo para obtener el tiempo dentro de la clase Reloj Digital
    private String getCurrentTime() {
        /*SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(new Date());*/
        LocalTime now = LocalTime.now();
        return now.toString();
    }

    @Override
    public void agregarOyente(EscuchaReloj listener) {
        listeners.add(listener);
    }
    @Override
    public void removeListener(EscuchaReloj listener) {
        listeners.remove(listener);
    }

    //Metodos abstractos de la interfaz Reloj
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

