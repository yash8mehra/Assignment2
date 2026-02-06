class CSCI_Fraction_YashMehra{
    private long numerator;
    private long denominator;

    

    
    //things to do from now on
    //make fraction numer over denom
    //for x/y fractions
    public CSCI_Fraction_YashMehra(long numer, long denom){
        if (numer < 0 && denom < 0){ //both negative
            numer = -numer;
            denom = -denom;
        } else if (denom < 0){ //only denom negative
            numer = -numer;
            denom = -denom;
        }
        //simplify the fraction first

        long gcd = greatestCommonDivisor(numer, denom);

        numerator = numer / gcd;
        denominator = denom / gcd;
    }
    //for x/1 fractions
    public CSCI_Fraction_YashMehra(long numer){
        numerator = numer;
        denominator = 1;
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
        long numer = (numerator * fractionadd.denominator) + (fractionadd.numerator * denominator);
        long denom = denominator * fractionadd.denominator;
        return new CSCI_Fraction_YashMehra(numer, denom);

    }
    public CSCI_Fraction_YashMehra subtract(CSCI_Fraction_YashMehra fractionsub){
        long numer = (numerator * fractionsub.denominator) - (fractionsub.numerator * denominator);
        long denom = denominator * fractionsub.denominator;
        return new CSCI_Fraction_YashMehra(numer, denom);


    }
    public CSCI_Fraction_YashMehra multiply(CSCI_Fraction_YashMehra fractionmult){
        long numer = (numerator * fractionmult.numerator);
        long denom = (denominator * fractionmult.denominator);
        return new CSCI_Fraction_YashMehra(numer,denom);


    }
    public CSCI_Fraction_YashMehra divide(CSCI_Fraction_YashMehra fractionDiv){
        long numer = numerator * fractionDiv.denominator;
        long denom = denominator * fractionDiv.numerator;
        return new CSCI_Fraction_YashMehra(numer,denom);


    }
    //raised to power method (pow), negate method (negative)
    public CSCI_Fraction_YashMehra negate(){
            return new CSCI_Fraction_YashMehra(-1 * numerator, denominator);

    }
    public CSCI_Fraction_YashMehra pow(int exp){
        if (exp == 0){
            return new CSCI_Fraction_YashMehra(1); //anything to the zero power is 1
        } else if (exp > 0) {
            long numer = numerator;
            long denom = denominator;
            for (int i = 1; i < exp; i++){
                numer *= numerator;
                denom *= denominator;
            }
                return new CSCI_Fraction_YashMehra(numer, denom);
        } else{ //negative exponent
            long numer = denominator;
            long denom = numerator;
            for (int i = 1; i < (-1*exp); i++){
                numer *= denominator;
                denom *= numerator;
            }
            return new CSCI_Fraction_YashMehra(numer, denom);
        }
            
    }

}










