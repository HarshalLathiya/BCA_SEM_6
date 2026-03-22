using System;

namespace WebFormDemo
{
    public partial class Default : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (IsPostBack)
            {
                string action = Request["__EVENTARGUMENT"];

                if (action == "SingleClick")
                {
                    Label1.Text = TextBox1.Text;
                }
                else if (action == "DoubleClick")
                {
                    Label1.Text = ToProperCase(TextBox1.Text);
                }
            }
        }

        public string ToProperCase(string text)
        {
            return System.Globalization.CultureInfo
                .CurrentCulture.TextInfo
                .ToTitleCase(text.ToLower());
        }
    }
}
