package kata4v1;

import java.io.IOException;
import java.util.ArrayList;

public class Kata4v1 {

    public static void main(String[] args) throws IOException {
        String nameFile = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Kata4v1\\data\\emailsfilev1.txt";
        ArrayList<String> mailArray = MailListReader.read(nameFile);
        Histogram<String> histogram = MailHistogramBuilder.build(mailArray);
        new HistogramDisplay(histogram).exectute();
    }
}
