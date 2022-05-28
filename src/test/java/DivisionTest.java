import org.junit.Before;
import org.junit.Test;

public class DivisionTest {
    private Calculador calculador;

    @Before
    public void before() {
        calculador = new Calculador();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionCero() {
        int a = 15; int b = 0;
        int result = calculador.dividir(a, b);
    }
}
