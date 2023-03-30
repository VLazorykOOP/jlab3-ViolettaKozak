class Complex extends Pair {
    double real, imagine;

    Complex() {
        this(2.3, 5.1);
    }

    Complex(double r, double i) {
        real = Math.round(r * 100.0)/100.0;
        imagine = Math.round(i * 100.0)/100.0;
    }

    public Pair add(Pair other) {
        Complex o = (Complex) other;
        return new Complex(this.real + o.real, this.imagine + o.imagine);
    }

    public Pair subtract(Pair other){
        Complex o = (Complex) other;
        return new Complex(this.real - o.real, this.imagine - o.imagine);
    }

    public Pair multiply(Pair other){
        Complex o = (Complex) other;
        double newReal = this.real * o.real - this.imagine * o.imagine;
        double newImagine = this.real * o.imagine + this.imagine * o.real;
        return new Complex(newReal, newImagine);
    }

    @Override
    public String toString(){
        return "real: " + this.real + "  imagine: " + this.imagine;
    }


    /*
    @Override
    public boolean equals(Object other){
        if(other instanceof Complex){
            if (this.real == (((Complex) other).real) && (this.imagine == (((Complex) other).imagine))) {
                return true;
            }
        }
        return false;
    }*/

    @Override
    public boolean equals(Object other){
        if (this == other) {
            return true;
        }
        if (!(other instanceof Complex)) {
            return false;
        }
        Complex o = (Complex) other;
        return Double.compare(this.real, o.real) == 0 && Double.compare(this.imagine, o.imagine) == 0;
    }

}
