public class Rrational implements Ppair{
    int numerator, denominator;

    public Rrational(){this(3, 5);}
    public Rrational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Ppair add(Ppair other) {
        Rrational r = (Rrational) other;
        int newNumerator = this.numerator * r.denominator + r.numerator * this.denominator;
        int newDenominator = this.denominator * r.denominator;
        return new Rrational(newNumerator, newDenominator);
    }

    public Ppair subtract(Ppair other) {
        Rrational r = (Rrational) other;
        int newNumerator = this.numerator * r.denominator - r.numerator * this.denominator;
        int newDenominator = this.denominator * r.denominator;
        return new Rrational(newNumerator, newDenominator);
    }

    public Ppair multiply(Ppair other) {
        Rrational r = (Rrational) other;
        int newNumerator = this.numerator * r.numerator;
        int newDenominator = this.denominator * r.denominator;
        return new Rrational(newNumerator, newDenominator);
    }

    @Override
    public String toString(){
        return this.numerator + "/" + this.denominator;
    }


    public boolean equals(Object other){
        Rrational o = (Rrational) other;
        if (o.numerator % this.numerator == 0){
            int k = o.numerator /this.numerator;
            return this.denominator * k == o.denominator;
        }
        else if (this.numerator % o.numerator == 0 ){
            int k = this.numerator /o.numerator;
            return this.denominator == o.denominator * k;
        }

        return false;
    }
}
