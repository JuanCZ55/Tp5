package tp5;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class dolaritosTest {

    private int saldoInicial;
    private double esperado;

    public dolaritosTest(int saldoInicial, double esperado) {
        this.saldoInicial = saldoInicial;
        this.esperado = esperado;
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Bienvenido al BeforeClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("La operacion ha finalizado");
    }

    @Before
    public void setUp() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @After
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][] {
            {180000, 120.0},
            {1500, 1.0},
            {120, 0.08},
            {120000, 80.0},
            {0, 0.0},
            {-900, -0.6},
            {100000, 66.666},
            {111, 0.074}
        });
    }

    @Test
    public void testCotizarCero() {
        Conversor conversor = new Conversor(saldoInicial);
        double resultado = conversor.cotizar(1500, conversor.getSaldo());
        assertEquals(esperado, resultado, 0.01);
    }
}
