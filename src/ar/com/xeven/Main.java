package ar.com.xeven;

public class Main {

    public static void main(String[] args) {

        Moto moto = new Moto(15);
        Bicicleta bici = new Bicicleta(5);

        moto.acelerar();
        moto.acelerar();
        moto.acelerar();

        bici.acelerar();
        bici.acelerar();
        bici.acelerar();
        bici.frenar();

        System.out.println("La vel. de la moto: "+moto.getVelocidad());
        System.out.println("La vel. de la bici: "+bici.getVelocidad());


    }
}
