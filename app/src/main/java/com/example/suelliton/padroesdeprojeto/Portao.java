package com.example.suelliton.padroesdeprojeto;

import android.util.Log;

/**
 * Created by suelliton on 08/11/2017.
 */

public class Portao {
    private int estado;
    private int fechado = 0;
    private int aberto = 1;


    public Portao() {
        fecharPortao();
    }
    public void  fecharPortao(){
        this.estado = fechado;
        Log.i("mensagens","Fechando portao");
    }
    public void abrirPortao(){
        this.estado = aberto;
        Log.i("mensagens","Abrindo portao");
    }
    public void verEstadoPortao(){
        if(this.estado == 0){
           Log.i("mensagens","O portao está fechado");
        }else if(this.estado ==  1){
           Log.i("mensagens","O portao está aberto");
        }

    }

}
