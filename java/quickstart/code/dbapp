package dbapp;
import java.sql.*;
public class start {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
// create our mysql database connection
Class.forName("com.mysql.cj.jdbc.Driver"); 
Connection con=DriverManager.getConnection( 
"jdbc:mysql://localhost:3306/training","root",""); 
Statement stmt=con.createStatement(); 
ResultSet rs=stmt.executeQuery("select * from clients");
// iterate through the java resultset
String responseString = "<Table border=1>";
while (rs.next())
{ String firstName = rs.getString("firstname");
String lastName = rs.getString("lastname");
String userName = rs.getString("username");
System.out.println("Voornaam:"+ firstName +","
+ " Achternaam:"+ lastName 
+",UserNaam:"+ userName); }}}
