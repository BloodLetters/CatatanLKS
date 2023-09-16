import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

public class connection {
    connection con = null;
    String nama, pass, ip, port, dbname;

    public Connection koneksi() {
        nama = "test1;"; // standart username
        pass = "test1;"; // standart password
        ip = "192.168.1.19"; // ipv4 dari ping cmd
        port = "1433;"; // standart port 1433 TCP| 1434 UDP
        dbname = "test1;"; // nama database

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        
        Connection conn = null;
        String connURL = null;

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            connURL = "jdbc:jtds:sqlserver://" + ip + ":" + port + "databaseName=" + dbname + "user=" + nama + "password=" + pass;
            conn = DriverManager.getConnection(connURL);
        } catch (Exception e) {
            Log.e("Database", Objects.requireNonNull(e.getMessage()));
        }

        return conn;
    }
}
