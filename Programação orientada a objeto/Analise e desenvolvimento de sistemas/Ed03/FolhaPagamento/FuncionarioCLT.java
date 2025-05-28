package ed03.folhaPagamento;

public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        double adicional = 300;
        return salarioBase + adicional;
    }
}
