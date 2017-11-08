package com.example.suelliton.padroesdeprojeto;

/**
 * Created by suelliton on 08/11/2017.
 */

public class AbrirCommand extends Command {
    private Portao portao;

    public AbrirCommand(Portao portao){
        this.portao = portao;
    }
    @Override
    public void execute() {
        portao.abrirPortao();
    }

    @Override
    public void undo() {
        portao.fecharPortao();
    }
}
