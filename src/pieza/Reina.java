package pieza;

import movimiento.Diagonal;
import movimiento.Horizontal;
import movimiento.Vertical;

public class Reina extends Pieza implements Horizontal, Diagonal, Vertical {
    public Reina(Color color) {
        super(color);
    }

    @Override
    public boolean verificarMovimiento(int posiciónFinalX, int posiciónFinalY) {
        if(moverEnFormaDiagonal(posiciónFinalX, posiciónFinalY) || ((moverDeFormaHorizontal(posiciónFinalY) && posiciónFinalX == super.xPosición) || moverDeFormaVertical(posiciónFinalX) && posiciónFinalY == super.yPosición)) {
            System.out.println("reina valida");
            return true;
        }
        return false;
    }

    @Override
    public boolean moverEnFormaDiagonal(int xposiciónFinal, int yPosiciónFinal) {
        return  (Math.abs(xposiciónFinal - super.xPosición) == Math.abs(yPosiciónFinal - super.yPosición));
    }

    public boolean moverDeFormaHorizontal(int yposiciónFinal) {
        return (Math.abs(yposiciónFinal - super.yPosición) != 0);
    }

    @Override
    public boolean moverDeFormaVertical(int xPosiciónFinal) {
        return (Math.abs(xPosiciónFinal - super.xPosición) != 0);
    }
}
