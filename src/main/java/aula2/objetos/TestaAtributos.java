package aula2.objetos;

public class TestaAtributos {
    public static void main(String[] args) {
        Conta contaTeste = new Conta();

        // imprime os valores padrão, qd instanciamos uma conta nova, os atributos da Conta são inicializados
        System.out.println(contaTeste);

        Cliente cli = new Cliente();
        contaTeste.titular = cli;

        contaTeste.titular.nome = "Henrique";
        contaTeste.titular.sobrenome = "Mafra";
        contaTeste.titular.cpf = "03192837551";
        contaTeste.titular.email = "suahusah@hsuahsua.com";

        contaTeste.dependente = new Cliente();
        contaTeste.dependente.nome = "Lucas";
        contaTeste.dependente.sobrenome = "Alves";
        contaTeste.dependente.cpf = "03192715478";


    }
}
