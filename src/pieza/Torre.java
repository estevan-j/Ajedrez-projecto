package pieza;

import movimiento.Horizontal;
import movimiento.Vertical;

public class Torre extends Pieza implements Horizontal, Vertical {
    public Torre(Color color) {
        super(color);
    }
    @Override
    public boolean verificarMovimiento(int posiciónFinalX, int posiciónFinalY) {
        if ((moverDeFormaHorizontal(posiciónFinalY) && posiciónFinalX == super.xPosición) || moverDeFormaVertical(posiciónFinalX) && posiciónFinalY == super.yPosición ){
            System.out.println("torre valida");
            return true;
        }
        return false;
    }

    @Override
    public boolean moverDeFormaHorizontal(int yposiciónFinal) {
        return (Math.abs(yposiciónFinal - super.yPosición) != 0);
    }

    @Override
    public boolean moverDeFormaVertical(int xPosiciónFinal) {
        return (Math.abs(xPosiciónFinal - super.xPosición) != 0);
    }
}


