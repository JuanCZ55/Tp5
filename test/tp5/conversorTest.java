package tp5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class conversorTest {

    private static Conversor conversor;

    public conversorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        conversor = new Conversor(200);
        System.out.println("Bienvenido al BeforeClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    @Before
    public void setUp() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @After
    public void tearDown() {
        System.out.println("La Operacion ha finalizado");
    }

    @Test
    public void testSomeMethod() {
        fail("El test es un prototipo. <<The test case is a prototype.>>");
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
