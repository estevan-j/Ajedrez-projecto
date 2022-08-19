package pieza;
import movimiento.Diagonal;
import movimiento.Vertical;

public class Peón extends Pieza implements Vertical, Diagonal {
    public Peón(Color color) {
        super(color);
    }

    @Override
    public boolean verificarMovimiento(int posiciónFinalX, int posiciónFinalY) {
        if ( moverDeFormaVertical(posiciónFinalX) && super.yPosición == posiciónFinalY){
            System.out.println("Peón valido");
            return true;
        }
        if (moverEnFormaDiagonal(posiciónFinalX,posiciónFinalY)){
            System.out.println("captura posible");
            return true;
        }
        return  false;
    }


    @Override
    public boolean moverEnFormaDiagonal(int xPosicionFinal, int yPosicionFinal) {
        if (super.xPosición + 1 != xPosicionFinal) {
            return  false;
        }
        return (Math.abs(yPosicionFinal - super.yPosición) == 1);
    }

    @Override
    public boolean moverDeFormaVertical(int xPosiciónFinal) {
        if (super.xPosición + 1 == xPosiciónFinal) {
            return true;
        }
        if (primerMovimiento(xPosiciónFinal)) {
            return true;
        }
        return false;
    }


    private boolean primerMovimiento(int xPosicionFinal) {
        return (super.xPosición == 1 || super.xPosición == 6) && super.xPosición + 2 == xPosicionFinal;
    }
}

