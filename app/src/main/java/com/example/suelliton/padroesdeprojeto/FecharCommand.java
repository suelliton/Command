package com.example.suelliton.padroesdeprojeto;

/**
 * Created by suelliton on 08/11/2017.
 */

public class FecharCommand extends Command {
    private Portao portao ;

    public FecharCommand(Portao portao){
        this.portao = portao;
    }

    @Override
    public void execute() {
        portao.fecharPortao();
    }

    @Override
    public void undo() {
        portao.abrirPortao();
    }
}
