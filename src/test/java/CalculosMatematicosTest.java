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

    //Testeado por: Daniel Bravo
    @Test
    void esPrimo() {
        boolean result = CalculosMatematicos.esPrimo(7);
        Assertions.assertEquals(true, result);
    }
    //Testeado por: Daniel Bravo
    @Test
    void esPrimo2() {
        boolean result = CalculosMatematicos.esPrimo(8);
        Assertions.assertEquals(false, result);
    }


    //Testeado por: Carlos Perez
    @Test
    void maxComDiv() {
        int result = CalculosMatematicos.maxComDiv(99,33);
        Assertions.assertEquals(33, result);
    }

    //Testeado por: Carlos Perez
    @Test
    void simplificarFraccion() {
        Fracciones resultado = new Fracciones(100,25);
        Fracciones esperado = new Fracciones(4,1);
        CalculosMatematicos.simplificarFraccion(resultado);
        boolean result = resultado.equals(esperado);
        Assertions.assertEquals(true,result);
    }

    //Testado por: daniel bravo
     @Test
    void minComMultiplo() {
        int result = CalculosMatematicos.minComMultiplo(12,18);
        Assertions.assertEquals(36, result);
    }

    //Testado por: daniel bravo
    @Test
    void sumaDeFracciones() {
        Fracciones f1 = new Fracciones(100, 25);
        Fracciones f2 = new Fracciones(42, 17);
        Fracciones resultado = CalculosMatematicos.sumaDeFracciones(f1,f2);
        Fracciones esperado = new Fracciones(4200,2750);
        boolean result = resultado.equals(esperado);
        Assertions.assertEquals(true,result);
    }

    @Test
    void restaDeFracciones() {
        Fracciones f1 = new Fracciones(100, 25);
        Fracciones f2 = new Fracciones(42, 17);
        Fracciones resultado = CalculosMatematicos.restaDeFracciones(f1,f2);
        Fracciones esperado = new Fracciones(-84,13);
        CalculosMatematicos.simplificarFraccion(resultado);
        boolean result = resultado.equals(esperado);
        Assertions.assertEquals(true,result);
    }
}