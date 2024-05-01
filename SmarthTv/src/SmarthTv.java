public class SmarthTv {
    boolean ligada =false;
    int canal= 1;
    int volume= 25;

    public void ligar () {
        ligada = true;

    }

    public void desligar () {
        ligada = false;
    }
    
    public void aumentarVolume () {
        volume ++;
        System.out.print("Aumentando Volume para: " + volume );
    }

    public void diminuirVolume() {
        volume --;
        System.out.print(" Diminuindo Volume para : " + volume);

    }
    
    public void proximoCanal(){
        canal++;
    }

    public void anteriorCanal () {
        canal --;
    }

    public void mudarCanal (int novoCanal) {
        canal = novoCanal; 

    }

    
}
