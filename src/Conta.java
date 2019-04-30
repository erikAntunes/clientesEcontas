public class Conta {

    private String numeroConta;
    private Float saldo;
    private Cliente titular;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void depositar(Float quantiaDinheiro) {
        this.saldo = quantiaDinheiro + saldo;
        System.out.println("Deposito Realizado, Seu Novo Saldo é " + saldo);
    }

    public void sacar(Float quantiaDinheiro) {
        this.saldo = saldo - quantiaDinheiro;
        if (saldo > quantiaDinheiro) {
            System.out.println("Saldo Insuficiente");
        } else {
            System.out.println("Saque realizado com sucesso, Seu novo saldo é: " + saldo);

        }
    }
}