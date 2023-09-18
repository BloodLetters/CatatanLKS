conn = new data().Koneksi();
SqlCommand cmd = new SqlCommand("SELECT * FROM contoh WHERE nama = '" + textBox3.Text + "' AND pass = '" + textBox4.Text + "'", conn);
SqlDataReader reader = cmd.ExecuteReader();
if (reader != null)
{
    if (reader.Read())
    {
        Form2 form2 = new Form2();
        form2.Show();

        this.Hide();
    }
    else 
    {
        MessageBox.Show("Username/Password salah!");    
    }
}
