package tp5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class cotizacionTest {

    private static Conversor conversor;

    public cotizacionTest() {
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

    @Test(expected = ArithmeticException.class)
    public void testCotizarCero() {
        conversor.cotizar(500, 0);
    };
}
