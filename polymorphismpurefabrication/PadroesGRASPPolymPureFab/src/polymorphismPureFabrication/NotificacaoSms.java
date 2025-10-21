package polymorphismPureFabrication;

//NotificacaoSms.java
public class NotificacaoSms implements Notificacao {
	@Override
	public void enviar(String destinatario, String mensagem) {
		System.out.println(">>> [SMS] Enviando para: " + destinatario);
		System.out.println("Mensagem: " + mensagem.substring(0, Math.min(mensagem.length(), 50)) + "...");
// Lógica real de gateway SMS (com limite de caracteres) estaria aqui.
	}
}