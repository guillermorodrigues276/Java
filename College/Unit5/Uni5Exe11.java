public class Uni5Exe11 {
    public static void main(String[] args) {

        int hora, totalDia, biscoitoQuebrado;

        totalDia = 1;
        hora = 0;
        biscoitoQuebrado = 1;

        for (int h = 2; h <= 16; h++) {
            hora = h;
            biscoitoQuebrado = biscoitoQuebrado * 3;
            totalDia = biscoitoQuebrado + totalDia;

            System.out.println(hora + " Horas - " + biscoitoQuebrado);
        }

    }
}
