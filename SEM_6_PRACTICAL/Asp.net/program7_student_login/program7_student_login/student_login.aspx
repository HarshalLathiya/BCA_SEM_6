<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="student_login.aspx.cs" Inherits="program7_student_login.student_login" %>

<!DOCTYPE html>
<html>
<head runat="server">
    <title>STUDENT LOGIN</title>
</head>
<body>
    <form id="form1" runat="server">
        <h2>STUDENT LOGIN FORM</h2>

        ENTER USERNAME:-
        <asp:TextBox ID="txtuser" runat="server"></asp:TextBox>
        <asp:RequiredFieldValidator 
            ID="RequiredFieldValidator1" 
            runat="server" 
            ControlToValidate="txtuser" 
            ErrorMessage="Username Required" 
            ForeColor="Red" />
        <br /><br />

        PASSWORD:-
        <asp:TextBox ID="txtpass" runat="server" TextMode="Password"></asp:TextBox>
        <asp:RequiredFieldValidator 
            ID="RequiredFieldValidator2" 
            runat="server" 
            ControlToValidate="txtpass" 
            ErrorMessage="Password Required" 
            ForeColor="Red" />
        <br /><br />

        CONFIRM PASSWORD:-
        <asp:TextBox ID="txtconfirm" runat="server" TextMode="Password"></asp:TextBox>
        <asp:CompareValidator 
            ID="CompareValidator1" 
            runat="server" 
            ControlToCompare="txtpass"  
            ControlToValidate="txtconfirm" 
            ErrorMessage="Passwords do not match" 
            ForeColor="Red" />
        <br /><br />

        <asp:Button ID="btnlogin" runat="server" Text="Login" OnClick="btnlogin_click" />
        <br /><br />

        <asp:Label ID="lblMsg" runat="server" ForeColor="Green"></asp:Label>
    </form>
</body>
</html>
