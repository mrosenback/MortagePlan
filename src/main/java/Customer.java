public class Customer {
    private String name;
    private double totalLoan;
    private double interest;
    private int years;

    /**
     * Returns the name
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the total loan
     * @return the total loan
     */
    public double getTotalLoan() {
        return totalLoan;
    }

    /**
     * Set the total loan
     * @param totalLoan the total loan
     */
    public void setTotalLoan(double totalLoan) {
        this.totalLoan = totalLoan;
    }

    /**
     * Returns the interest
     * @return the interest
     */
    public double getInterest() {
        return interest;
    }

    /**
     * Sets the interest
     * @param interest the interest
     */
    public void setInterest(double interest) {
        this.interest = interest;
    }

    /**
     * Returns the years
     * @return the years
     */
    public int getYears() {
        return years;
    }

    /**
     * Sets the years
     * @param years the years
     */
    public void setYears(int years) {
        this.years = years;
    }
}
