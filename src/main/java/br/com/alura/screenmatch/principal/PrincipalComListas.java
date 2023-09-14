package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chegão", 1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);

        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);

        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        lista.forEach(nome -> System.out.println("Com foreach: " + nome.getNome()));

        System.out.println("");

        System.out.println("Méthod Reference");
        lista.forEach(System.out::println);

        System.out.println("");

        for (Titulo item: lista) {
            System.out.println(item.getNome());

            if (item instanceof Filme) {
                Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }
    }
}
