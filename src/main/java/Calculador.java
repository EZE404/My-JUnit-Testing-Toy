public class Calculador {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public long multiplicar(int a, int b) {
        return (long) a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por 0.");
        }
        return a / b;
    }
}
