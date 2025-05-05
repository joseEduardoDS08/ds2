public class Gerente extends Funcionario {
    private double salarioBase;
    private double comissao;

    public Gerente(double salarioBase, double comissao) {
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + comissao + 1000;
    }
}