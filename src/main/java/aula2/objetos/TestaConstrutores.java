package aula2.objetos;

import entidades.Cliente;
import entidades.Conta;

public class TestaConstrutores {
    public static void main(String[] args) {
        Conta conta = new Conta(new Cliente(), 100);
    }
}
