import pieza.Color;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Player1");
        Jugador jugador2 = new Jugador("Player2");
        PartidoDeAjedrez partidoDeAjedrez = new PartidoDeAjedrez(jugador1, jugador2);

        Tablero tablero = new Tablero();
        /*new Posición("B1");
        CHAR LETRA = B;
        INT  NUMERO = 1;
        get fila()
                get colum;
        /*/
        //moverPieza('B',1);
       // Posición n = null;
         //   n = new Posición('a',8);
           // System.out.println(n.obtenerColumna());

        jugador1.realizarJugada('A',2, 'B',3, tablero);
        /* jugador2.moverPieza(new Posición('A', 1), PosiciónFinal, tablero);
        jugador1.moverPieza(new Posición('B', 1), PosiciónFinal, tablero);
        jugador2.moverPieza(new Posición('B', 1), PosiciónFinal, tablero);
        jugador1.moverPieza(new Posición('B', 1), PosiciónFinal, tablero);
        jugador2.moverPieza(new Posición('B', 1), PosiciónFinal, tablero);*/


        //try {
        //    // Peon
        //    tablero.moverPieza(B1,C1); // la casilla no vale
        //    //tablero.moverPieza(3,0,4,0); // la casilla esta vacia
        //    //tablero.moverPieza(7,1,5,0);
        //    //tablero.moverPieza(0,1,2,2);

        //    tablero.capturarPieza(0,0,1,0);
        //    //tablero.moverPieza(7,1,6,4);
        //    //tablero.moverPieza(7,1,6,4);
        //    //tablero.moverPieza(0,0,3,0); // la casilla no existe
        //    //tablero.moverPieza(0,0,1,0);   // la casilla esta ocupada
        //} catch (CasillaException e) {
        //    System.out.println(e.getMessage());
        //}
    }
}
