import models.Book;

public class BookRunner {

    public static void main(String[] args)
    {
        Book livro1 = new Book();
        livro1.setTitulo("the Art Of Computer Programming");
        livro1.incrementaversao();

        Book livro2 = new Book();
        livro2.setTitulo("Effective Java");
        livro2.incrementaversao();

        Book livro3 = new Book();
        livro3.setTitulo("Não sei o titulo");
        livro3.incrementaversao();
        livro3.incrementaversao();

        System.out.println("O nome do livro é " + livro1.getTitulo() + " versao: " + livro1.getVersao());
        System.out.println("O nome do livro é " + livro2.getTitulo() + " versao: " + livro2.getVersao());
        System.out.println("O nome do livro é " + livro3.getTitulo() + " versao: " + livro3.getVersao());

    }
}
