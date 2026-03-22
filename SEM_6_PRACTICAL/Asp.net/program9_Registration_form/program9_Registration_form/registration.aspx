<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="registration.aspx.cs" Inherits="Program9.registration" %>

<!DOCTYPE html>
<html>
<head runat="server">
    <title>Student Registration</title>
</head>
<body>
    <form id="form1" runat="server">

        <h2>Student Registration Form</h2>

        Name:
        <asp:TextBox ID="txtName" runat="server"></asp:TextBox>
        <asp:RequiredFieldValidator ID="rfvName" runat="server"
            ControlToValidate="txtName" ErrorMessage="Name required" ForeColor="Red" />
        <br /><br />

        Email:
        <asp:TextBox ID="txtEmail" runat="server"></asp:TextBox>
        <asp:RegularExpressionValidator ID="revEmail" runat="server"
            ControlToValidate="txtEmail"
            ValidationExpression="\w+@\w+\.\w+"
            ErrorMessage="Invalid Email" ForeColor="Red" />
        <br /><br />

        Age:
        <asp:TextBox ID="txtAge" runat="server"></asp:TextBox>
        <asp:RangeValidator ID="rvAge" runat="server"
            ControlToValidate="txtAge"
            MinimumValue="18" MaximumValue="60"
            Type="Integer"
            ErrorMessage="Age must be 18-60" ForeColor="Red" />
        <br /><br />

        Password:
        <asp:TextBox ID="txtPass" runat="server" TextMode="Password"></asp:TextBox>
        <asp:RequiredFieldValidator ID="rfvPass" runat="server"
            ControlToValidate="txtPass" ErrorMessage="Password required" ForeColor="Red" />
        <br /><br />

        Confirm Password:
        <asp:TextBox ID="txtConfirm" runat="server" TextMode="Password"></asp:TextBox>
        <asp:CompareValidator ID="cvPass" runat="server"
            ControlToCompare="txtPass"
            ControlToValidate="txtConfirm"
            ErrorMessage="Passwords do not match" ForeColor="Red" />
        <br /><br />

        <asp:Button ID="btnRegister" runat="server" Text="Register" OnClick="btnRegister_Click" />

        <br /><br />

        <!-- Output Table -->
        <asp:Panel ID="PanelResult" runat="server" Visible="false">
            <h3>Student Details </h3>

            <table border="1" cellpadding="8">
                <tr>
                    <th>Field</th>
                    <th>Value</th>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><asp:Label ID="lblName" runat="server"></asp:Label></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><asp:Label ID="lblEmail" runat="server"></asp:Label></td>
                </tr>
                <tr>
                    <td>Age</td>
                    <td><asp:Label ID="lblAge" runat="server"></asp:Label></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><asp:Label ID="lblPass" runat="server"></asp:Label></td>
                </tr>
            </table>
        </asp:Panel>

    </form>
</body>
</html>
