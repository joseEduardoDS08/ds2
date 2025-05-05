public class Freelancer extends Funcionario {
    private int diasTrabalhados;
    private double valorDias;

    public Freelancer(int diasTrabalhados, double valorDias){
        this.diasTrabalhados = diasTrabalhados;
        this.valorDias = valorDias;
    }

    @Override
    public double calcularSalarioFinal() {
        return diasTrabalhados * valorDias;
    }
}