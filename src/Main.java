public class Main {

    public static void main(String[] args) {
        System.out.println(" Лабораторна 3");
        ex2();
    }

    static void ex1(){
        System.out.println("Завдання 1");
        PrintEdition a = new PrintEdition();
        Book b = new Book();
        Magazine m = new Magazine();
        Textbook t = new Textbook();
        a.Show();
        System.out.println("\n");
        b.Show();
        System.out.println("\n");
        m.Show();
        System.out.println("\n");
        t.Show();

        PrintEdition[] p = new PrintEdition[3];

        p[0] = b;
        p[1] = m;
        p[2] = t;

        System.out.println("Масив суперкласу: ");
        for (int i =0; i<3;i++){
            System.out.println();
            p[i].Show();
        }
    }

    static void ex2(){
        System.out.println("\nЗавдання 2");
        Complex c1 = new Complex();
        Complex c2 = new Complex(1.4, 7.3);
        Rational r1 = new Rational();
        Rational r2 = new Rational(4, 9);

        Complex c3 = (Complex) c1.add(c2);
        System.out.println("c1 + c2 = " + c3);
        System.out.println("c1 == c3: " + (c1 == c3));
        Complex c = (Complex) c3.subtract(c2);
        boolean b = c == c1;
        System.out.println("c3 - c2 == c1: " + (c1 == c));
    }
}
