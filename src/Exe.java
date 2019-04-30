public class Exe {

    public static void main(String[] args) {

    Cliente cliente1 = new Cliente();
        cliente1.setNome("Erik");
        cliente1.setSobrenome("Antunes");


    Cliente cliente2 = new Cliente();
        cliente2.setNome("Fabio");
        cliente2.setSobrenome("Tadashi");

    Conta conta1 = new Conta();

        conta1.setNumeroConta("12345");
        conta1.setSaldo(100F);
        conta1.setTitular(cliente1);

    Conta conta2 = new Conta();
        conta2.setNumeroConta("123456");
        conta2.setSaldo(1000F);
        conta2.setTitular(cliente2);


    conta1.depositar (100F);
    conta1.sacar(50F);

    conta2.depositar(500F);
    conta2.sacar(1000F);

    }
}
