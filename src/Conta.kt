class Conta {

    var numeroConta: String? = null
    var saldo: Float? = null
    var titular: Cliente? = null

    fun depositar(quantiaDinheiro: Float) {
        this.saldo = quantiaDinheiro + saldo!!
        System.out.println("Deposito Realizado, Seu Novo Saldo é " + saldo!!)
    }

    fun sacar(quantiaDinheiro: Float) {
        this.saldo = saldo!! - quantiaDinheiro
        if (saldo > quantiaDinheiro) {
            System.out.println("Saldo Insuficiente")
        } else {
            System.out.println("Saque realizado com sucesso, Seu novo saldo é: " + saldo!!)

        }
    }
}