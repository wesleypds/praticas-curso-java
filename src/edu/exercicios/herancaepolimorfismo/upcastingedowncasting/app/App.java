package edu.exercicios.herancaepolimorfismo.upcastingedowncasting.app;

import edu.exercicios.herancaepolimorfismo.upcastingedowncasting.model.Conta;
import edu.exercicios.herancaepolimorfismo.upcastingedowncasting.model.ContaEmpresarial;
import edu.exercicios.herancaepolimorfismo.upcastingedowncasting.model.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        sobreposicao();
    }

    public static void upcastingDowncasting() {
        Conta conta = new Conta(1001, "Wesley", 1000.0);
        conta.depositar(400.0);
        ContaEmpresarial contaEmpresarial = new ContaEmpresarial(1002, "Camila", 0.0, 2000.0);

        // Upcasting
        Conta conta2 = contaEmpresarial;
        conta2.depositar(400.0);
        Conta conta3 = new ContaEmpresarial(1003, "Neusa", 0.0, 500.0);
        Conta conta4 = new ContaPoupanca(1004, "Danielle", 0.0, 0.01);

        // Downcasting
        ContaEmpresarial contaEmpresarial2 = (ContaEmpresarial)conta3;
        contaEmpresarial2.emprestimo(400.0);

        // ContaEmpresarial contaEmpresarial3 = (ContaEmpresarial)conta4;
        if (conta4 instanceof ContaEmpresarial) {
            ContaEmpresarial contaEmpresarial3 = (ContaEmpresarial)conta4;
            contaEmpresarial3.emprestimo(100.0);
        }
    }

    public static void sobreposicao() {
        Conta conta = new Conta(1001, "Wesley", 1000.0);
        conta.sacar(200.0);
        System.out.println("Conta comum: " + conta.getSaldo());

        Conta conta2 = new ContaPoupanca(1002, "Wesley", 1000.0, 0.01);
        conta2.sacar(200.0);
        System.out.println("\nConta poupança: " + conta2.getSaldo());

        Conta conta3 = new ContaEmpresarial(1003, "Wesley", 1000.0, 200.0);
        conta3.sacar(200.0);
        System.out.println("\nConta empresarial: " + conta3.getSaldo());
    }
}
