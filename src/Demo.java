import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo {
    public static void main(String[] args) throws Exception {
        // ?---------------user values
        // String name1 = "kamal";
        // String email1 = "kamal@gmail.com";
        // String pass1 = "kamal123";
        // String gender1 = "male";
        // String city1 = "mumbai";
 
        String name1 = "kamal";
        String email1 = "kamal@gmail.com";
        String pass1 = "kamal123";
        String gender1 = "male";
        String city1 = "mumbai";

        //
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "iamtus@123");

        // PreparedStatement ps = con.prepareStatement(
        // "insert into register values('" + name1 + "','" + email1 + "','" + pass1 +
        // "','" + gender1 + "','"
        // + city1 + "')");

        PreparedStatement ps = con.prepareStatement(
                "insert into register values(?,?,?,?,?)");
        ps.setString(1, name1);
        ps.setString(2, email1);
        ps.setString(3, pass1);
        ps.setString(4, gender1);
        ps.setString(5, city1);

        int i = ps.executeUpdate();

        if (i > 0) {
            System.out.println("Success");
            // sysout
        } else {
            System.out.println("Failed");

        }

    }
}