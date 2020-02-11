
public class UIBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente clientes = new Cliente();
		Conta conta = new Conta();
		
		clientes.cpf = "09574041409";
		clientes.nomeCliente = "filipe abreu";
		
		conta.numeroConta = "224786";
		conta.saldoConta = 4000.0;
		conta.donoDaConta = clientes;
		
		System.out.println(clientes.cpf);
		System.out.println(clientes.nomeCliente);
		
		System.out.println(conta.numeroConta);
		System.out.println(conta.saldoConta);
		
		System.out.println(conta.donoDaConta.nomeCliente + " tem " + conta.saldoConta);
		
	}

}
