using System;

namespace Program10
{
    public partial class regex_validation : System.Web.UI.Page
    {
        protected void btnSubmit_Click(object sender, EventArgs e)
        {
            if (Page.IsValid)
            {
                PanelResult.Visible = true;

                lblEmail.Text = txtEmail.Text;
                lblPhone.Text = txtPhone.Text;
                lblZip.Text = txtZip.Text;
            }
        }
    }
}
