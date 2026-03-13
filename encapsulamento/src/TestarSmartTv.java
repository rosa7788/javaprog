public class TestarSmartTv {
    public static void main(String[] args){
        SmartTv s1 = new SmartTv();
        s1.setVolume(-40);
        s1.setVolume(130);
        s1.setVolume(50);

        System.out.println("Volume de s1: " + s1.getVolume());

        s1.abrirYoutube();

        SmartTv s2 = new SmartTv("Samsung","Qled de 45 polegadas",0);

        s2.abrirYoutube();

        s2.aumentarVolume(10);
        s2.aumentarVolume(110);

        s2.diminuirVolume(200);
        s2.diminuirVolume(5);

        SmartTv s3 = new SmartTv("LG","WideScreen 65",-30);

        s3.abrirYoutube();
        System.out.println("Volume de s3: " + s3.getVolume());
    }

}