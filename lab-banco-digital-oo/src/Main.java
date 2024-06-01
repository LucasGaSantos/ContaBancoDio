
public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Isaias de Assunção ");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Amanda Sousa de Bastos");

		Cliente cliente3 = new Cliente();
		cliente3.setNome("Amélia Xavier Montreal");

		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente1);

		Conta cc2 = new ContaCorrente(cliente2);
		Conta poupanca2 = new ContaPoupanca(cliente2);
		
		Conta cc3 = new ContaCorrente(cliente3);
		Conta poupanca3 = new ContaPoupanca(cliente3);

		cc.depositar(1000000);
		cc.transferir(1500, poupanca2);
		cc.transferir(500000, poupanca);
		cc.sacar(1500);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		cc2.depositar(1450.87);
		cc2.transferir(375, poupanca2);
		cc2.transferir(0.01, poupanca3);
		cc2.sacar(10.50);

		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();

		cc3.depositar(17228.99);
		cc3.transferir(1500, poupanca2);
		cc3.sacar(20);


		cc3.imprimirExtrato();
		poupanca3.imprimirExtrato();
	}

}
