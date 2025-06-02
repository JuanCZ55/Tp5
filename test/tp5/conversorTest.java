/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tp5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juancz55
 */
public class conversorTest {

    static Conversor conversor;

    public conversorTest() {
    }
    //Use las annotation @BeforeClass para inicializar (new) el calculador y mostrar mensaje de bienvenida. Utilice las annotations:
    //@Before antes de cada método, que muestre un mensaje de la operación que se testea
    //Use System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() );

    @BeforeAll
    public static void setUpClass() {
        conversor = new Conversor(200);
        System.out.println("Bienvenido al BeforeAll");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    @BeforeEach
    public void setUp() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @AfterEach
    public void tearDown() {
        System.out.println("La Operacion ha finalizado");
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void Suma() {
        conversor.aumentarSaldo(200);
        assertEquals(400, conversor.getSaldo(), 0.001);
    }

    @Test
    public void Resta() {
        conversor.retirarFisico(200);
        assertEquals(200, conversor.getSaldo(), 0.001);
    }
}
