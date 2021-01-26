package nguyenvannhat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hocvien
 */
public class KNCSDL {
    public static Connection layKetNoi(){
        Connection kn=null;
        String user="sa";
        String pass="123";
        String uRL="jdbc:sqlserver://;databaseName=QLSACH_TiKi";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            kn=DriverManager.getConnection(uRL, user, pass);
            System.out.println("Connected");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Disconnected");
        }
        return kn;
    }
    
}
