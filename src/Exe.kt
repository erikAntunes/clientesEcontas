object Exe {

    fun main(args: Array<String>) {

        val cliente1 = Cliente()
        cliente1.setNome("Erik")
        cliente1.setSobrenome("Antunes")


        val cliente2 = Cliente()
        cliente2.setNome("Fabio")
        cliente2.setSobrenome("Tadashi")

        val conta1 = Conta()

        conta1.setNumeroConta("12345")
        conta1.setSaldo(100f)
        conta1.setTitular(cliente1)

        val conta2 = Conta()
        conta2.setNumeroConta("123456")
        conta2.setSaldo(1000f)
        conta2.setTitular(cliente2)


        conta1.depositar(100f)
        conta1.sacar(50f)

        conta2.depositar(500f)
        conta2.sacar(1000f)

    }
}
