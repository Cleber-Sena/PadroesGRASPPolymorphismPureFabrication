package polymorphismPureFabrication;

//ServicoNotificacao.java
//Esta é a Pure Fabrication: inventada para alta coesão/baixo acoplamento.
public class ServicoNotificacao {

// O método recebe a interface, mas usa a implementação concreta que for passada.
	public void notificar(String destinatario, String mensagem, Notificacao tipoNotificacao) {
		System.out.println("\n[ServicoNotificacao] Iniciando rotina de envio...");

// Aqui está o polimorfismo em ação:
// O ServicoNotificacao não se importa se é Email ou SMS,
// ele apenas chama o método 'enviar' do objeto que recebeu.
		tipoNotificacao.enviar(destinatario, mensagem);

		System.out.println("[ServicoNotificacao] Envio concluído.");
	}
}