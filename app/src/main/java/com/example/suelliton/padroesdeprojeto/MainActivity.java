package com.example.suelliton.padroesdeprojeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Portao portao = new Portao();//objeto portao -> receiver

        FecharCommand fechar = new FecharCommand(portao);//concreteCommand fechar

        AbrirCommand abrir = new AbrirCommand(portao);//concreteCommand abrir

        Command[] comandos = {abrir,fechar}; //Array de commands

        Controle controle = new Controle(comandos);//Objeto controle -> invoker

        controle.abrirPortao(); //chama o metodo fechar do portao por meio do invoker que chama o execute
                                //do concreteCommand que chama o método do portao
        controle.desfazer();

    }
}
