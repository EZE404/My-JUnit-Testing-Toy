import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value= Parameterized.class)
public class ParameterTest {

    public static final double DELTA = 0.001;
    private int a, b, expResult;
    private static Calculador calc;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Operación ParameterTest iniciado");
        calc = new Calculador();
    }
    public ParameterTest(int a, int b, int expResult) {
        this.a = a;
        this.b = b;
        this.expResult = expResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][] {{8, 7, 15}, {2, 0, 20}, {10, -1, -9}});
    }

    @Test
    public void testSumaConParams() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        double result = calc.sumar(a, b);
        Assert.assertEquals(expResult, result, DELTA);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("la operación ha finalizado");
    }
}
