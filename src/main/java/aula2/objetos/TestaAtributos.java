package aula2.objetos;

public class TestaAtributos {
    public static void main(String[] args) {
        Conta contaTeste = new Conta();
        System.out.println(contaTeste);

        Cliente cli = new Cliente();
        cli.nome = "Henrique";
        cli.sobrenome = "Mafra";
        cli.cpf = "03192837551";
        cli.email = "sashauh@ksdmks.com";

        contaTeste.titular = cli;

        contaTeste.titular.telefone = "71 98547125";

        contaTeste.dependente = new Cliente();
        contaTeste.dependente.nome = "Lucas";
        contaTeste.dependente.sobrenome = "Alves";
        contaTeste.dependente.cpf = "03192715478";
    }
}
