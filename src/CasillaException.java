public class CasillaException extends Throwable {
    public CasillaException(String mensaje) {
        super("La casilla " + mensaje);
    }


}
