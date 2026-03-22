using System;
using System.Web.UI.WebControls;

public partial class ListBoxRangeValidator : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        RangeValidator1.MaximumValue = DateTime.Now.ToShortDateString();
    }

    protected void btnshow_click(object sender, EventArgs e)
    {
        label1.Text = "Selected Items:<br/>";

        foreach (ListItem item in ListBox1.Items)
        {
            if (item.Selected)
            {
                label1.Text += item.Text + "<br/>";
            }
        }
    }
}
