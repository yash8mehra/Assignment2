class CSCI_Fraction_YashMehra{
    private long numerator;
    private long denominator;

    

    
    //things to do from now on
    //make fraction numer over denom
    //for x/y fractions
    public CSCI_Fraction_YashMehra(long numer, long denom){

        //simplify the fraction first

        long gcd = greatestCommonDivisor(numer, denom);

        this.numerator = numer / gcd;
        this.denominator = denom / gcd;
    }
    //for x/1 fractions
    public CSCI_Fraction_YashMehra(long numer){
        this.numerator = numer;
        this.denominator = 1;
    }
    //toString() method
    public String toString(){
    if ((numerator == 0)&&(denominator == 0)){
        return "NaN";
    } else if (denominator == 0){
        if (numerator > 0){
            return "Infinity";
        } else {
            return "-Infinity";
        }
    }
    String strNumer = "" + numerator;
    String strDenom = "" + denominator;
    if (denominator == 1){
        return strNumer;
    }
    return strNumer+"/"+strDenom;

    }
    //gcd
    public long greatestCommonDivisor(long numer, long denom){
        if (numer < 0){
            numer = -numer;
        }
        if (denom < 0){
            denom = -denom;
        }
        while (denom!= 0){
            long remainder = numer % denom;
            numer = denom;
            denom = remainder;
        }
        if (numer == 0){
            numer = 1;
        }
        return numer;
    }
    //adding subtracting multiplying division methods
    public CSCI_Fraction_YashMehra add(CSCI_Fraction_YashMehra fractionadd){
        long numer = (this.numerator * fractionadd.denominator) + (fractionadd.numerator * this.denominator);
        long denom = this.denominator * fractionadd.denominator;
        return new CSCI_Fraction_YashMehra(numer, denom);

    }
    public CSCI_Fraction_YashMehra subtract(CSCI_Fraction_YashMehra fractionsub){
        long numer = (this.numerator * fractionsub.denominator) - (fractionsub.numerator * this.denominator);
        long denom = this.denominator * fractionsub.denominator;
        return new CSCI_Fraction_YashMehra(numer, denom);


    }
    public CSCI_Fraction_YashMehra multiply(){



    }
    public CSCI_Fraction_YashMehra divide(){



    }
    //raised to power method (pow), negate method (negative)
    public CSCI_Fraction_YashMehra negate(){


    }
    public CSCI_Fraction_YashMehra pow(){


    }
    //then main to test 


}










