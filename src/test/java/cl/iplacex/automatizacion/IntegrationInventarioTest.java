package cl.iplacex.automatizacion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegrationInventarioTest {

    @Test
    public void testFlujoCompletoInventario() {
        Inventario inventario = new Inventario();
        
        // Simula la integración de varios eventos de almacenamiento y salida
        inventario.agregarStock("Monitor", 20);
        inventario.agregarStock("Monitor", 5); // Acumulado: 25
        
        boolean ventaExitosa = inventario.reducirStock("Monitor", 10);
        
        assertTrue(ventaExitosa, "El proceso de venta/salida debe integrarse y aprobarse");
        assertEquals(15, inventario.obtenerStock("Monitor"), "El inventario final integrado debe ser 15");
    }
}