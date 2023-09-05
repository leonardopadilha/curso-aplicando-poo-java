import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("300");
        filme.setAnoDeLancamento(2019);
        filme.exibeFichaTecnica();

        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);

        System.out.println(filme.pegaMedia());
        System.out.println(filme.getTotalDeAvaliacoes());

        System.out.println();

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodios(50);
        System.out.println("Duração da série: " + lost.getDuracaoEmMinutos());
    }
}
