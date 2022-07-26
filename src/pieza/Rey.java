package pieza;

public class Rey extends Pieza{
    public Rey(Color color) {
        super(color);
    }

    @Override
    public boolean verificarMovimiento(int posiciónFinalX, int posiciónFinalY) {
        if(Math.abs(posiciónFinalX - super.xPosición) == 1 || Math.abs(posiciónFinalY - super.yPosición) == 1)
        {
            System.out.println("pieza.Rey valido");
            return true;
        }
        return false;
    }
}
