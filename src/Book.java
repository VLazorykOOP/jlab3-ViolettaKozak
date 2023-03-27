import java.time.LocalDate;

public class Book extends PrintEdition{
    String genre;

    Book(){this(LocalDate.of(1987, 2, 18), 20, "Sam Smith", "Georgia", "Story about little boy", "фантастика");}

    Book(LocalDate d, int p, String a, String pu, String n, String g){
        printedIn = d;
        pages = p;
        author = a;
        publishingHouse = pu;
        name = n;
        genre = g;
    }

    @Override
    void Show(){
        System.out.println("Інформація про книгу");
        System.out.println("Назва книги: " + name + "  Автор: " + author);
        System.out.println("Видана: " + printedIn.toString());
        System.out.println("Видавництво: " + publishingHouse + "\nКількість сторінок: " + pages);
        System.out.println("Жанр: " + genre);
    }
}
