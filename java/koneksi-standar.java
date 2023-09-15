public static void main(String[] args) {

        // deklarasi variable dan set value menjadi null
        // null = empty/kosongan
        Connection conn = null;
        try {
            
            // default string standart dari sql server
            String dbURL = "jdbc:sqlserver://localhost\\sqlexpress;trustServerCertificate=true";
            String user = "test";
            String pass = "aku123#";

            // mencoba koneksi ke dalam database
            conn = DriverManager.getConnection(dbURL, user, pass);
            if (conn != null) {
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
