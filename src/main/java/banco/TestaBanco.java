package banco;

public class TestaBanco {
    public static void main(String[] args) {
        //instanciar um novo objeto conta

        Conta conta = new Conta();
        conta.nomeTitular = "André Ricardo";
        conta.depositar(100);
        conta.sacar(50);
        conta.getSaldo();

        String nomeTitular = conta.nomeTitular;

        System.out.printf("A conta do cliente %s possui R$%.2f de saldo.",
                nomeTitular, conta.getSaldo());
    }
}
