package ed03.folhaPagamento;

public class FuncionarioTemporario extends Funcionario {

    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        final double desconto = 100;
        return salarioBase - desconto;
    }
}
