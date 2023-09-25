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

    double acelerar(double aceleracao){
        this.velocidade += aceleracao;
        return this.velocidade;
    }

    double frear(double freada){
        this.velocidade -= freada;
        return this.velocidade;
    }

    String pinta(String cor) {
        this.cor = cor;
        return this.cor;
    }
}
