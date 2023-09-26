package aula2.objetos;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.printf("a=%d, b=%d", a, b);

        b = 20;

        System.out.printf("%na=%d, b=%d%n", a, b);

        //c1 e c2 são variáveis diferentes mas estão guardando dentro de si o mesmo objeto.
        Conta c1 = new Conta();
        c1.depositar(100);
        System.out.printf("Saldo de c1 é R$%.2f%n", c1.getSaldo());

        Conta c2 = c1;
        c2.depositar(200);
        System.out.printf("Saldo de c1 é R$%.2f%n", c1.getSaldo());
        System.out.printf("Saldo de c2 é R$%.2f%n", c2.getSaldo());
        System.out.println(c1);
        System.out.println(c2);

        if(c1 == c2) {
            System.out.println("São o mesmo objeto");
        }
    }
}
