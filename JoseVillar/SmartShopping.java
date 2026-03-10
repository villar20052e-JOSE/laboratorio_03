package JoseVillar;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartShopping {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 1. Crear una lista llamada shoppingList
    ArrayList<String> shoppingList = new ArrayList<>();

    // 2. Agregar al menos 5 productos iniciales
    shoppingList.add("Leche");
    shoppingList.add("Pan");
    shoppingList.add("Huevos");
    shoppingList.add("Manzanas");
    shoppingList.add("Café");

    System.out.println("--- ¡Bienvenido a Jesko Shopping System! ---");

    // 3. Mostrar todos los productos
    System.out.println("\nLista actual: " + shoppingList);

    // 4. Permitir agregar un nuevo producto
    System.out.print("\nIntroduce un nuevo producto para agregar: ");
    String nuevoProducto = scanner.nextLine();
    shoppingList.add(nuevoProducto);
    System.out.println("Producto añadido.");

    // 5. Permitir eliminar un producto
    System.out.print("\n¿Qué producto deseas eliminar de la lista?: ");
    String productoAEliminar = scanner.nextLine();
    if (shoppingList.remove(productoAEliminar)) {
      System.out.println("'" + productoAEliminar + "' ha sido eliminado.");
    } else {
      System.out.println("Ese producto no estaba en la lista.");
    }

    // 6. Buscar si un producto existe en la lista
    System.out.print("\nIngresa el nombre de un producto para buscarlo: ");
    String productoABuscar = scanner.nextLine();

    if (shoppingList.contains(productoABuscar)) {
      System.out.println("¡Sí! '" + productoABuscar + "' está en tu lista.");
    } else {
      System.out.println("No, '" + productoABuscar + "' no aparece en la lista.");
    }

    // Mostrar lista final
    System.out.println("\nLista final de compras: " + shoppingList);
    System.out.println("--------------------------------------------");

    scanner.close();
  }
}
