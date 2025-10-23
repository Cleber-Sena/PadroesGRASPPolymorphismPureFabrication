package polimorfPureFab;

//NotificacaoWhatsApp.java
public class NotificacaoWhatsApp implements Notificacao {
	@Override
	public void enviar(String destinatario, String mensagem) {
		System.out.println(">>> [WHATSAPP] Enviando para (Número): " + destinatario);
		System.out.println("Conteúdo (Criptografado): " + mensagem);
// Lógica de API do WhatsApp estaria aqui.
	}
}