import java.time.LocalDate;

public class Magazine extends PrintEdition{
    String auditory;

    Magazine(){this(LocalDate.of(2009, 8, 24), 15, "Julia Roberts", "SunMoon", "Evvy", "Дівчата підлітки");}
    Magazine(LocalDate d, int p, String a, String pu, String n, String au){
        printedIn = d;
        pages = p;
        author = a;
        publishingHouse = pu;
        name = n;
        auditory = au;
    }

    @Override
    void Show(){
        System.out.println("Інформація про журнал");
        System.out.println("Назва журналу: " + name + "  Засновник: " + author);
        System.out.println("Дата тиражу: " + printedIn.toString());
        System.out.println("Видавництво: " + publishingHouse + "\nКількість сторінок: " + pages);
        System.out.println("Цільова аудиторія: " + auditory);
    }

}
