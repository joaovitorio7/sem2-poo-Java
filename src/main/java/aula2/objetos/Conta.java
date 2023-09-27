package aula2.objetos;

public class Conta{
    Cliente titular = new Cliente();
    Cliente dependente;
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

    // método to string é o return do endereço
    public String toString(){
        return String.format("nomeTitular: %s, saldo: %.2f,",
                this.titular.nome, this.getSaldo());
    }
}

