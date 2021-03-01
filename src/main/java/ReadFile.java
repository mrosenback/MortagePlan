import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    private final String[] lineArray = new String[20];
    private int i = 1;
    public static int lineNumber = 0;

    public ReadFile(String file) {
        try {
            File filePath = new File(file);

            Scanner scnr = new Scanner(filePath);

            while(scnr.hasNextLine()){
                String line = scnr.nextLine();
                if(line.contains("\"")) {
                    line = line.replace("\"", "");
                    line = line.replace(",A", " A");
                } else if(!line.contains(",")) {
                    break;
                }
                lineArray[lineNumber] = line;
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void setInfo(Customer person) {
        String line = lineArray[i];
        String[] infoArray = line.split(",", -2);

        person.setName(infoArray[0]);
        person.setTotalLoan(Double.parseDouble(infoArray[1]));
        person.setInterest(Double.parseDouble(infoArray[2]));
        person.setYears(Integer.parseInt(infoArray[3]));

        i++;
    }
}

