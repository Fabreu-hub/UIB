
public class Conta {

	private String numeroConta;
	private Double saldoConta;
	private Cliente cliente;
	public Double creditar;
	public Double debitar;
	public Double transferir;
	
	
	
	
	
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
	}public Cliente getcliente() {
		return cliente;
	}
	public void setcliente(Cliente donoDaConta) {
		this.cliente = donoDaConta;
	}
	
	public Double getCreditar() {
		return creditar;
	}
	public void setCreditar(Double creditar) {
		this.creditar = creditar;
	}
	public Double getDebitar() {
		return debitar;
	}
	public void setDebitar(Double debitar) {
		this.debitar = debitar;
	}
	public Double getTransferir() {
		return transferir;
	}
	public void setTransferir(Double transferir) {
		this.transferir = transferir;
	}
	
	
	
	
}
