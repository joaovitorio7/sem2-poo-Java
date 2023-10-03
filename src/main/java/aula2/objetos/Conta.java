package aula2.objetos;

public class Conta{
    Cliente titular;
    Cliente dependente;
    private double saldo;
    private boolean ativa;

    private double limite = -200;

    public Conta() {}

    public Conta(Cliente titular) {
        this.titular = titular;
    }

    public Conta(Cliente titular, double saldo){
        this(titular);
        this.saldo = saldo;
    }

    public Conta(Cliente titular, double saldo, double limite){
        this(titular, saldo);
        this.limite = limite;
    }

    public Conta(String nomeTitular, String sobrenomeTitular, String cpfTitular){
        Cliente titular = new Cliente();
        titular.nome = nomeTitular;
        titular.sobrenome = sobrenomeTitular;
        titular.cpf = cpfTitular;

        this.titular = titular;
    }

    //this se refere ao atributo
    boolean sacar(double valor){
        double saldoComLimite = this.saldo + this.limite;
        if(valor <= saldoComLimite) {
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

