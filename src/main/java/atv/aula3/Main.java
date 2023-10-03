package atv.aula3;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Vermelho", "Sedan", 200);

        meuCarro.ligar();
        meuCarro.acelerar(50);
        meuCarro.frear(20);
        meuCarro.buzinar();
        meuCarro.desligar();
    }
}
