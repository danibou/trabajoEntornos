import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculosMatematicosTest {
    // testeado por: daniel bravo
    @Test
    void esPar() {
        boolean result = CalculosMatematicos.esPar(20);
        Assertions.assertEquals(true, result);
    }
    // Testeado por : daniel bravo
    @Test
    void esPar2() {
        boolean result = CalculosMatematicos.esPar(99);
        Assertions.assertEquals(false, result);
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

    //TESTEADO POR  ADRIAN CARDIN
    @Test
    void sumaDeFracciones() {
        Fracciones f1 = new Fracciones(100, 25);
        Fracciones f2 = new Fracciones(42, 17);
        Fracciones resultado = CalculosMatematicos.sumaDeFracciones(f1,f2);
        Fracciones esperado = new Fracciones(4200,2750);
        boolean result = resultado.equals(esperado);
        Assertions.assertEquals(true,result);
    }

    //TESTEADO POR  ADRIAN CARDIN
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

    //Testeado por Carlos Perez
    @Test
    void multiplicacionFracciones() {
        Fracciones f1 = new Fracciones(5, 10);
        Fracciones f2 = new Fracciones(2, 10);
        Fracciones resultado = CalculosMatematicos.multiplicacionFracciones(f1,f2);
        Fracciones esperado = new Fracciones(10,100);
        boolean result = resultado.equals(esperado);
        Assertions.assertEquals(true,result);
    }
// testeado por: daniel bravo
    @Test
    void divisionFracciones() {
        Fracciones f1 = new Fracciones(10, 10);
        Fracciones f2 = new Fracciones(1, 3);
        Fracciones resultado = CalculosMatematicos.divisionFracciones(f1,f2);
        Fracciones esperado = new Fracciones(30,10);
        boolean result = resultado.equals(esperado);
        Assertions.assertEquals(true,result);
    }
}