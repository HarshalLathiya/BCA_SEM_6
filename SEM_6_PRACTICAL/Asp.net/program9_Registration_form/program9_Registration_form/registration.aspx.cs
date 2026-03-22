using System;

namespace Program9
{
    public partial class registration : System.Web.UI.Page
    {
        protected void btnRegister_Click(object sender, EventArgs e)
        {
            if (Page.IsValid)
            {
                PanelResult.Visible = true;

                lblName.Text = txtName.Text;
                lblEmail.Text = txtEmail.Text;
                lblAge.Text = txtAge.Text;
                lblPass.Text = txtPass.Text;
            }
        }
    }
}
