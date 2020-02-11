
public class UIBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente clientes = new Cliente();
		Conta conta = new Conta();
		
		clientes.CPF = "09574041409";
		clientes.NomeCliente = "filipe abreu";
		conta.NumeroConta = "224786";
		conta.SaldoConta = 4000.0;		
		
		System.out.println(clientes.CPF);
		System.out.println(clientes.NomeCliente);
		System.out.println(conta.NumeroConta);
		System.out.println(conta.SaldoConta);
		
		
	}

}
