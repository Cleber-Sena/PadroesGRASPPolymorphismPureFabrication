package polimorfPureFab;

//Pedido.java (Classe de Domínio Simples)
public class Pedido {
	private String id;
	private String status;
	private String clienteEmail;
	private String clienteTelefone;

// O Pedido NÃO tem a responsabilidade de notificar.

	public Pedido(String id, String email, String telefone) {
		this.id = id;
		this.status = "PENDENTE";
		this.clienteEmail = email;
		this.clienteTelefone = telefone;
	}

	// pegando id
	public String getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}

	public String getClienteEmail() {
		return clienteEmail;
	}

	public String getClienteTelefone() {
		return clienteTelefone;
	}

// O Pedido apenas muda seu estado. A notificação é delegada externamente.
	public void setStatus(String status) {
		this.status = status;
	}

}