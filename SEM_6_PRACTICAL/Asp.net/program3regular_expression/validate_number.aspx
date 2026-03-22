<%@ Page Language="C#" AutoEventWireup="true" CodeFile="validate_number.aspx.cs" Inherits="PhoneValidation" %>

<!DOCTYPE html>
<html>
<head runat="server">
    <title>Phone Number Validation</title>
</head>
<body>
    <form id="form1" runat="server">

        <h2>Phone Number Validation</h2>

        Enter Phone Number:
        <asp:TextBox ID="txtPhone" runat="server"></asp:TextBox>

        
        <asp:RegularExpressionValidator 
            ID="revPhone" 
            runat="server"
            ControlToValidate="txtPhone"
            ErrorMessage="Enter a valid 10-digit phone number"
            ValidationExpression="^[0-9]{10}$"
            ForeColor="Red">
        </asp:RegularExpressionValidator>

        <br /><br />

        <asp:Button ID="btnSubmit" runat="server" Text="Submit" />

        <br /><br />

        <asp:ValidationSummary ID="ValidationSummary1" runat="server" ForeColor="Red" />

    </form>
</body>
</html>
