package hipermercado;

public class Contabilidad {

    private int saldo;

    public Contabilidad() {
        this.saldo = 0;
    }

    private void añadeSaldo(int cantidad){
        this.saldo += cantidad;
    }

    private int dameSaldo (){
        return saldo;
    }

}
