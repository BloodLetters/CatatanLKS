public static void main(String[] args) {
    Connection conn = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    try {

        String dbURL = "jdbc:sqlserver://localhost\\sqlexpress;dataBase=test;trustServerCertificate=true"; // query
        String user = "test"; // username
        String pass = "aku123#"; // password
        conn = DriverManager.getConnection(dbURL, user, pass);
      
        if (conn != null) {
            preparedStatement = conn.prepareStatement("SELECT * FROM contoh");
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ", " + resultSet.getString("nama"));
                // cara mendapatkan data resultSet.getInt("nama field")
            }
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
