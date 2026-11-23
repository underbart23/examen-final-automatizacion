package cl.iplacex.automatizacion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitInventarioTest {

    private Inventario inventario;

    @BeforeEach
    public void setUp() {
        inventario = new Inventario();
    }

    @Test
    public void testAgregarStockNuevo() {
        inventario.agregarStock("Laptop", 10);
        assertEquals(10, inventario.obtenerStock("Laptop"), "El stock inicial del producto debe ser 10");
    }

    @Test
    public void testReducirStockExitoso() {
        inventario.agregarStock("Teclado", 15);
        boolean resultado = inventario.reducirStock("Teclado", 5);
        assertTrue(resultado, "La reducción de stock debería completarse con éxito");
        assertEquals(10, inventario.obtenerStock("Teclado"), "El stock restante debe ser 10");
    }
}