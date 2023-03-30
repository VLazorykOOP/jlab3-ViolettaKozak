public class Ccomplex implements Ppair{
    double real, imagine;
    Ccomplex(){this(2.3, 4.1);}
    Ccomplex(double r, double i) {
        real = Math.round(r * 100.0)/100.0;
        imagine = Math.round(i * 100.0)/100.0;
    }

    public Ppair add(Ppair other) {
        Ccomplex o = (Ccomplex) other;
        return new Ccomplex(this.real + o.real, this.imagine + o.imagine);
    }

    public Ppair subtract(Ppair other){
        Ccomplex o = (Ccomplex) other;
        return new Ccomplex(this.real - o.real, this.imagine - o.imagine);
    }

    public Ppair multiply(Ppair other){
        Ccomplex o = (Ccomplex) other;
        double newReal = this.real * o.real - this.imagine * o.imagine;
        double newImagine = this.real * o.imagine + this.imagine * o.real;
        return new Ccomplex(newReal, newImagine);
    }

    @Override
    public String toString(){
        return "real: " + this.real + "  imagine: " + this.imagine;
    }


    @Override
    public boolean equals(Object other){
        if (this == other) {
            return true;
        }
        if (other.getClass() != this.getClass() || other == null) {
            return false;
        }
        Ccomplex o = (Ccomplex) other;
        return (this.real == o.real)&& (this.imagine == o.imagine);
    }

}
