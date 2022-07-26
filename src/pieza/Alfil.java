package pieza;

import movimiento.Diagonal;

public class Alfil extends Pieza implements Diagonal {
    public Alfil(Color color) {
        super(color);
    }

    @Override
    public boolean verificarMovimiento(int posiciónFinalX, int posiciónFinalY) {
        if (moverEnFormaDiagonal(posiciónFinalX, posiciónFinalY)){
            System.out.println("pieza.Alfil valido");
            return true;
        }
        return false;
    }

    @Override
    public boolean moverEnFormaDiagonal(int xposiciónFinal, int yPosiciónFinal) {
        return Math.abs(xposiciónFinal - super.xPosición) == Math.abs(yPosiciónFinal - super.yPosición);
    }
}
