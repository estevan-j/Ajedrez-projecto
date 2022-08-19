public class Posición{
    private int columna;
    private int fila;
    public Posición(int fila,char columna) {
        columna = Character.toUpperCase(columna);
        if (!esValidaLaFila(fila)){
            System.out.println("La fila no es válida");
            return;
        }
        if (!esValidaLaColumna(transformarADecimal(columna))){
            System.out.println("La columna no es válida");
            return;
        }
        this.fila = fila;
        this.columna = transformarADecimal(columna);
// ME ESCUCHAS ?? AHHHH
        //
        // no
        // seguimos así o sigues intentando solucionar?
        // tu /SI  TE ESCUCHO BAJITO AHORA
        // si tambien // en donde en el intel ? vamos al discrod no se que le pasa no eh movido nada

    }

    private boolean esValidaLaColumna(int columna) {
        return (columna >= 0 && columna <8);
    }

    private boolean esValidaLaFila(int fila) {
        return (fila >= 1 && fila <= 8);
    }

    private int transformarADecimal(char columna) {
        return ((int) columna - 65);
    }

    public int obtenerColumna() {
        return columna;
    }

}
