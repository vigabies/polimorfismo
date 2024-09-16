public class CalculadoraControle {
    private Calculadora operacao;

    public void setOperacao(Calculadora operacao) {
        this.operacao = operacao;
    }

    public double executarOperacao(double num1, double num2) {
        return operacao.calcular(num1, num2);
    }

    public static void main(String[] args) {
        CalculadoraControle controle = new CalculadoraControle();

        controle.setOperacao(new Soma());
        System.out.println("Soma: " + controle.executarOperacao(5, 3));

        controle.setOperacao(new Subtracao());
        System.out.println("Subtracao: " + controle.executarOperacao(5, 3));

        controle.setOperacao(new Multiplicacao());
        System.out.println("Multiplicacao: " + controle.executarOperacao(5, 3));

        controle.setOperacao(new Divisao());
        System.out.println("Divisao: " + controle.executarOperacao(5, 3));
    }
}
