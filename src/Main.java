

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Player1");
        Jugador jugador2 = new Jugador("Player2");
        PartidoDeAjedrez partidoDeAjedrez = new PartidoDeAjedrez(jugador1, jugador2);
        Tablero tablero = new Tablero();
        try {
            // Peon
            //tablero.moverPieza(1,0,2,0); // la casilla no vale
            //tablero.moverPieza(3,0,4,0); // la casilla esta vacia
            //tablero.moverPieza(7,1,5,0);
            //tablero.moverPieza(0,1,2,2);
            tablero.capturarPieza(0,0,1,0);
            //tablero.moverPieza(7,1,6,4);
            //tablero.moverPieza(7,1,6,4);
            //tablero.moverPieza(0,0,3,0); // la casilla no existe
            //tablero.moverPieza(0,0,1,0);   // la casilla esta ocupada
        } catch (CasillaException e) {
            System.out.println(e.getMessage());
        }
    }
}
