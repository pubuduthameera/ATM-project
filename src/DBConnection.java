import java.sql.*;

public class DBConnection  {

    public static Statement getStatement() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "pubudu");
        Statement stmt = con.createStatement();
        return stmt;

    }

}
