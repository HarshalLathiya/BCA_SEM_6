<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="WebFormDemo.Default" %>

<!DOCTYPE html>
<html>
<head runat="server">
    <title>Textbox Label Button Example</title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h2>Web Form Example</h2>

            Enter Text:
            <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
            <br /><br />

            <asp:Button ID="Button1" runat="server"
                Text="Show Text"
                OnClientClick="return handleClick();" />

            <br /><br />
            Output:
            <asp:Label ID="Label1" runat="server" ForeColor="Blue"></asp:Label>
        </div>
    </form>

    <script>
        var clicks = 0;

        function handleClick() {
            clicks++;
            setTimeout(function () {
                if (clicks == 1) {
                    __doPostBack('Button1', 'SingleClick');
                }
                else if (clicks == 2) {
                    __doPostBack('Button1', 'DoubleClick');
                }
                clicks = 0;
            }, 300);

            return false; // stop normal postback
        }
    </script>
</body>
</html>
