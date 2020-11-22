import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        FileAnaylizer fileAnaylizer = new FileAnaylizer("input.txt");
        fileAnaylizer.analyzeFile();
        fileAnaylizer.calculatePercentage();
    }
}
