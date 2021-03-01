import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        ReadFile file = new ReadFile("prospects.txt");

        for (int i = 0; i < ReadFile.lineNumber-1; i++) {
            Customer person = new Customer();
            file.setInfo(person);
            Calculate result = new Calculate(person);

            DecimalFormatSymbols formatSymbols = new DecimalFormatSymbols(Locale.getDefault());
            formatSymbols.setDecimalSeparator('.');
            DecimalFormat formatter = new DecimalFormat("##.00", formatSymbols);

            System.out.println("\n****************************************************************************************************");
            System.out.println("Prospect "+(i+1)+": "+person.getName()+" wants to borrow "+person.getTotalLoan()+" € for a period of "+person.getYears()+" years and pay "+formatter.format(result.getResult())+" € each month");
            System.out.println("****************************************************************************************************");
        }
    }
}