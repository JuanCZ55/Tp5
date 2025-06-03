
package tp5;

import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


@RunWith(value=Parameterized.class)
public class dolaritosTest {
    private static Conversor conversor;
    private static double exResult;
    
    public dolaritosTest(int inicial, double exResult) {
        conversor = new Conversor(inicial);
        this.exResult = exResult;
    };

    // Datos para la prueba
    @Parameters
    public static Iterable<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][] {
            {180000, 120},
            {1500, 1},
            {120, 0.08},
            {120000, 80},
            {0, 0},
            {-900, -0.6},
            {100000, 66.666},
            {111, 0.074}
        });
    };
    @BeforeAll
    public static void setUpClass() {
        System.out.println("Bienvenido al BeforeAll");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("Pruebas finalizada");
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
    public void testCotizarCero () {
         assertEquals(conversor.cotizar(1500, conversor.getSaldo()), exResult);
    };
}
