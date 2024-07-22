public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();
        
        System.out.println( "TV ligada? " + smartTV.ligada);
        System.out.println( "Canal Atual: " + smartTV.canal);
        System.out.println( "Volume Atual: " + smartTV.volume);

        smartTV.ligar ();
        System.out.println("Novo status -> TV ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();
        System.out.println("Novo status -> Volume atual: " + smartTV.volume);

        smartTV.mudarCanal(19);
        System.out.println("Novo status -> Canal atual: " + smartTV.canal);
    }
}