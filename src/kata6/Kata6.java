package kata6;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

        

public class Kata6 {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        String nameFile = "emails.txt";
        ArrayList<Person> arrayMail = MailListReader.read(nameFile);
        System.out.println(arrayMail.size());
        HistogramBuilder<Person> builder = new HistogramBuilder<>(arrayMail);
        
        ArrayList<Person1> people1 = PersonLoader.read();
        HistogramBuilder<Person1> builder1 = new HistogramBuilder<>(people1);
       
       
        Histogram<String> domains1 = builder1.build (new Attribute<Person1, String>() {
            @Override
            public String get(Person1 i) {
                return i.getMail().split("@")[1];
            }
        });
 /*        
        Histogram<String> pesos1 = builder1.build (new Attribute<Person1, Float>() {
            @Override
            public Float get(Person1 i) {
                return i.getPeso();
            }
        });
        
        Histogram<String> generos1 = builder1.build (new Attribute<Person1, Character>() {
            @Override
            public Character get(Person1 i) {
                return i.getGenero().charAt(0);
            }
        });
        
        new HistrogramDisplay (domains1, "DOMINIOS").execute();
        
        
        /*Histogram<String> domains = builder.build(new Attribute<Person, String>() {
        
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
        })
   */      
        //new HistogramDisplay1<String> (domains1, "DOMINIOS").execute();
  //      new HistogramDisplay<Character> (letters, "CARACTERES").execute();
  new HistogramDisplay1(domains1,"DOMINIOS").exectute();
           
        /*Histogram<String> histogram = MailHistogramBuilder.build(mailArray);
        new HistogramDisplay(histogram).exectute();*/
        System.out.println("Fin");
    }
}
