import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DivisionTest {
    private static Calculador calculador;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Operación DivisionTest iniciada.");
        calculador = new Calculador();
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionCero() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        int a = 45; int b = 0;
        double result = calculador.dividir(a, b);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("la operación ha finalizado");
    }
}
