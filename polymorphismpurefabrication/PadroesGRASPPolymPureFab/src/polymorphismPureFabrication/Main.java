package polymorphismPureFabrication;

//Main.java (Demonstração)
public class Main {
	public static void main(String[] args) {
// Objeto de Domínio
		Pedido pedido = new Pedido("P1234", "cliente@email.com", "5511987654321");
// Pure Fabrication (o objeto "inventado")
		ServicoNotificacao notificador = new ServicoNotificacao();

		String mensagem = "Seu pedido " + pedido.getId() + " foi ATUALIZADO.";
// --- Cenário 1: Notificação por Email ---

// Objeto de Notificação (Implementação Específica)
		Notificacao email = new NotificacaoEmail();

// O ServicoNotificacao recebe a implementação Email (Polimorfismo)
		pedido.setStatus("EM SEPARAÇÃO");
		notificador.notificar(pedido.getClienteEmail(), mensagem + " Novo Status: " + pedido.getStatus(), email);
// --- Cenário 2: Notificação por SMS ---

// Trocamos o objeto de Notificação. O código do ServicoNotificacao NÃO MUDOU.
		Notificacao sms = new NotificacaoSms();

// O ServicoNotificacao recebe a implementação SMS (Polimorfismo)
		pedido.setStatus("ENTREGUE");
		notificador.notificar(pedido.getClienteTelefone(), mensagem + " Novo Status: " + pedido.getStatus(), sms);
		
		//Objeto de Notificação
		Notificacao whatsapp = new NotificacaoWhatsApp();
	}
}
