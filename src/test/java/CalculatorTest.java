import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void testTambah(){
        Calculator calculator = new Calculator();
        calculator.a = 10;
        calculator.b = 5;
        Assertions.assertEquals( 15, calculator.tambah(), "fungsi tambah");
    }

    @Test
    void testkurang(){
        Calculator calculator = new Calculator();
        calculator.a = 10;
        calculator.b = 5;
        Assertions.assertEquals( 5, calculator.kurang());
    }

    @Test
    void testKali(){
        Calculator calculator = new Calculator();
        calculator.a = 10;
        calculator.b = 5;
        Assertions.assertEquals( 50, calculator.kali());
    }

    @Test
    void testKali2(){
        Calculator calculator = new Calculator(5, 7);
        Assertions.assertAll(
                ()->Assertions.assertEquals(5, calculator.a),
                ()->Assertions.assertEquals(7, calculator.b),
                ()->Assertions.assertNotNull(calculator.kali())
        );
    }

    @Test
    void testbagi(){
        Calculator calculator = new Calculator();
        calculator.a = 10;
        calculator.b = 5;
        Assertions.assertEquals( 2, calculator.bagi());
    }

}
