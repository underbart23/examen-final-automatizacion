package cl.iplacex.automatizacion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AcceptanceInventarioTest {

    @Test
    public void testAceptacionReglaNegocioInventario() {
        Inventario inventario = new Inventario();
        inventario.agregarStock("Servidor", 5);
        
        boolean validacionUI = inventario.obtenerStock("Servidor") > 0;
        assertTrue(validacionUI, "La aceptación del sistema indica que el stock visible es correcto para el usuario final");
    }
}