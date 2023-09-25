package aula1;

public class Carro {

//Atributos

    int numPortas;

    String cor;

    String fabricante;

    int ano;

    boolean possuiEscada;

    double velocidade;

//Métodos

    void acelerar(double aceleracao){
        this.velocidade += aceleracao;
        return this.velocidade;
    }

    void frear(double freada){
        this.velocidade -= freada;
        return this.velocidade;
    }

    String pinta(String cor) {
        this.cor = cor;
        return this.cor;
    }
}
