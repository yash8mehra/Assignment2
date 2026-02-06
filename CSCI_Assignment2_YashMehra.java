public class CSCI_Assignment2_YashMehra{
    public static void main(String args[]){
        // reduction + normalization
        System.out.println(new CSCI_Fraction_YashMehra(8, -6)); // -4/3
        System.out.println(new CSCI_Fraction_YashMehra(6, 9));  // 2/3
        // special values
        System.out.println(new CSCI_Fraction_YashMehra(23, 0)); // Infinity
        System.out.println(new CSCI_Fraction_YashMehra(-6, 0)); // -Infinity
        System.out.println(new CSCI_Fraction_YashMehra(0, 0));  // NaN
        System.out.println(new CSCI_Fraction_YashMehra(7, 1));  // 7
        // adding
        CSCI_Fraction_YashMehra fraction1 = new CSCI_Fraction_YashMehra(1,2);
        CSCI_Fraction_YashMehra fraction2 = new CSCI_Fraction_YashMehra(1,3);
        System.out.println(fraction1.add(fraction2)); // 5/6
        // subtracting
        System.out.println(fraction1.subtract(fraction2)); // 1/6
        //multiplying
        System.out.println(fraction1.multiply(fraction2 )); // 1/6
        //dividing
        System.out.println(fraction1.divide(fraction2)); // 3/2
        //negating
        System.out.println(fraction1.negate()); // -1/2
        System.out.println(new CSCI_Fraction_YashMehra(5,0).negate()); // -Infinity
        System.out.println(new CSCI_Fraction_YashMehra(0,0).negate()); // NaN
        //powers
        CSCI_Fraction_YashMehra fraction3 = new CSCI_Fraction_YashMehra(2,3);
        System.out.println(fraction3.pow(3));  // 8/27
        System.out.println(fraction3.pow(0));  // 1
        System.out.println(fraction3.pow(-2)); // 9/4

        //all in one combo
        CSCI_Fraction_YashMehra fraction4 = new CSCI_Fraction_YashMehra(4,-2);
        System.out.println((fraction1.add(fraction2.pow(-4)).multiply(fraction3.negate()).pow(2)).divide(fraction4)); // -26569/18
    }
}
