public class Calculate {

    private double E = 0;

    /**
     * Calculates the monthly payment for the person
     * @param person the person to be accessed for information
     */
    public Calculate(Customer person) {
        double n1, n2;

        double b = person.getInterest();
        b /= 100;
        b /= 12;
        double b2 = b;

        double U = person.getTotalLoan();
        int p = 12*person.getYears();

        b +=1;

        b = Calculate.pow(b,p);

        n1 = b*b2;
        n2 = b-1;

        E = U*(n1/n2);
    }

    /**
     * Method to calculate pow
     * @param base the base number
     * @param exponent the exponent number
     * @return the result
     */
    public static double pow(double base, int exponent) {
        double result = 1;
        if (exponent != 0) {
            int absExponent = exponent > 0 ? exponent : (-1) * exponent;
            for (int i = 1; i <= absExponent; i++) {
                result *= base;
            }

            if (exponent < 0) {
                result = 1.0 / result;
            }
        } else {
            result = 1;
        }

        return result;
    }

    /**
     * Returns the result
     * @return the result
     */
    public double getResult() {
        return E;
    }
}
