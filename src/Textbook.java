import java.time.LocalDate;

public class Textbook extends Book{
    int clas;

    Textbook(){this(LocalDate.of(2019, 9, 18), 578, "Георгій Петренко", "Абабагаламага", "Математика", "Науковий", 6);}
    Textbook(LocalDate d, int p, String a, String pu, String n, String g, int c){
        printedIn = d;
        pages = p;
        author = a;
        publishingHouse = pu;
        name = n;
        genre = g;
        clas = c;
    }

    @Override
    void Show(){
        System.out.println("Інформація про підручник");
        System.out.println("Назва: " + name + "  Автор: " + author);
        System.out.println("Виданий: " + printedIn.toString());
        System.out.println("Видавництво: " + publishingHouse + "\nКількість сторінок: " + pages);
        System.out.println("Жанр: " + genre);
        System.out.println("Клас: " + clas);
    }
}
