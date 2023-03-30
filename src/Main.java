public class Main {

    public static void main(String[] args) {
        System.out.println(" Лабораторна 3");
        ex1();
        ex2();
        ex3();

    }

    static void ex1(){
        System.out.println("Завдання 1");
        PrintEdition a = new PrintEdition();
        Book b = new Book();
        Magazine m = new Magazine();
        Textbook t = new Textbook();

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
        System.out.println("c1 == c3: " + (c1.equals(c3)));
        Complex c = (Complex) c3.subtract(c2);
        System.out.println("c3 - c2 == c1: " + (c1.equals(c)));
        System.out.println("c2 * c = " + c2.multiply(c));

        Rational r3 = (Rational) r2.subtract(r1);
        System.out.println("r2 - r1 = " + r3);
        System.out.println("r1 == r3: " + (r1.equals(r3)));
        Rational r = (Rational) r3.add(r1);
        System.out.println("r3 + r1 == r2: " + (r2.equals(r)));
        System.out.println("r2 * r3 = " + r2.multiply(r3));
    }

    static void ex3(){
        System.out.println("\nЗавдання 3");
        Ccomplex c1 = new Ccomplex();
        Ccomplex c2 = new Ccomplex(1.4, 7.3);
        Rrational r1 = new Rrational();
        Rrational r2 = new Rrational(4, 9);

        Ccomplex c3 = (Ccomplex) c1.add(c2);
        System.out.println("c1 + c2 = " + c3);
        System.out.println("c1 == c3: " + (c1.equals(c3)));
        Ccomplex c = (Ccomplex) c3.subtract(c2);
        System.out.println("c3 - c2 == c1: " + (c1.equals(c)));
        System.out.println("c2 * c = " + c2.multiply(c));

        Rrational r3 = (Rrational) r2.subtract(r1);
        System.out.println("r2 - r1 = " + r3);
        System.out.println("r1 == r3: " + (r1.equals(r3)));
        Rrational r = (Rrational) r3.add(r1);
        System.out.println("r3 + r1 == r2: " + (r2.equals(r)));
        System.out.println("r2 * r3 = " + r2.multiply(r3));
    }
}
