public class Divisao implements Calculadora {
    @Override
    public double calcular(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return num1 / num2;
    }
}
