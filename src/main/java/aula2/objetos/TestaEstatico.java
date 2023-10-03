package aula2.objetos;

public class TestaEstatico {
    public static void main(String[] args) {
        // int totalContas = Conta.totalContas;
        // System.out.println(Conta.getTotalContas());

        Conta conta1 = new Conta();
        System.out.println(conta1.getTotalContas());

        Conta conta2 = new Conta();
        System.out.println(conta2.getTotalContas());
    }
}
