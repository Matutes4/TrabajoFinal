package ModificaciónDeInventario;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[] InventarioActual = {42, 88, 21, 12, 56};

        String[] idDevolucion = {"0775521", "0303831", "0303831", "0311598", "0304764"};

        String[] TipoDeProducto = {"Ensamblaje", "Ensamblaje", "Servicio", "Servicio", "Accesorio"};

        int[] CantidadDevuelto = {2, 3, 1, 1, 4};

        String[] NombreProducto = {"Impeller", "Housing", "Pin", "Sello", "Junta"};

        int[] inventarioActualizado = Actualizar(InventarioActual, CantidadDevuelto);
        System.out.println("El inventario se actualizo correctamente:");

        for (int i = 0; i < inventarioActualizado.length; i++) {
            System.out.println(idDevolucion[i] + ": " + TipoDeProducto[i] + ": " + CantidadDevuelto[i] + ": " + NombreProducto[i] + ": " + inventarioActualizado[i]);
        }

    }

    private static int[] Actualizar(int[] inventarioActual, int[] CantidadDevuelto) {
        int[] inventarioActualizado = new int[inventarioActual.length];
        for (int i = 0; i < inventarioActual.length; i++) {
            inventarioActualizado[i] = inventarioActual[i];
            inventarioActualizado[i] += CantidadDevuelto[i]; // Suma 2 al primer element
        }
        return inventarioActualizado;
    }


}

