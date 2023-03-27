import java.time.LocalDate;
public class PrintEdition {
    LocalDate printedIn;
    int pages;
    String author, publishingHouse, name;

    PrintEdition(){ this(LocalDate.of(1987, 2, 18), 20, "Sam Smith", "Georgia", "Story about little boy");}

    PrintEdition(LocalDate d, int p, String a, String pu, String n){
        printedIn = d;
        pages = p;
        author = a;
        publishingHouse = pu;
        name = n;
    }

    void Show(){
        System.out.println("Інформація про друковане видання");
        System.out.println("Назва видання: " + name + "  Автор: " + author);
        System.out.println("Виданий: " + printedIn.toString());
        System.out.println("Видавництво: " + publishingHouse + "\nКількість сторінок: " + pages);
    }
}
