import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculosMatematicosTest {

    @Test
    void esPar() {
        boolean result = CalculosMatematicos.esPar(20);
        Assertions.assertEquals(true, result);
    }

    @Test
    void descomposicionEnNumPrimos() {
    }

    @Test
    void esPrimo() {
        boolean result = CalculosMatematicos.esPrimo(7);
        Assertions.assertEquals(true, result);
    }
    @Test
    void esPrimo2() {
        boolean result = CalculosMatematicos.esPrimo(8);
        Assertions.assertEquals(false, result);
    }

    @Test
    void maxComDiv() {
        int result = CalculosMatematicos.maxComDiv(99,33);
        Assertions.assertEquals(33, result);
    }

    @Test
    void simplificarFraccion() {
        CalculosMatematicos.simplificarFraccion(2,4);
        Assertions.assertEquals(1,2);
        Assertions.assertEquals(2,4);
    }


}