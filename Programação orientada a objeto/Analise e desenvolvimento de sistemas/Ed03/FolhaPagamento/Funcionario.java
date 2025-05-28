package ed03.folhaPagamento;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void exibirDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Salário Base: R$ ").append(salarioBase);
        System.out.println(sb.toString());
    }

    public abstract double calcularSalario();
}
