package Brandon.romero.Vistas;

public class Precios {
    static double Preciomenus(int opcion, double precio) {
        if (opcion == 1 || opcion == 2) { // Bebidas
            int tamanio = Menus.mostrar(Textos.menuBebidas);
            double[] precios = {10.0, 15.0, 20.0};
            String[] productos = {"Agua", "Refrescos"};
            precio = precios[tamanio - 1];
            System.out.printf("%s: $%.2f pesos%n", productos[opcion - 1], precio);
        } else if (opcion == 3) { // Hamburguesas
            int tipoHamburguesa = Menus.mostrar(Textos.menuHamburguesas);
            double[] precios = {25.0, 35.0, 40.0, 45.0};
            String[] productos = {"Sencilla", "Doble", "Con queso", "Con tocino"};
            precio = precios[tipoHamburguesa - 1];
            System.out.printf("Hamburguesa %s: $%.2f pesos%n", productos[tipoHamburguesa - 1], precio);
        } else if (opcion == 4) { // Pizza
            int tipoPizza = Menus.mostrar(Textos.menuPizza);
            double[] precios = {45.0, 60.0, 80.0, 100.0};
            String[] productos = {"Individual", "Mediana", "Grande", "Familiar"};
            precio = precios[tipoPizza - 1];
            System.out.printf("Pizza %s: $%.2f pesos%n", productos[tipoPizza - 1], precio);
        } else if (opcion == 5) { // Hotdog
            int tipoHotdog = Menus.mostrar(Textos.menuHotdog);
            double[] precios = {30.0, 40.0, 45.0};
            String[] productos = {"Sencillo", "Con tocino", "Con queso"};
            precio = precios[tipoHotdog - 1];
            System.out.printf("Hotdog %s: $%.2f pesos%n", productos[tipoHotdog - 1], precio);
        } else if (opcion == 6) { // Papas
            int tipoPapas = Menus.mostrar(Textos.menuPapas);
            double[] precios = {25.0, 30.0, 35.0};
            String[] productos = {"Chicas", "Medianas", "Grandes"};
            precio = precios[tipoPapas - 1];
            System.out.printf("Papas %s: $%.2f pesos%n", productos[tipoPapas - 1], precio);
        } else if (opcion == 10) {
            System.out.println("Buen dia");
            System.exit(0);
        } else {
            System.out.println(Textos.respuestaIncorrecta);
        }
        return precio;
    }
}