package servicodeMensagem;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadorInternet() {
        System.out.println("Validando se está conectado a internet")
    }


}
