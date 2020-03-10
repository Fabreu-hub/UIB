
public class Conta {

	private String numeroConta;
	private Double saldoConta;
	private Cliente cliente;

	public String getnumeroConta() {
		return numeroConta;
	}

	public void setnumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getnsaldoConta() {
		return saldoConta;
	}

	public void setsaldoConta(Double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public Cliente getcliente() {
		return cliente;
	}

	public void setcliente(Cliente donoDaConta) {
		this.cliente = donoDaConta;
	}

	public void creditar(double valor) {

		saldoConta += valor;

	}

	public void debitar(double valor) {

		saldoConta -= valor;

	}

	//método de transferencia entre contas

	public void transferir(Conta contaDestino , Double valor) {
		
		debitar(valor);
		
		contaDestino.creditar(valor);
		
	}

}
