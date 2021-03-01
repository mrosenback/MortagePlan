import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    private final String[] lineArray = new String[20];
    private int i = 1;
    public static int lineNumber = 0;

    /**
     * Reads the file and splits it in parts for each line. Each line is then stored in an array
     * @param file the file to be read
     */
    public ReadFile(String file) {
        try {
            File filePath = new File(file);

            Scanner scnr = new Scanner(filePath);

            while(scnr.hasNextLine()){
                String line = scnr.nextLine();
                //Some cleanup of the text
                if(line.contains("\"")) {
                    line = line.replace("\"", "");
                    line = line.replace(",A", " A");
                  //Won't read more of the file if the current line doesn't contain information
                } else if(!line.contains(",")) {
                    break;
                }
                //Each line is stored in the array
                lineArray[lineNumber] = line;
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * The line is split after each comma and stored in an array. The information is then set on the person
     * @param person the person to receive the information
     */
    public void setInfo(Customer person) {
        String line = lineArray[i];
        //Splits the line after each comma and is stored in the array
        String[] infoArray = line.split(",", -2);

        person.setName(infoArray[0]);
        person.setTotalLoan(Double.parseDouble(infoArray[1]));
        person.setInterest(Double.parseDouble(infoArray[2]));
        person.setYears(Integer.parseInt(infoArray[3]));

        i++;
    }
}

