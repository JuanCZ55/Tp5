package tp5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class cotizacionTest {
    private static Conversor conversor;
    public cotizacionTest() {
    }
    
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
    public Double testCotizarCero () {
        return conversor.cotizar(500 ,  0);
    }  
    
}
