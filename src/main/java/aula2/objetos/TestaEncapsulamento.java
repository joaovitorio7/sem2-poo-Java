package aula2.objetos;

public class TestaEncapsulamento {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "João Victor";
        cliente.sobrenome = "Oliveira";
        cliente.cpf = "03192837551";

        Conta minhaConta = new Conta(cliente, 50, -100);

        minhaConta.sacar(60);
    }
}
