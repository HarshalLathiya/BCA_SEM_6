using System;
using System.IO;

namespace WebFormDemo
{
    public partial class form_upload : System.Web.UI.Page
    {
        protected void btnSubmit_Click(object sender, EventArgs e)
        {
            string name = txtName.Text;
            bool isAgreed = chkAgree.Checked;

            if (FileUpload1.HasFile)
            {
                string fileName = Path.GetFileName(FileUpload1.FileName);
                string filePath = Server.MapPath("~/Uploads/") + fileName;

                FileUpload1.SaveAs(filePath);

                lblResult.Text = "Name: " + name +
                                 "<br/>Agreed: " + isAgreed +
                                 "<br/>Uploaded File: " + fileName;
            }
            else
            {
                lblResult.Text = "Please select a file to upload.";
            }
        }
    }
}
