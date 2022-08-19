import pieza.Peón;
import pieza.Pieza;

public class Casilla {
    private Pieza pieza;

    public Pieza getPieza() {
        return pieza;
    }

    public void ponerPieza(Pieza piezas) {
        this.pieza = piezas;
    }

    public void quitarPieza() {
        this.pieza = null;
    }
}
