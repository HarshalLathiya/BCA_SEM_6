using System;

namespace program7_student_login
{
    public partial class student_login : System.Web.UI.Page
    {
        protected void btnlogin_click(object sender, EventArgs e)
        {
            if (Page.IsValid)
            {
                lblMsg.Text = "Login Successfully";
            }
        }
    }
}
