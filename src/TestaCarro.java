public class TestaCarro {
    public static void main (String[] args){ //void porq nao retorna nada
        //instancia obj obj1
        Carro obj1 = new Carro("Fiat ", "Uno ", 0, false);
        System.out.println(obj1); //System - classe    out - objeto    println -metodo
        obj1.ligarCarro();
        System.out.println(obj1);
        obj1.acelerar(100);
        System.out.println(obj1);
        obj1.frear(40);
        System.out.println(obj1);

        Carro obj2 = new Carro("GM ", "Onix ", 0, false);
        System.out.println(obj2);
        obj2.ligarCarro();
        System.out.println(obj2);
        obj2.acelerar(80);
        obj2.frear(60);
        obj2.frear(40);
        System.out.println(obj2);

        // Ao encerrar
        obj1.desligarCarro();
        obj2.desligarCarro();
    }
}
