package tp5;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    cotizacionTest.class,
    conversorTest.class,
    dolaritosTest.class
})
public class MiCoinSuite {
    // No requiere código adicional
}

