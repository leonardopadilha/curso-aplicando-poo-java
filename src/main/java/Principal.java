import br.com.alura.screenmatch.modelos.Filme;

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
    }
}
