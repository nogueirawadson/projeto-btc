public class Usuario {
    public static void main(String[] args) throws Exception {
      
        SmarthTv smarthTv = new SmarthTv();

        System.out.println("Tv Ligada ? " + smarthTv.ligada);
        System.out.println("Canal Atual: " + smarthTv.canal);
        System.out.println("Volume Atual:  " + smarthTv.volume);

        smarthTv.ligar ();
        System.out.println("Novo Status -> Tv Ligada ? " + smarthTv.ligada);


        smarthTv.desligar();
        System.out.println(" Novo Status -> Tv Ligada ?" + smarthTv.ligada);

        smarthTv.aumentarVolume();
        smarthTv.diminuirVolume();

        System.out.println(" Canal Atual: " + smarthTv.canal);
        smarthTv.mudarCanal(13);
        System.out.println(" Novo Canal: " + smarthTv.canal);
        smarthTv.proximoCanal();
        System.out.println(" Próximo Cana: " + smarthTv.canal)
        ;
       

    }
}
