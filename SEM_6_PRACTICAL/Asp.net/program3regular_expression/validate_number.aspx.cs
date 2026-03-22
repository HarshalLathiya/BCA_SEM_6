using System;
using System.Web.UI;

public partial class PhoneValidation : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        ValidationSettings.UnobtrusiveValidationMode =
            UnobtrusiveValidationMode.None;
    }
}
