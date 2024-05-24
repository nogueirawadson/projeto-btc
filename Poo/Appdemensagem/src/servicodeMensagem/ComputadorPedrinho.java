package servicodeMensagem;

import Apps.FacebookMesseger;
import Apps.MSNMesseger;
import Apps.ServicoMensagemInstantanea;
import Apps.Telegram;

public class ComputadorPedrinho {
            public static void main(String[] args) {

                ServicoMensagemInstantanea smi = null;

		/*
		    NÃO SE SABE QUAL APP
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
                String appEscolhido="tlg";

                if(appEscolhido.equals("msn"))
                    smi = new MSNMesseger();
                else if(appEscolhido.equals("fbm"))
                    smi = new FacebookMesseger();
                else if(appEscolhido.equals("tlg"))
                    smi = new Telegram();


                smi.enviarMensagem();
                smi.receberMensagem();


            }
        }
