<%@ Page Language="C#" AutoEventWireup="true"
    CodeFile="form_upload.aspx.cs"
    Inherits="WebFormDemo.form_upload" %>

<!DOCTYPE html>
<html>
<head runat="server">
    <title>Form with File Upload</title>
</head>
<body>
    <form id="form1" runat="server">

        <h2>User Registration</h2>

        Name:
        <asp:TextBox ID="txtName" runat="server"></asp:TextBox>
        <br /><br />

        <asp:CheckBox ID="chkAgree" runat="server" Text="I agree to terms" />
        <br /><br />

        Upload File:
        <asp:FileUpload ID="FileUpload1" runat="server" />
        <br /><br />

        <asp:Button ID="btnSubmit" runat="server"
            Text="Submit"
            OnClick="btnSubmit_Click" />
        <br /><br />

        <asp:Label ID="lblResult" runat="server" ForeColor="Green"></asp:Label>

    </form>
</body>
</html>
