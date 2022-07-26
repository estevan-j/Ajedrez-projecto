package pieza;

public abstract class Pieza {
    private final Color color;
    protected int xPosición;
    protected int yPosición;

    public Pieza(Color color) {
        this.color = color;
    }

    public void set(int xPosicioneinicial, int yPosicionInicial) {
        xPosición = xPosicioneinicial;
        yPosición = yPosicionInicial;
    }

    public abstract boolean verificarMovimiento(int posiciónFinalX, int posiciónFinalY);



    public Color getColor() {
        return color;
    }
}
