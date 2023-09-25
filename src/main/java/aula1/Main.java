package aula1;

public class Main {
    public static void main(String[] args) {
        Carro unoDeFirma = new Carro();
        unoDeFirma.cor = "Branco";
        unoDeFirma.possuiEscada = true;
        unoDeFirma.ano = 2005;
        unoDeFirma.numPortas = 2;

        unoDeFirma.acelerar(2);
        unoDeFirma.acelerar(3);

        System.out.println(unoDeFirma.velocidade);
    }
}
