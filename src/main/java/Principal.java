import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("300");
        filme.setAnoDeLancamento(2019);
        filme.exibeFichaTecnica();
        filme.setDuracaoEmMinutos(180);

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

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        System.out.println(calculadora.getTempoTotal());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Ace Ventura");
        outroFilme.setAnoDeLancamento(1997);
        outroFilme.exibeFichaTecnica();
        outroFilme.setDuracaoEmMinutos(120);

        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
