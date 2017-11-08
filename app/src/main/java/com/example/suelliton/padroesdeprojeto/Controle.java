package com.example.suelliton.padroesdeprojeto;

/**
 * Created by suelliton on 08/11/2017.
 */

public class Controle {
    private Command[] commands;
    private Command ultimoComando;

    public Controle(Command[] commands){
        this.commands = commands;
    }
    public void abrirPortao(){
       this.commands[0].execute();
        this.ultimoComando = commands[0];
    }
    public void fecharPortao(){
        this.commands[1].execute();
        this.ultimoComando = commands[1];
    }
    public void desfazer(){
        this.ultimoComando.undo();
    }
}
