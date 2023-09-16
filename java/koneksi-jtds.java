import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

public class connection {
    connection con = null;
    String nama, pass, ip, port, dbname;

    public Connection koneksi() {
        nama = "test1;";
        pass = "test1;";
        ip = "192.168.1.19";
        port = "1433;";
        dbname = "test1;";

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
