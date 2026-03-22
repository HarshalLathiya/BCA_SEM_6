<%@ Page Language="C#" AutoEventWireup="true" CodeFile="ListBoxRangeValidator.aspx.cs" Inherits="ListBoxRangeValidator" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>LIST BOX AND RANGEVALIDATOR</title>
</head>
<body>
<form id="form1" runat="server">
<div>

    <h2>LIST BOX</h2>

    <asp:ListBox ID="ListBox1" runat="server" SelectionMode="Multiple">
        <asp:ListItem>C</asp:ListItem>
        <asp:ListItem>C++</asp:ListItem>
        <asp:ListItem>C#</asp:ListItem>
        <asp:ListItem>PHP</asp:ListItem>
        <asp:ListItem>JAVA</asp:ListItem>
        <asp:ListItem>PYTHON</asp:ListItem>
        <asp:ListItem>ANDROID</asp:ListItem>
        <asp:ListItem>ASP.NET</asp:ListItem>
    </asp:ListBox>

    <br /><br />

    <asp:Button ID="Button1" runat="server" Text="Show The Details"
        OnClick="btnshow_click" />

    <br /><br />

    <!-- THIS LABEL MUST EXIST -->
    <asp:Label ID="label1" runat="server" ForeColor="Blue"></asp:Label>

    <hr />

    <h2>DATE VALIDATION</h2>

    Enter Date:
    <asp:TextBox ID="txtdate" runat="server"></asp:TextBox>

    <br /><br />

    <asp:RangeValidator 
        ID="RangeValidator1"
        runat="server"
        ControlToValidate="txtdate"
        Type="Date"
        MinimumValue="01/01/2000"
        ErrorMessage="Date must be between 01/01/2000 and current date"
        ForeColor="Red">
    </asp:RangeValidator>

    <br /><br />

    <asp:Button ID="btnsubmit" runat="server" Text="Submit" />

</div>
</form>
</body>
</html>
