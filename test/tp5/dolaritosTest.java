package tp5;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
public class dolaritosTest {
    @BeforeAll
    public static void setUpClass() {
        System.out.println("Bienvenido al BeforeAll");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("La operacion ha finalizado");
    }

    @BeforeEach
    public void setUp() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    static Stream<Arguments> tomarDatos() {
        return Stream.of(
            Arguments.of(180000, 120.0),
            Arguments.of(1500, 1.0),
            Arguments.of(120, 0.08),
            Arguments.of(120000, 80.0),
            Arguments.of(0, 0.0),
            Arguments.of(-900, -0.6),
            Arguments.of(100000, 66.666),
            Arguments.of(111, 0.074)
        );
    }
    @ParameterizedTest
    @MethodSource("tomarDatos")
    public void testCotizarCero(int saldoInicial, double esperado) {
        Conversor conversor = new Conversor(saldoInicial);
        double resultado = conversor.cotizar(1500, conversor.getSaldo());
        assertEquals(esperado, resultado, 0.01);
    }
}
