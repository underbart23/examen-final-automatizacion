package cl.iplacex.automatizacion;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<String, Integer> stockProductos = new HashMap<>();

    public void agregarStock(String producto, int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        stockProductos.put(producto, stockProductos.getOrDefault(producto, 0) + cantidad);
    }

    public int obtenerStock(String producto) {
        return stockProductos.getOrDefault(producto, 0);
    }

    public boolean reducirStock(String producto, int cantidad) {
        int actual = obtenerStock(producto);
        if (actual >= cantidad && cantidad > 0) {
            stockProductos.put(producto, actual - cantidad);
            return true;
        }
        return false;
    }
}