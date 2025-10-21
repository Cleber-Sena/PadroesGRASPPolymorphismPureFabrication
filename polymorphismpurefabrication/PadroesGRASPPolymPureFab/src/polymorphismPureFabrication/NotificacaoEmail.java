package polymorphismPureFabrication;

//NotificacaoEmail.java
public class NotificacaoEmail implements Notificacao {
	@Override
	public void enviar(String destinatario, String mensagem) {
		System.out.println(">>> [EMAIL] Enviando para: " + destinatario);
		System.out.println("Corpo: " + mensagem);
// Lógica real de conexão com servidor SMTP estaria aqui.
	}
}
