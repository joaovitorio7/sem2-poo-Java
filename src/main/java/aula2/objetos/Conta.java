package aula2.objetos;

public class Conta {
    String nomeTitular;

    // colocar como privado significa boas práticas em JAVA, coloca-se private nos atributos.
    private double saldo;

    //this se refere ao atributo
    boolean sacar(double valor){
        if(valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Não foi possível realizar o saque. Consulte seu saldo.");
            return false;
        }
    }

    void depositar(double valor){
        this.saldo += valor;
    }

    //aqui retorna o valor do saldo para quem evocar esse método pois caso o atributo double esteja privado
    double getSaldo(){
        return this.saldo;
    }

    public void transferir(Conta outraConta, double valor ){
        if(this.sacar(valor) ) {
            outraConta.depositar(valor);
        }
    }
}

