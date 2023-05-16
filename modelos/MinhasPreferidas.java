package br.com.maicom.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " Sucesso absoluto" + " Todo mundo gosta!");
        } else {
            System.out.println(audio.getTitulo() + " Todo mundo está curtindo, ouvir depois!");
        }

    }
}
