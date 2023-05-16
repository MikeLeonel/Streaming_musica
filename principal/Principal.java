package br.com.maicom.minhasmusicas.principal;

import br.com.maicom.minhasmusicas.modelos.MinhasPreferidas;
import br.com.maicom.minhasmusicas.modelos.Musica;
import br.com.maicom.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Waiting on a war");
        minhaMusica.setCantor("Foo fighters");


        for (int i = 0; i < 3000; i++) {
            minhaMusica.reproduz();
            
        }

        for (int i = 0; i < 50; i++) { 
            minhaMusica.curte();

        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Histórias Horripilantes");
        meuPodcast.setApresentador("Renato Castro");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();

        }

        for (int i = 0; i < 400; i++) {
            meuPodcast.curte();

        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);


    }
}


























