package ar.com.xeven;

public class Automovil {
    private int velocidad;

    public Automovil(int velocidad){
        this.velocidad = velocidad;
    }

    public void frenar(){
        velocidad--;
    }
    public void acelerar(){
        velocidad++;
    }
    public int getVelocidad(){
        return velocidad;
    }
}
