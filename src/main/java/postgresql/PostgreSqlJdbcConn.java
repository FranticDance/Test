package postgresql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author lee
 * @version 1.0
 * @date 2019/12/24 15:37
 */
public class PostgreSqlJdbcConn {
    public static void main(String args[]) throws Exception{
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager
                    .getConnection("jdbc:postgresql://10.40.150.5:5832/order_system",
                            "postgres", "U_tywg_2013");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }

}
