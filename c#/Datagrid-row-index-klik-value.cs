private void dataGridView1_CellContentClick(object sender, DataGridViewCellMouseEventArgs e)
{
    if (e.RowIndex >= 0)
    {
        DataGridViewRow row = dataGridView1.Rows[e.RowIndex];
        if (row.Cells[0].Value != null)
        {
            textBox1.Text = row.Cells[0].Value.ToString();
        }
        else
        {
            textBox1.Text = "";
        }
    }
}
