public class SmartTv {
    private String marca, modelo;
    private int volume;
    private boolean conectadoInternet;

    public SmartTv() {

    }

    public SmartTv(String marca, String modelo, int volume){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
        this.conectadoInternet = false;
    }


    //setter do volume
    public void setVolume(int volume){
        if(volume >= 0 && volume <= 100){
            this.volume = volume;
        }else{
            System.out.println("Volume inválido");
        }
    }
    public int getVolume(){
        return this.volume;
    }


    public void setMarca(String marca){
        if (marca.length() <= 30){
            this.marca = marca;
        }else{
            System.out.println("Marca tem mais de 30 caracteres");
        }
    }
    public String getMarca(){
        return this.marca;
    }


    public void setModelo(String modelo){
        //todo modelo deve começar com letra maiúscula
        char primeiro = modelo.charAt(0);
        boolean resp = Character.isUpperCase(primeiro);
        if (resp) {
            this.modelo = modelo;
        }
    }
    public String getModelo(){
        return this.modelo;
    }

    public void setConectadoInternet(boolean conectadoInternet){ this.conectadoInternet = conectadoInternet; }
    public Boolean isConectadoInternet(){ return this.conectadoInternet; }

    //abrir Youtube

    public void abrirYoutube(){
        if(this.verificaInternet()){
            System.out.println("Abrindo Youtube");
        }else{
            System.out.println("Youtube não pode ser aberto sem internet");
        }
    }


    //aumentar o volume em x
    public void aumentarVolume(int x){
        this.setVolume (this.volume + x);

    }

    //diminuir o volume em x
    public void diminuirVolume(int x){
        this.setVolume (this.volume - x);
    }

    //verifica internet
    private boolean verificaInternet(){
        System.out.println("Buscando sinal de Wi-fi...");
        System.out.println("Verificando Credenciais...");
        System.out.println("Autenticando IP...");

        // 50% de chance de conectar e 50% de chance de falhar

        int randomico = (int) (Math.random() * 10);
        if (randomico < 5){
            System.out.println("Conectou na Internet");
            return true;
        }
        else{
            System.out.println("Problema na conexão");
            return false;
        }

    }

}