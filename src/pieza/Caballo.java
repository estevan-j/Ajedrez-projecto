package pieza;

public class Caballo extends Pieza{
    public Caballo(Color color) {
        super(color);
    }

    @Override
    public boolean verificarMovimiento(int posiciónFinalX, int posiciónFinalY) {
        if (moverEnL(posiciónFinalX, posiciónFinalY)) {
            System.out.println("Caballo valido");
            return true;
        }

        //Math.ab<s(posiciónFinalX - super.xPosición) > Math.abs(posiciónFinalY - super.yPosición) || (Math.abs(posiciónFinalX - super.xPosición) < Math.abs(posiciónFinalY - super.yPosición)
        return false;
    }

    private boolean moverEnL(int xPosiciónFinal, int yPosiciónFinal) {
        return (Math.abs(yPosiciónFinal - super.yPosición) == 1 && Math.abs(xPosiciónFinal - super.xPosición) == 2) ||
                (Math.abs(yPosiciónFinal - super.yPosición) == 2 && Math.abs(xPosiciónFinal - super.xPosición) == 1 );
    }

}
