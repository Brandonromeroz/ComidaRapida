package Brandon.romero;

import Brandon.romero.Vistas.Menus;
import Brandon.romero.Vistas.Textos;

public class ComidaRapidaApp {
        public static void main(String[] args) {
            int opcion = 1;
            double total = 0;

            do {
                opcion = Menus.mostrar(Textos.menuPrincipal);
                double precio = Menus.seleccionar(opcion);
                if (precio > 0) {
                    total += precio;
                    System.out.printf("Total: %.2f%n", total);
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (opcion != 10);
        }
}


