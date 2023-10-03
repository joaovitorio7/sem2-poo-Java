package aula2.objetos;

import entidades.Cliente;
import entidades.Conta;

public class TestaAtributos {
    public static void main(String[] args) {
        Conta contaTeste = new Conta();
        System.out.println(contaTeste);

        Cliente cli = new Cliente();
        cli.setNome("Henrique");
        cli.setSobrenome("Mafra");
        cli.setCpf("03192837551");
        cli.setEmail("sashauh@ksdmks.com");

        contaTeste.setTitular(cli);

        contaTeste.getTitular().setTelefone("71 98547125");

        Cliente dependente = new Cliente();
        dependente.setNome("Lucas");
        dependente.setSobrenome("Alves");
        dependente.setCpf("03192715478");

        contaTeste.setDependente(dependente);
    }
}
