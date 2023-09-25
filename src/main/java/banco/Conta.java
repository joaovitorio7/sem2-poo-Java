package banco;

public class Conta {
    String nomeTitular;

    // colocar como privado significa boas práticas em JAVA, coloca-se private nos atributos.
    private double saldo;

    //this se refere ao atributo
    void sacar(double valor){
        this.saldo -= valor;
    }

    void depositar(double valor){
        this.saldo += valor;
    }

    //aqui retorna o valor do saldo para quem evocar esse método pois caso o atributo double esteja privado
    double getSaldo(){
        return this.saldo;
    }



}
