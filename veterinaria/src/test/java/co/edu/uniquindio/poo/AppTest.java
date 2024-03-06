/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos(){
        LOG.info("Iniciando prueba de datosCompletos");
        Mascota mascota= new Mascota("toby", 3, "perro","pitbull","masculino", "blanco", 12.0);
        assertEquals("toby", mascota.nombre());
        assertEquals(3, mascota.edad());
        assertEquals("perro", mascota.especie());
        assertEquals("pitbull", mascota.raza());
        assertEquals("masculino", mascota.genero());
        assertEquals("blanco", mascota.color());
        assertEquals(12.0, mascota.peso());
        LOG.info("Finalizando la prueba de datosCompletos ");
    }
    @Test
    public void datosNulos() {
        LOG.info("iniciando prueba de datosNulos");
        assertThrows(Throwable.class,  () -> new Mascota(null,(int)1,null,null,null,null,(Double)12.0));
        LOG.info("finalizando prueba de datosNulos");
}

    @Test
    public void edadNegativa(){
        LOG.info("iniciando prueba de edadNegativa");

        assertThrows(Throwable.class,  () -> new Mascota("toby",(int)-3,"perro", "pitbull","femenino","negro",(Double)12.0));

        LOG.info("finalizando prueba de edadNegativa");
    }

    @Test
    public void datosVacios(){
        LOG.info("iniciando prueba de datosVacios");
        Mascota mascota= new Mascota("", 3, "perro", "","masculino", "", 12.0);

        assertEquals("", mascota.nombre());
        assertEquals(3, mascota.edad());
        assertEquals("", mascota.raza());
        assertEquals("masculino", mascota.genero());
        assertEquals("", mascota.color());
        assertEquals(12.0, mascota.peso());

        LOG.info("terminando prueba de datosVacios");
    }
}

