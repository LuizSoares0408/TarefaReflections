import java.lang.annotation.Annotation;

public class App {

    public static void main(String[] args) {

        Class<?> minhaClasse = ClasseComAnotacao.class;

        if (minhaClasse.isAnnotationPresent(Tabela.class)) {
            Tabela anotacaoTabela = minhaClasse.getAnnotation(Tabela.class);

            String nomeDaTabela = anotacaoTabela.TabelaNome();

            System.out.println("O nome da tabela é: " + nomeDaTabela);
        } else {
            System.out.println("A anotação @Tabela não foi encontrada na classe.");
        }
    }
}
