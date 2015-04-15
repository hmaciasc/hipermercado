package hipermercado;

import java.util.ArrayList;

public class Cola {

    private ArrayList<Cliente> listaClientes;
    private boolean abierta;
    private int tamañoMaximo;

    public Cola() {
        this.listaClientes = new ArrayList<Cliente>();
        this.abierta = true;
        this.tamañoMaximo = 0;

    }

    private void añadirFinal(Cliente cliente){
        if (tamañoMaximo < listaClientes.size()){
            tamañoMaximo++;
        }
        if (abierta){
            listaClientes.add(listaClientes.size(), cliente);
        }
    }

    private void añadirPrincipio(Cliente cliente){
        if (tamañoMaximo < listaClientes.size()){
            tamañoMaximo++;
        }
        listaClientes.add(0, cliente);
    }

    private Cliente sacar (){
        if (listaClientes.size() == 0){
            return null;
        }
        Cliente cliente = listaClientes.get(listaClientes.indexOf(0));
        listaClientes.remove(0);
        return cliente;
    }

    private void cerrar(){
        abierta = false;
    }

    private int tamañoMáximo(){
        return tamañoMaximo;
    }
}
