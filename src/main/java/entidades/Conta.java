package entidades;

public class Conta{

    public static int totalContas;
    private Cliente titular;
    private Cliente dependente;
    private double saldo;
    private boolean ativa;

    private double limite = -200;

    public Conta() {
        Conta.totalContas++;
    }

    public Conta(Cliente titular) {
        this();
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

    //this se refere ao atributo
    public boolean sacar(double valor){
        double saldoComLimite = this.saldo + this.limite;
        if(valor <= saldoComLimite) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Não foi possível realizar o saque. Consulte seu saldo.");
            return false;
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    //aqui retorna o valor do saldo para quem evocar esse método pois caso o atributo double esteja privado
    public double getSaldo(){
        return this.saldo + this.limite;
    }

    public void transferir(Conta outraConta, double valor ){
        if(this.sacar(valor) ) {
            outraConta.depositar(valor);
        }
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return this.limite;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getDependente() {
        return dependente;
    }

    public void setDependente(Cliente dependente) {
        this.dependente = dependente;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public static int getTotalContas() {
        return totalContas;
    }

    // método to string é o return do endereço
    public String toString(){
        return String.format("nomeTitular: %s, saldo: %.2f,",
                this.titular.getNome(), this.getSaldo());
    }
}



