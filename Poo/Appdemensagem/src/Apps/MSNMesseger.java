package Apps;

public class MSNMesseger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo MSN Messeger");
    }
    public void receberMensagem(){
            System.out.println("Recebendo pelo MSN Messeger");

    }
}
