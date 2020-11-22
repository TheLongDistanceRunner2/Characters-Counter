import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class FileAnaylizer {
    String file_name;
    int numberOfAllLetters;

    private Vector<String> inputs = new Vector<String>();
    char[] tab;
    int[] counter;

    public FileAnaylizer(String file_name) throws IOException {
        this.file_name = file_name;
        this.numberOfAllLetters = 0;
        this.counter = new int[36];

        this.tab = new char[36];
        this.tab[0] = '0';
        this.tab[1] = '1';
        this.tab[2] = '2';
        this.tab[3] = '3';
        this.tab[4] = '4';
        this.tab[5] = '5';
        this.tab[6] = '6';
        this.tab[7] = '7';
        this.tab[8] = '8';
        this.tab[9] = '9';
        this.tab[10] = 'A';
        this.tab[11] = 'B';
        this.tab[12] = 'C';
        this.tab[13] = 'D';
        this.tab[14] = 'E';
        this.tab[15] = 'F';
        this.tab[16] = 'G';
        this.tab[17] = 'H';
        this.tab[18] = 'I';
        this.tab[19] = 'J';
        this.tab[20] = 'K';
        this.tab[21] = 'L';
        this.tab[22] = 'M';
        this.tab[23] = 'N';
        this.tab[24] = 'O';
        this.tab[25] = 'P';
        this.tab[26] = 'Q';
        this.tab[27] = 'R';
        this.tab[28] = 'S';
        this.tab[29] = 'T';
        this.tab[30] = 'U';
        this.tab[31] = 'V';
        this.tab[32] = 'W';
        this.tab[33] = 'X';
        this.tab[34] = 'Y';
        this.tab[35] = 'Z';

        readFile();
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    private void readFile() throws IOException {
        FileInputStream inputStream = null;
        Scanner sc = null;

        try {
            inputStream = new FileInputStream(file_name);
            sc = new Scanner(inputStream, "UTF-8");

            // read all the lines and put them into vector inputs:
            while (sc.hasNextLine()) {
                // read next line:
                String line = sc.nextLine();
                // tmp string to convert signs to uppercase:
                String tmp = "";

                // convert all signs to uppercase:
                for (int i = 0; i < line.length(); i++) {
                    tmp = line.toUpperCase();
                }

                System.out.println(tmp);

                // add converted string to vector inputs:
                inputs.add(tmp);
            }

            // note that Scanner suppresses exceptions
            if (sc.ioException() != null) {
                throw sc.ioException();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (sc != null) {
                sc.close();
            }
        }
    }

    public void analyzeFile() {
        char character;

        // analize the whole file:
        for (int i = 0; i < inputs.size(); i++) {
            // analyze each line:
            for (int j = 0; j < inputs.elementAt(i).length(); j++) {
                // catch current letter from input:
                character = inputs.elementAt(i).charAt(j);

                // increment appropriate counter:
                if(character == tab[0]) {
                    counter[0]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[1]) {
                    counter[1]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[2]) {
                    counter[2]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[3]) {
                    counter[3]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[4]) {
                    counter[4]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[5]) {
                    counter[5]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[6]) {
                    counter[6]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[7]) {
                    counter[7]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[8]) {
                    counter[8]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[9]) {
                    counter[9]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[10]) {
                    counter[10]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[11]) {
                    counter[11]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[12]) {
                    counter[12]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[13]) {
                    counter[13]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[14]) {
                    counter[14]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[15]) {
                    counter[15]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[16]) {
                    counter[16]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[17]) {
                    counter[17]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[18]) {
                    counter[18]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[19]) {
                    counter[19]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[20]) {
                    counter[20]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[21]) {
                    counter[21]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[22]) {
                    counter[22]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[23]) {
                    counter[23]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[24]) {
                    counter[24]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[25]) {
                    counter[25]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[26]) {
                    counter[26]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[27]) {
                    counter[27]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[28]) {
                    counter[28]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[29]) {
                    counter[29]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[30]) {
                    counter[30]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[31]) {
                    counter[31]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[32]) {
                    counter[32]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[33]) {
                    counter[33]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[34]) {
                    counter[34]++;
                    numberOfAllLetters++;
                }
                else if(character == tab[35]) {
                    counter[35]++;
                    numberOfAllLetters++;
                }
            }
        }
    }

    public void calculatePercentage() {
        System.out.println("\nLetter:     Percentage:");

        double[] array = new double[counter.length];
        double isHundred = 0.0;

        for (int i = 0; i < counter.length; i++) {
            array[i] = (double)counter[i] * 100.0 / (double)numberOfAllLetters;
            isHundred += array[i];
            System.out.print(tab[i]);
            System.out.printf(":             %f\n", array[i]);
        }

        //System.out.print("is a hundred? " + isHundred);
    }
}
