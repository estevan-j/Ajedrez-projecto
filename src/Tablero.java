import pieza.*;
public class Tablero {
    private Casilla[][] casilla;
    public Tablero() {
        this.casilla = new Casilla[8][8];
        llenarTablero();
    }
    private void llenarTablero() {
        for (int j = 0; j < 8; j++) {
            //PEÓNES
            casilla[1][j] = new Casilla(new Peón(Color.BLANCO));
            casilla[6][j] = new Casilla(new Peón(Color.NEGRO));
        }
        //TORRES
        casilla[0][0] = new Casilla(new Torre(Color.BLANCO));
        casilla[0][7] = new Casilla(new Torre(Color.BLANCO));
        casilla[7][7] = new Casilla(new Torre(Color.NEGRO));
        casilla[7][0] = new Casilla(new Torre(Color.NEGRO));
        //CABALLO
        casilla[0][1] = new Casilla(new Caballo(Color.BLANCO));
        casilla[0][6] = new Casilla(new Caballo(Color.BLANCO));
        casilla[7][1] = new Casilla(new Caballo(Color.NEGRO));
        casilla[7][6] = new Casilla(new Caballo(Color.NEGRO));
        //ALFIL
        casilla[0][2] = new Casilla(new Alfil(Color.BLANCO));
        casilla[0][5] = new Casilla(new Alfil(Color.BLANCO));
        casilla[7][2] = new Casilla(new Alfil(Color.NEGRO));
        casilla[7][5] = new Casilla(new Alfil(Color.NEGRO));
        //REY
        casilla[0][3] = new Casilla(new Rey(Color.BLANCO));
        casilla[7][3] = new Casilla(new Rey(Color.NEGRO));
        //REINA
        casilla[0][4] = new Casilla(new Reina(Color.BLANCO));
        casilla[7][4] = new Casilla(new Reina(Color.NEGRO));
    }

    public void moverPieza(int posicionInicialX, int posicionInicialY, int xposicionFinal, int yPosicionFinal) throws CasillaException {
        validarPosición(posicionInicialX, posicionInicialY, xposicionFinal, yPosicionFinal);
        validarMovimiento(posicionInicialX, posicionInicialY, xposicionFinal, yPosicionFinal);
        casilla[posicionInicialX][posicionInicialY].getPieza().set(posicionInicialX, posicionInicialY);
        if (!casilla[posicionInicialX][posicionInicialY].getPieza().verificarMovimiento(xposicionFinal, yPosicionFinal)) {
            throw new CasillaException(" el movimiento no es valido en esta pieza ");
        }
        //casilla[posicionInicialX][posicionInicialY].getPieza().set(xposicionFinal, yPosicionFinal);
        reubicarPieza(posicionInicialX, posicionInicialY, xposicionFinal, yPosicionFinal);
        System.out.println(casilla[xposicionFinal][yPosicionFinal]);
    }

    public void capturarPieza(int posiciónInicialX, int posiciónInicialY, int posiciónFinalX, int posiciónFinalY) throws CasillaException {
        validarPosición(posiciónInicialX, posiciónInicialY, posiciónFinalX, posiciónFinalY);
        validarCaptura(posiciónInicialX, posiciónInicialY, posiciónFinalX, posiciónFinalY);
        casilla[posiciónInicialX][posiciónInicialY].getPieza().set(posiciónInicialX, posiciónInicialY);
        if (!casilla[posiciónInicialX][posiciónInicialY].getPieza().verificarMovimiento(posiciónFinalX, posiciónFinalY)) {
            throw new CasillaException(" el movimiento no es valido en esta pieza ");
        }
        System.out.println(casilla[posiciónFinalX][posiciónFinalY].getPieza());
        //casilla[posiciónInicialX][posiciónInicialY].getPieza().set(posiciónFinalX, posiciónFinalY);
        reubicarPieza(posiciónInicialX, posiciónInicialY, posiciónFinalX, posiciónFinalY);
        System.out.println(casilla[posiciónFinalX][posiciónFinalY].getPieza());
    }
    private boolean casillaEstaVacia(int xposicion, int yPosicion) {
        return casilla[xposicion][yPosicion] == null;
    }

    private boolean posiciónEsValida(int xPosición, int yPosicion) {
        return (xPosición >= 0 && xPosición < 8) && (yPosicion >= 0 && yPosicion < 8);
    }

    private void validarMovimiento(int posicionInicialX, int posicionInicialY, int xposicionFinal, int yPosicionFinal) throws CasillaException {
        if (casillaEstaVacia(posicionInicialX, posicionInicialY)) {
            throw new CasillaException("esta vaciá");
        }
        if (!casillaEstaVacia(xposicionFinal, yPosicionFinal)) {
            throw new CasillaException("a la que se desea mover esta ocupada");
        }
    }

    private void validarPosición(int posicionInicialX, int posicionInicialY, int xposicionFinal, int yPosicionFinal) throws CasillaException {
        if (!posiciónEsValida(posicionInicialX, posicionInicialY)) {
            throw new CasillaException("no vale");
        }
        if (!posiciónEsValida(xposicionFinal, yPosicionFinal)) {
            throw new CasillaException("no existe ");
        }
    }



    private boolean verificarSiEsDeDiferenteColor(int posiciónInicialX, int posiciónIniciaY, int posiciónFinalX, int posiciónFinalY) {
        return casilla[posiciónFinalX][posiciónFinalY].getPieza().getColor() != casilla[posiciónInicialX][posiciónIniciaY].getPieza().getColor();
    }

    private void reubicarPieza(int posiciónInicialX, int posiciónInicialY, int posiciónFinalX, int posiciónFinalY) {
        casilla[posiciónFinalX][posiciónFinalY] = new Casilla(casilla[posiciónInicialX][posiciónInicialY].getPieza());
        casilla[posiciónInicialX][posiciónInicialY] = null;
    }
}
