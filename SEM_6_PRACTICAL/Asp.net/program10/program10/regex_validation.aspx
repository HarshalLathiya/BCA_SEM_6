<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="regex_validation.aspx.cs" Inherits="Program10.regex_validation" %>

<!DOCTYPE html>
<html>
<head runat="server">
    <title>Regex Validation</title>
</head>
<body>
    <form id="form1" runat="server">

        <h2>Regular Expression Validation Form</h2>

        Email:
        <asp:TextBox ID="txtEmail" runat="server"></asp:TextBox>
        <asp:RequiredFieldValidator ID="rfvEmail" runat="server"
            ControlToValidate="txtEmail"
            ErrorMessage="Email required" ForeColor="Red" />
        <asp:RegularExpressionValidator ID="revEmail" runat="server"
            ControlToValidate="txtEmail"
            ErrorMessage="Invalid Email"
            ForeColor="Red"
            ValidationExpression="\w+@\w+\.\w+" />
        <br /><br />

        Phone:
        <asp:TextBox ID="txtPhone" runat="server"></asp:TextBox>
        <asp:RequiredFieldValidator ID="rfvPhone" runat="server"
            ControlToValidate="txtPhone"
            ErrorMessage="Phone required" ForeColor="Red" />
        <asp:RegularExpressionValidator ID="revPhone" runat="server"
            ControlToValidate="txtPhone"
            ErrorMessage="Invalid Phone"
            ForeColor="Red"
            ValidationExpression="^[0-9]{10}$" />
        <br /><br />

        Zip Code:
        <asp:TextBox ID="txtZip" runat="server"></asp:TextBox>
        <asp:RequiredFieldValidator ID="rfvZip" runat="server"
            ControlToValidate="txtZip"
            ErrorMessage="Zip required" ForeColor="Red" />
        <asp:RegularExpressionValidator ID="revZip" runat="server"
            ControlToValidate="txtZip"
            ErrorMessage="Invalid Zip"
            ForeColor="Red"
            ValidationExpression="^[0-9]{6}$" />
        <br /><br />

        <asp:Button ID="btnSubmit" runat="server" Text="Submit" OnClick="btnSubmit_Click" />

        <br /><br />

        <!-- Output Panel -->
        <asp:Panel ID="PanelResult" runat="server" Visible="false">
            <h3>Entered Details</h3>
            <table border="1" cellpadding="6">
                <tr>
                    <th>Email</th>
                    <th>Phone</th>
                    <th>Zip Code</th>
                </tr>
                <tr>
                    <td><asp:Label ID="lblEmail" runat="server"></asp:Label></td>
                    <td><asp:Label ID="lblPhone" runat="server"></asp:Label></td>
                    <td><asp:Label ID="lblZip" runat="server"></asp:Label></td>
                </tr>
            </table>
        </asp:Panel>

    </form>
</body>
</html>
