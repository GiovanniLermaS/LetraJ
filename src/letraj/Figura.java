package letraj;

public class Figura {

    /**
     * Este método recibe como párametro de entrada un arreglo de enteros para
     * luego sumar una posición a la derecha retornando el arreglo cambiado.
     *
     * @param xy
     * @return
     */
    public int[][] moverDerecha(int[][] xy) {
        int[][] m = {
            {xy[0][0] + 1, xy[0][1]},
            {xy[1][0] + 1, xy[1][1]},
            {xy[2][0] + 1, xy[2][1]},
            {xy[3][0] + 1, xy[3][1]},
            {xy[4][0] + 1, xy[4][1]}};
        return m;
    }

    /**
     * Este método recibe como párametro de entrada un arreglo de enteros para
     * luego restar una posición a la izquierda retornando el arreglo cambiado.
     *
     * @param xy
     * @return
     */
    public int[][] moverIzquierda(int[][] xy) {
        int[][] m = {
            {xy[0][0] - 1, xy[0][1]},
            {xy[1][0] - 1, xy[1][1]},
            {xy[2][0] - 1, xy[2][1]},
            {xy[3][0] - 1, xy[3][1]},
            {xy[4][0] - 1, xy[4][1]}};
        return m;
    }

    /**
     * Este método recibe como párametro de entrada un arreglo de enteros para
     * luego restar una posición hacia abajo retornando el arreglo cambiado.
     *
     * @param xy
     * @return
     */
    public int[][] moverAbajo(int[][] xy) {
        int[][] m = {
            {xy[0][0], xy[0][1] - 1},
            {xy[1][0], xy[1][1] - 1},
            {xy[2][0], xy[2][1] - 1},
            {xy[3][0], xy[3][1] - 1},
            {xy[4][0], xy[4][1] - 1}};
        return m;
    }

    /**
     * Este método recibe como párametro de entrada un arreglo de enteros que
     * luego de acuerdo a la posición xy[5][0] se le asigna un método por hacer.
     *
     * @param xy
     * @return
     */
    public int[][] girar(int[][] xy) {
        if (xy[5][0] == 1) {
            return girarUno(xy);
        } else if (xy[5][0] == 2) {
            return girarDos(xy);
        } else if (xy[5][0] == 3) {
            return girarTres(xy);
        } else {
            return girarCuatro(xy);
        }
    }

    /**
     * Este método recibe como párametro de entrada un arreglo de enteros para
     * luego hacer el primer giro retornando el arreglo cambiado.
     *
     * @param xy
     * @return
     */
    public int[][] girarUno(int[][] xy) {
        int[][] m = {
            {xy[0][0], xy[0][1] - 2},
            {xy[1][0] - 1, xy[1][1] - 1},
            {xy[2][0] + 2, xy[2][1]},
            {xy[3][0] - 2, xy[3][1] - 1},
            {xy[4][0], xy[4][1] + 2},
            {xy[5][0] + 1}};
        return m;
    }

    /**
     * Este método recibe como parámetro de entrada un arreglo de enteros para
     * luego hacer el segundo giro retornando el arreglo cambiado.
     *
     * @param xy
     * @return
     */
    public int[][] girarDos(int[][] xy) {
        int[][] m = {
            {xy[0][0] - 2, xy[0][1]},
            {xy[1][0] - 1, xy[1][1] + 1},
            {xy[2][0], xy[2][1] + 2},
            {xy[3][0] - 1, xy[3][1] + 2},
            {xy[4][0], xy[4][1] + 2},
            {xy[5][0] + 1}};
        return m;
    }

    /**
     * Este método recibe como parámetro de entrada un arreglo de enteros para
     * luego hacer el tercer giro retornando el arreglo cambiado.
     *
     * @param xy
     * @return
     */
    public int[][] girarTres(int[][] xy) {
        int[][] m = {
            {xy[0][0], xy[0][1] + 2},
            {xy[1][0] + 1, xy[1][1] + 1},
            {xy[2][0] + 2, xy[2][1]},
            {xy[3][0] + 1, xy[3][1] - 1},
            {xy[4][0], xy[4][1] + 2},
            {xy[5][0] + 1}};
        return m;
    }

    /**
     * Este método recibe como parámetro de entrada un arreglo de enteros para
     * luego hacer el segundo giro retornando el arreglo cambiado.
     *
     * @param xy
     * @return
     *
     */
    public int[][] girarCuatro(int[][] xy) {
        int[][] m = {
            {xy[0][0] + 2, xy[0][1]},
            {xy[1][0] + 1, xy[1][1] - 1},
            {xy[2][0], xy[2][1] - 2},
            {xy[3][0] - 1, xy[3][1] - 1},
            {xy[4][0], xy[4][1] - 2},
            {xy[5][0] + 1}};
        return m;
    }
}
