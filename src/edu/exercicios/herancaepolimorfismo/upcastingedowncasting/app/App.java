package edu.exercicios.herancaepolimorfismo.upcastingedowncasting.app;

import edu.exercicios.herancaepolimorfismo.upcastingedowncasting.model.Conta;
import edu.exercicios.herancaepolimorfismo.upcastingedowncasting.model.ContaEmpresarial;
import edu.exercicios.herancaepolimorfismo.upcastingedowncasting.model.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        Conta conta = new Conta(1001, "Wesley", 0.0);
        ContaEmpresarial contaEmpresarial = new ContaEmpresarial(1002, "Camila", 0.0, 2000.0);

        // Upcasting
        Conta conta2 = contaEmpresarial;
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
}
