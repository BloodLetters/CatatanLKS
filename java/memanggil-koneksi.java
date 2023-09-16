import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

public class test {
    public static void panggil() {
        try {

            // panggil koneksi class dari jtds
            Connection conn = new connection().koneksi();

            // prepare statement dan query standart sql server
            preparedStatement = conn.prepareStatement("SELECT * FROM t_login WHERE nama = 'aku'");
            resultSet = preparedStatement.executeQuery();
            
            // mendapatkan hasil string dari database
            resultSet.next();
            String id = resultSet.getString("id");
            System.Out.println(id);

            // cara reture data dengan while
            while(resultSet.next()) {
                System.Out.println(resultSet.getString("id"))
            }
            
            

        } catch (Exception e) {
            System.Out.println("Koneksi error!");
            // Log.e("Error", Objects.requireNonNull(e.getMessage()));
        }
    }
}
