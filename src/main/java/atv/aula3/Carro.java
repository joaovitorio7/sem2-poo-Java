package atv.aula3;

public class Carro {
    // Atributos
    private String cor;
    private String modelo;
    private boolean ligado;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    // Construtor
    public Carro(String cor, String modelo, int velocidadeMaxima) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Método para ligar o carro
    public void ligar() {
        if (!ligado) {
            System.out.println("Carro ligado.");
            ligado = true;
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // Método para desligar o carro
    public void desligar() {
        if (ligado) {
            System.out.println("Carro desligado.");
            ligado = false;
            velocidadeAtual = 0;
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    // Método para acelerar o carro
    public void acelerar(int quantidade) {
        if (ligado) {
            if (velocidadeAtual + quantidade <= velocidadeMaxima) {
                velocidadeAtual += quantidade;
                System.out.println("Acelerando. Velocidade atual: " + velocidadeAtual + " km/h");
            } else {
                System.out.println("Velocidade máxima atingida.");
            }
        } else {
            System.out.println("Você precisa ligar o carro antes de acelerar.");
        }
    }

    // Método para frear o carro
    public void frear(int quantidade) {
        if (ligado) {
            if (velocidadeAtual - quantidade >= 0) {
                velocidadeAtual -= quantidade;
                System.out.println("Freando. Velocidade atual: " + velocidadeAtual + " km/h");
            } else {
                System.out.println("O carro já está parado.");
            }
        } else {
            System.out.println("Você precisa ligar o carro antes de frear.");
        }
    }

    // Método para buzinar
    public void buzinar() {
        System.out.println("Buzinando: Beep! Beep!");
    }
}
