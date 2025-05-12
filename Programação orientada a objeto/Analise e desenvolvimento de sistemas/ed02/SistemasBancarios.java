class Conta {

    String cliente;

    double saldo;
 
    Conta(String cliente, double saldo) {

        this.cliente = cliente;

        this.saldo = saldo;

    }
 
    void depositar(double valor) {

        saldo += valor;

    }
 
    void sacar(double valor) {

        if (valor <= saldo) saldo -= valor;

    }
 
    void transferir(Conta destino, double valor) {

        if (valor <= saldo) {

            saldo -= valor;

            destino.depositar(valor);

        }

    }
 
    void aplicarJurosDiarios() {}
 
    void imprimirExtrato() {

        System.out.println("Cliente: " + cliente);

        System.out.println("Saldo: R$" + saldo);

    }

}
 
class ContaCorrente extends Conta {

    ContaCorrente(String cliente, double saldo) {

        super(cliente, saldo);

    }
 
    void aplicarJurosDiarios() {

        saldo *= 1.001;

    }
 
    void imprimirExtrato() {

        System.out.println("=== Conta Corrente ===");

        super.imprimirExtrato();

    }

}
 
class ContaPoupanca extends Conta {

    ContaPoupanca(String cliente, double saldo) {

        super(cliente, saldo);

    }
 
    void aplicarJurosDiarios() {

        saldo *= 1.0008;

    }
 
    void imprimirExtrato() {

        System.out.println("=== Conta Poupança ===");

        super.imprimirExtrato();

    }

}
 
class ContaSalario extends Conta {

    ContaSalario(String cliente, double saldo) {

        super(cliente, saldo);

    }
 
    void imprimirExtrato() {

        System.out.println("=== Conta Salário ===");

        super.imprimirExtrato();

    }

}
 
public class Main {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("Eduardo", 1000);

        ContaPoupanca cp = new ContaPoupanca("Bruno", 1500);

        ContaSalario cs = new ContaSalario("Larissa", 1200);
 
        cc.depositar(200);

        cp.sacar(100);

        cs.transferir(cc, 300);
 
        cc.aplicarJurosDiarios();

        cp.aplicarJurosDiarios();

        cs.aplicarJurosDiarios();
 
        cc.imprimirExtrato();

        cp.imprimirExtrato();

        cs.imprimirExtrato();

    }

}
 
