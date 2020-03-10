import java.util.Scanner;


public class UIBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leTeclado = new Scanner(System.in);
		final int TOTAL_CLIENTE = 2 ;
		
		
		
		System.out.println("Bem vindo ao Unit Internet Banking ");
		System.out.println("------------------------------------ ");
		
		Cliente clientes[] = new Cliente[TOTAL_CLIENTE];
		
		Conta contas[] = new Conta[TOTAL_CLIENTE];
		
		
		for (int i = 0; i < TOTAL_CLIENTE; i++) {
			clientes[i] = new Cliente();
					
			System.out.println("Digite o Nome do Cliente");
			clientes[i].setNomeCliente(leTeclado.next());
			System.out.println("Digite o cpf do Cliente");
			clientes[i].setCpf(leTeclado.next());
			
		}
		
		for (int i = 0; i < TOTAL_CLIENTE; i++) {
			contas[i] = new Conta();
					
			System.out.println("Digite o Numero da conta ");
			contas[i].setnumeroConta(leTeclado.next());
			
			System.out.println("Digite o saldo do Cliente");
			contas[i].setsaldoConta(leTeclado.nextDouble());
			
			contas[i].setcliente(clientes[i]);
			
		}
		
		contas[0].debitar(100);
		contas[0].creditar(20);
		contas[1].transferir(contas[0], 50.0);
		
		for (int j = 0; j < TOTAL_CLIENTE; j++) {
			System.out.println("Saldo da conta " + contas[j].getnumeroConta() + " é " + contas[j].getnsaldoConta() );
		}
		
		leTeclado.close();
		
	}
}
