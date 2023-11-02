package Brandon.romero.Vistas;

import java.util.Scanner;

public class Menus {

    private static Scanner sc = new Scanner(System.in);
    private static double total = 0.0;

    public static void iniciar() {
        do {
            int opcion = mostrar(Textos.menuPrincipal);
            if (opcion == 10) {
                System.out.printf("Tu orden total es: $%.2f pesos%n", total);
                System.out.println("Esperamos tu orden. Buen día.");
                System.exit(0);
            } else {
                double precio = seleccionar(opcion);
                if (precio > 0) {
                    total += precio;
                    System.out.printf("Tu orden total es: $%.2f pesos%n", total);
                }
            }
        } while (true);
    }

    public static int mostrar(String texto) {
        System.out.println(texto + "\n: ");
        return sc.nextInt();
    }

    public static double seleccionar(int opcion) {
        double precio = 0.0;

        precio = Precios.Preciomenus(opcion, precio);

        return precio;
    }
}
