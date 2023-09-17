SqlConnection conn;

public SqlConnection Koneksi()
{
    try
    {
        conn = new SqlConnection("server=localhost\\SQLEXPRESS; database=test; user id=test; password=test;");
        conn.Open();
    }
    catch (Exception ex) {
        MessageBox.Show("Database error, " + ex.Message);
    }
    return conn;
}
