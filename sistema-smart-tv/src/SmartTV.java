public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("Ligando a TV.");
    }
    public void desligar(){
        ligada = false;
        System.out.println("Desligando a TV.");
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: ");
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: ");
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o canal para: ");
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal para: ");
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando para o canal: ");
    }
}
