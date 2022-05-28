import org.junit.Test;

public class CalculadorTest {

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionPorCero() {
        double a = 15; double b = 0;
        double resultado = Calculador.dividir(a, b);
    }
}
