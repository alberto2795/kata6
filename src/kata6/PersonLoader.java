package kata6;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonLoader {
    public static ArrayList read() throws SQLException, ClassNotFoundException{
        ArrayList<Person1> lista = new ArrayList<>();
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:KATA.sDB");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM PEOPLE");
        while(resultSet.next()){
            Integer id = resultSet.getInt(1);
            String name= resultSet.getString(2); 
            String genero= resultSet.getString(3);
            String fechaNacimiento= resultSet.getString(4);
            float peso= resultSet.getFloat(5);
            String mail= resultSet.getString(6);
            lista.add(new Person1(id, name, genero, fechaNacimiento, peso, mail));
        }
        
        
        return lista;
    }
}
