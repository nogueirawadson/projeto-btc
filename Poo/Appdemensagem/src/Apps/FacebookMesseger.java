package Apps;

public class FacebookMesseger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo Facebook");
    }
    public void receberMensagem(){
        System.out.println("Recebendo pelo Facebook");

    }
}

