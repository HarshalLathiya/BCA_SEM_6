<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="ValidationDemo.aspx.cs" Inherits="program4_validation.ValidationDemo" %>


<!DOCTYPE html>
<html>
<head runat="server">
    <title>Validation Controls Demo</title>
</head>
<body>
    <form id="form1" runat="server">

        <h2>User Registration</h2>

        <asp:ValidationSummary 
            ID="ValidationSummary1" 
            runat="server" 
            ForeColor="Red" 
            HeaderText="Please fix the following errors:" />

        <br />

        Username:
        <asp:TextBox ID="txtUsername" runat="server"></asp:TextBox>
        <asp:RequiredFieldValidator 
            ID="rfvUsername" 
            runat="server" 
            ControlToValidate="txtUsername"
            ErrorMessage="Username is required"
            ForeColor="Red" />
        <br /><br />

        Email:
        <asp:TextBox ID="txtEmail" runat="server"></asp:TextBox>
        <asp:RequiredFieldValidator 
            ID="rfvEmail" 
            runat="server" 
            ControlToValidate="txtEmail"
            ErrorMessage="Email is required"
            ForeColor="Red" />
        <asp:RegularExpressionValidator 
            ID="revEmail" 
            runat="server" 
            ControlToValidate="txtEmail"
            ErrorMessage="Invalid email format"
            ValidationExpression="^[^@\s]+@[^@\s]+\.[^@\s]+$"
            ForeColor="Red" />
        <br /><br />

        Password:
        <asp:TextBox ID="txtPassword" runat="server" TextMode="Password"></asp:TextBox>
        <asp:RequiredFieldValidator 
            ID="rfvPassword" 
            runat="server" 
            ControlToValidate="txtPassword"
            ErrorMessage="Password is required"
            ForeColor="Red" />
        <br /><br />

        Confirm Password:
        <asp:TextBox ID="txtConfirmPassword" runat="server" TextMode="Password"></asp:TextBox>
        <asp:RequiredFieldValidator 
            ID="rfvConfirmPassword" 
            runat="server" 
            ControlToValidate="txtConfirmPassword"
            ErrorMessage="Confirm Password is required"
            ForeColor="Red" />

        <asp:CompareValidator 
            ID="cvPassword" 
            runat="server" 
            ControlToCompare="txtPassword"
            ControlToValidate="txtConfirmPassword"
            ErrorMessage="Passwords do not match"
            ForeColor="Red" />
        <br /><br />

        <asp:Button ID="btnSubmit" runat="server" Text="Register" />

    </form>
</body>
</html>
