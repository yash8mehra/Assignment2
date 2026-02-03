class CSCI_Fraction_YashMehra{
    private int numerator;
    private int denominator;

    

    
    //things to do from now on
    //make fraction numer over denom
    public CSCI_Fraction_YashMehra(){
        this.numerator = 0;
        this.denominator = 1;
    }

    //getters
    

    //toString() method
    public String toString(int numerator, int denominator){
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
    //Simplify the fraction 
    public void simplifyFraction(){

    }
    //gcd
    public int greatestCommonDivisor(int a, int b){
        if ( a < 0 ){
            negate(a);}
        int remainder = 0;

            while (b != 0){
                remainder = a % b;
                a = b;
                b = remainder;
            }
                if (a == 0){
                    a = 1;
                    return 
                }
    }
    //adding subtracting multiplying division methods
    public CSCI_Fraction_YashMehra add(){


    }
    public CSCI_Fraction_YashMehra subtract(){


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










