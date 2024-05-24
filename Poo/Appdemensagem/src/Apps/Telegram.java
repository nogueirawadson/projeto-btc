package Apps;

public class Telegram extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo Telegram");
    }
    public void receberMensagem(){
        System.out.println("Recebendo pelo Telegram");

    }
}

