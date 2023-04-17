package CasioReloj;

import java.util.ArrayList;
import java.util.List;

public abstract class Reloj {
    // por que no se sube a git¿
    //atributos de la clase
    final List<EscuchaReloj> listeners = new ArrayList<>();

    //metodos normales
    protected void notificarOyentes(int hours, int minutes, int seconds) {
        for (EscuchaReloj oyente : listeners) {
            oyente.update(hours, minutes, seconds);
        }
    }
    public void agregarOyente(EscuchaReloj listener) {
        listeners.add(listener);
    }
    public void removeListener(EscuchaReloj listener) {
        listeners.remove(listener);
    }

    //Metodos abstractos
    public abstract void notificarOyente();
    public abstract void inicio();
    public abstract void stop();
    public abstract int getHours();
    public abstract int getMinutes();
    public abstract int getSeconds();
    public abstract String getTime();
}
