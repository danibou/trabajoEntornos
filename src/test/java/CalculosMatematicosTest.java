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
    }
}