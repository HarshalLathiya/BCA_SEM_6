using System;

namespace Program8
{
    public partial class panel_checkbox : System.Web.UI.Page
    {
        protected void chkShow_CheckedChanged(object sender, EventArgs e)
        {
            Panel1.Visible = chkShow.Checked;
        }

        protected void btnSubmit_Click(object sender, EventArgs e)
        {
            lblResult.Text =
                "Student Details:<br/>" +
                "Name: " + txtName.Text + "<br/>" +
                "Roll No: " + txtRoll.Text + "<br/>" +
                "Class: " + txtClass.Text;
        }
    }
}
