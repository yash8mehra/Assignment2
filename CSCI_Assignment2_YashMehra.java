public class CSCI_Assignment2_YashMehra{
    public static void main(String args[]){
        // reduction + normalization
        System.out.println(new CSCI_Fraction_YashMehra(8, -6).toString()); // -4/3
        System.out.println(new CSCI_Fraction_YashMehra(6, 9).toString());  // 2/3
        // special values
        System.out.println(new CSCI_Fraction_YashMehra(23, 0).toString()); // Infinity
        System.out.println(new CSCI_Fraction_YashMehra(-6, 0).toString()); // -Infinity
        System.out.println(new CSCI_Fraction_YashMehra(0, 0).toString());  // NaN
        System.out.println(new CSCI_Fraction_YashMehra(7, 1).toString());  // 7
        // adding
        CSCI_Fraction_YashMehra fraction1 = new CSCI_Fraction_YashMehra(1,2);
        CSCI_Fraction_YashMehra fraction2 = new CSCI_Fraction_YashMehra(1,3);
        System.out.println(fraction1.add(fraction2).toString()); // 5/6
        // subtracting
        System.out.println(fraction1.subtract(fraction2).toString()); // 1/6
        //multiplying
        System.out.println(fraction1.multiply(fraction2 ).toString( )); // 1/6
        //dividing
        System.out.println(fraction1.divide(fraction2).toString()); // 3/2
        //negating
        System.out.println(fraction1.negate().toString()); // -1/2
        System.out.println(new CSCI_Fraction_YashMehra(5,0).negate().toString()); // -Infinity
        System.out.println(new CSCI_Fraction_YashMehra(0,0).negate().toString()); // NaN
        //powers
        CSCI_Fraction_YashMehra fraction3 = new CSCI_Fraction_YashMehra(2,3);
        System.out.println(fraction3.pow(3).toString());  // 8/27
        System.out.println(fraction3.pow(0).toString());  // 1
        System.out.println(fraction3.pow(-2).toString()); // 9/4
        System.out.println("Testing for wakcky cases with operations with NaN, and infinity");
        System.out.println(new CSCI_Fraction_YashMehra(0,0).add(new CSCI_Fraction_YashMehra(1,2)).toString());
        System.out.println("testing for inf + -inf");
        System.out.println(new CSCI_Fraction_YashMehra(1,0).add(new CSCI_Fraction_YashMehra(1,0).negate()).toString());
        System.out.println(new CSCI_Fraction_YashMehra(1,0).subtract(new CSCI_Fraction_YashMehra(1,0).negate()).toString());
    }
}
