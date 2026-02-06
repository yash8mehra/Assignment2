/*************************************************************************
* Project 2 for CSCI 271-001 Spring 2026
*
* Author: Yash Mehra
* OS: Ubuntu Debian Linux 21.1/ Windows 11
* Compiler: javac 25.0.1
* Date: February 6, 2026
*
* Purpose
* This program defines a fraction class that can be used to 
perform various operations on fractions, such as: 
addition, subtraction, multiplication, division, negation, and exponentiation. 
The class also includes a method for simplifying fractions 
and a method for converting the fraction to a string representation. 
The program is designed to handle edge cases such as zero denominators and negative values.
*
*************************************************************************/
/*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* <Yash Mehra>
* <Student's WID>
********************************************************************/




class CSCI_Fraction_YashMehra{
    private final long numerator;
    private final long denominator;

    

    
    /*****************************<CSCI_Fraction_YashMehra>****************************
* Description: A constructor for 2 variables, numerator and denominator.
*
* Parameters: numer: long number for numerator, denom: long number for denominator
*
* Pre: They must be long integers.
*
* Post: Simplifies the fraction in the form x,y where x is numerator and y is denominator.
*
* Returns: no returns
*
* Called by: main
* Calls: greatestCommonDivisor
************************************************************************/
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
    /*****************************<CSCI_Fraction_YashMehra>****************************
* Description: Also a constructor for just numerator, sets denom to 1
*
* Parameters: numer: long number for numerator
*
* Pre: numer must be a long integer.
*
* Post: Sets the numerator to the given value and denominator to 1.
*
* Returns: no returns
*
* Called by: main
* Calls: nothing
************************************************************************/
    public CSCI_Fraction_YashMehra(long numer){
        numerator = numer;
        denominator = 1;
    }
    /*****************************<toString>****************************
* Description: Returns a string version of the fraction.
*
* Parameters: None
*
* Pre: Everything before worked and fraction is correct
*
* Post: returns the fraction as string in the correct form like 
x/y, x/1, NAN, Infinity, or -Infinity
*
* Returns: returns x/y if everything normal, x if denominator is 1, 
NAN if both numerator and denominator are 0,
*
* Called by: main
* Calls: nothing
************************************************************************/
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
    /*****************************<greatestCommonDivisor>****************************
* Description: uses the formula provided to find the gcd, used for simplifying
*
* Parameters: long integer numerator, long integer denominator
*
* Pre: numerator and denominator must be long integers, and not both 0
*
* Post: It will be a string
*
* Returns: returns the greatest common divisor of the numerator and denominator, 
which is used to simplify the fraction.
*
* Called by: Constructor
* Calls: nothing
****/
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
    /*****************************<add>****************************
* Description: adds the fraction that's given with current fraction
*
* Parameters: takes in a fraction to add to the current fraction
*
* Pre: an actual fraction
*
* Post: the output will be the sum of the two fractions if they were valid
*
* Returns: returns the sum of the two fractions
*
* Called by: main
* Calls: constructor
************************************************************************/
    public CSCI_Fraction_YashMehra add(CSCI_Fraction_YashMehra fractionAdd){
        if(fractionAdd.toString().equals("NaN") || this.toString().equals("NaN")){
            return new CSCI_Fraction_YashMehra(0,0); //NaN
        } else if (fractionAdd.toString().equals("Infinity") && this.toString().equals("-Infinity")) {
            return new CSCI_Fraction_YashMehra(0,1); //zero
        } else if (fractionAdd.toString().equals("-Infinity") && this.toString().equals("Infinity")) {
            return new CSCI_Fraction_YashMehra(0,1); //zero
        } else if (fractionAdd.toString().equals("Infinity") || this.toString().equals("Infinity")){
            return new CSCI_Fraction_YashMehra(1,0); //Infinity
        } else if (fractionAdd.toString().equals("-Infinity") || this.toString().equals("-Infinity")){
            return new CSCI_Fraction_YashMehra(-1,0); //-Infinity
        } 
        long numer = (numerator * fractionAdd.denominator) + (fractionAdd.numerator * denominator);
        long denom = denominator * fractionAdd.denominator;
        return new CSCI_Fraction_YashMehra(numer, denom);

    }
    /*****************************<subtract>****************************
* Description: subtracts the fraction that's given with current fraction
*
* Parameters:  takes in a fraction to subtract from the current fraction
*
* Pre: an actual fraction
*
* Post: output will be a fraction
*
* Returns: The difference between the two fractioins
*
* Called by: main
* Calls: constructor    
************************************************************************/
    public CSCI_Fraction_YashMehra subtract(CSCI_Fraction_YashMehra fractionSub){
        if(fractionSub.toString().equals("NaN") || this.toString().equals("NaN")){
            return new CSCI_Fraction_YashMehra(0); //NaN
        } else if (fractionSub.toString().equals("Infinity") && this.toString().equals("-Infinity")) {
            return new CSCI_Fraction_YashMehra(-1); //zero
        } else if (fractionSub.toString().equals("-Infinity") && this.toString().equals("Infinity")) {
            return new CSCI_Fraction_YashMehra(0,1); //zero
        }else if (fractionSub.toString().equals("Infinity") || this.toString().equals("Infinity")){
            return new CSCI_Fraction_YashMehra(-1); //-Infinity
        } else if (fractionSub.toString().equals("-Infinity") || this.toString().equals("-Infinity")){
            return new CSCI_Fraction_YashMehra(1); //Infinity
        }
        long numer = (numerator * fractionSub.denominator) - (fractionSub.numerator * denominator);
        long denom = denominator * fractionSub.denominator;
        return new CSCI_Fraction_YashMehra(numer, denom);


    }
    /*****************************<multiply>****************************
* Description: multiplies the two given fractions together
*
* Parameters:  takes in a fraction to multiply to the current fraction
*
* Pre: must be fraction objects
*
* Post: returns the product of the two fractions of type fractions
*
* Returns: the product
*
* Called by: main
* Calls: constructor
************************************************************************/
    public CSCI_Fraction_YashMehra multiply(CSCI_Fraction_YashMehra fractionMult){
        if (fractionMult.toString().equals("NaN") || this.toString().equals("NaN")){
            return new CSCI_Fraction_YashMehra(0,0); //NaN
        } else if (fractionMult.toString().equals("Infinity") || this.toString().equals("Infinity")){
            return new CSCI_Fraction_YashMehra(1,0); //Infinity
        } else if (fractionMult.toString().equals("-Infinity") || this.toString().equals("-Infinity")){
            return new CSCI_Fraction_YashMehra(-1,0); //-Infinity
        }
        long numer = (numerator * fractionMult.numerator);
        long denom = (denominator * fractionMult.denominator);
        return new CSCI_Fraction_YashMehra(numer,denom);


    }
    /*****************************<Divide>****************************
* Description: performs division of the current fraction by the given fraction,
 which is done by multiplying the current fraction by the reciprocal of the given fraction.
*
* Parameters:  takes in a fraction to divide the current fraction by
*
* Pre: fraction objects 
*
* Post: returns "product" since im multiplying by reciprocal
*
* Returns: Describe what value the function returns, if any.
*
* Called by: list the name(s) of the function(s) that call this one.
* Calls: list the name(s) of the function(s) that this one calls.
************************************************************************/
    public CSCI_Fraction_YashMehra divide(CSCI_Fraction_YashMehra fractionDiv){
        if(fractionDiv.toString().equals("NaN") || this.toString().equals("NaN")){
            return new CSCI_Fraction_YashMehra(0,0); //NaN
        } else if (fractionDiv.toString().equals("Infinity") || this.toString().equals("Infinity")){
            return new CSCI_Fraction_YashMehra(0,1); //0
        } else if (fractionDiv.toString().equals("-Infinity") || this.toString().equals("-Infinity")){
            return new CSCI_Fraction_YashMehra(0,1); //0
        } else if (fractionDiv.toString().equals("0") || this.toString().equals("0")){
            return new CSCI_Fraction_YashMehra(0,1); //0
        }
        //using the reciprocal
        long numer = numerator * fractionDiv.denominator;
        long denom = denominator * fractionDiv.numerator;
        return new CSCI_Fraction_YashMehra(numer,denom);


    }
    /*****************************<Negates>****************************
* Description: It takes in a fraction and returns the negation of it.
*
* Parameters: a list each parameter the function takes
*
* Pre: type fraction
*
* Post: returns tyep fraction of negation
*
* Returns: the negative of the input or NaN if input was NaN
*
* Called by: main
* Calls: nothing
************************************************************************/
    //raised to power method (pow), negate method (negative)
    public CSCI_Fraction_YashMehra negate(){
            return new CSCI_Fraction_YashMehra(-1 * numerator, denominator);

    }
    /*****************************<pow>****************************
* Description: it returns the fraction to a certain power, only integers and 0
*
* Parameters: an integer exponent
*
* Pre: it should be an integer exponent because I didn't think about squareroots
*
* Post: type fraction and fraction to the power
*
* Returns: the fraction to a power, if 0 returns 1, and if negative then reciprocals
*
* Called by: main
* Calls: nothing
************************************************************************/
    public CSCI_Fraction_YashMehra pow(int exp){
        if (exp == 0){
            return new CSCI_Fraction_YashMehra(1); //anything to the zero power is 1
        } else if (exp > 0) {
            long numer = numerator;
            long denom = denominator;
            //loops through the number of exponent and multiplies
            //the numerator and denominator by the proper amount
            for (int i = 1; i < exp; i++){
                numer *= numerator;
                denom *= denominator;
            }
                return new CSCI_Fraction_YashMehra(numer, denom);
        } else{ //negative exponent
            long numer = denominator;
            long denom = numerator;
            //loops through the number of exponent multiplied by
            //-1 because its a negative exponent and multiplies
            //the numerator and denominator by the proper amount
            for (int i = 1; i < (-1*exp); i++){
                numer *= denominator;
                denom *= numerator;
            }
            return new CSCI_Fraction_YashMehra(numer, denom);
        }
            
    }

}