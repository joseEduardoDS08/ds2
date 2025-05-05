public class Empresa {
    public static void main(String[] args) {
        Funcionario V = new Vendedor(2000, 500);
        Funcionario F = new Freelancer(20, 150);
        Gerente G = new Gerente(2000, 500);

        System.out.println("Salario do Vendedor: " + obterSalarioDoFuncionario(V));
        System.out.println("Salario do Freelancer: " + obterSalarioDoFuncionario(F));
        System.out.println("Salario do Gerente: " + obterSalarioDoFuncionario(G));
    }
    public static double obterSalarioDoFuncionario(Funcionario funcionario) {
        return funcionario.calcularSalarioFinal();
    }
}