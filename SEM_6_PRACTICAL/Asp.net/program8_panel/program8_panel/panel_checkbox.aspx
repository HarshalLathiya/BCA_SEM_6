<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="panel_checkbox.aspx.cs" Inherits="Program8.panel_checkbox" %>

<!DOCTYPE html>
<html>
<head runat="server">
    <title>Student Panel</title>
</head>
<body>
    <form id="form1" runat="server">

        <h2>Show / Hide Student Details</h2>

        <asp:CheckBox 
            ID="chkShow" 
            runat="server" 
            Text="Show Student Details" 
            AutoPostBack="true"
            OnCheckedChanged="chkShow_CheckedChanged" />

        <br /><br />

        <asp:Panel ID="Panel1" runat="server" Visible="false" BorderStyle="Solid" Width="300px">

            <h3>Enter Student Details</h3>
            Name: <asp:TextBox ID="txtName" runat="server"></asp:TextBox><br /><br />
            Roll No: <asp:TextBox ID="txtRoll" runat="server"></asp:TextBox><br /><br />
            Class: <asp:TextBox ID="txtClass" runat="server"></asp:TextBox><br /><br />

            <asp:Button ID="btnSubmit" runat="server" Text="Submit" OnClick="btnSubmit_Click" />

        </asp:Panel>

        <br /><br />

        <asp:Label ID="lblResult" runat="server" ForeColor="Green"></asp:Label>

    </form>
</body>
</html>
