import org.jetbrains.annotations.NotNull;

public class Rational extends Pair{
    int numerator, denominator;

    public Rational(){this(3, 5);}
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Pair add(Pair other) {
        Rational r = (Rational) other;
        int newNumerator = this.numerator * r.denominator + r.numerator * this.denominator;
        int newDenominator = this.denominator * r.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Pair subtract(Pair other) {
        Rational r = (Rational) other;
        int newNumerator = this.numerator * r.denominator - r.numerator * this.denominator;
        int newDenominator = this.denominator * r.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Pair multiply(Pair other) {
        Rational r = (Rational) other;
        int newNumerator = this.numerator * r.numerator;
        int newDenominator = this.denominator * r.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    @Override
    public String toString(){
        return this.numerator + "/" + this.denominator;
    }


    public boolean equals(Object other){
        Rational o = (Rational) other;
        if (o.numerator % this.numerator == 0){
            int k = o.numerator /this.numerator;
            return this.denominator % k == 0 && o.denominator % k == 0;
        }
        else if (this.numerator % o.numerator == 0 ){
            int k = this.numerator /o.numerator;
            return this.denominator % k == 0 && o.denominator % k == 0;
        }

        return false;
    }
}

