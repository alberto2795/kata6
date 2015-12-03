package kata6;

import java.io.IOException;
import java.util.ArrayList;

public class Kata6 {

    public static void main(String[] args) throws IOException {
        String nameFile = "emails.txt";
        ArrayList<Person> arrayMail = MailListReader.read(nameFile);
        System.out.println(arrayMail.size());
        
        HistogramBuilder<Person> builder = new HistogramBuilder<>(arrayMail);
        
        Histogram<String> domains = builder.build(new Attribute<Person, String>() {

            @Override
            public String get(Person item) {
                return item.getMail().split("@")[1];
            }
        });
        
        Histogram<Character> letters = builder.build(new Attribute<Person, Character>() {

             @Override
             public Character get(Person item) {
                 return item.getMail().charAt(0);
             }
         });

        new HistogramDisplay<String> (domains, "DOMINIOS").execute();
        new HistogramDisplay<Character> (letters, "CARACTERES").execute();
        
        /*Histogram<String> histogram = MailHistogramBuilder.build(mailArray);
        new HistogramDisplay(histogram).exectute();*/
        System.out.println("Fin");
    }
}
