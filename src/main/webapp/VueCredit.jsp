<%@ page import="org.example.similateurdecredit.CreditModel" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<% CreditModel model = (CreditModel) request.getAttribute("CreditModel");%>

<!DOCTYPE html>
<html>
<head>
    <title>Credit Bancaire</title>
</head>
<body>
<div>
    <form action="calculerMensualite.do" method="post">
        <table>
            <tr>
                <td>Montant: </td>
                <td><input type="text"  name="montant" value="<%= model.getmontant()%>" /></td>
                <td>DH</td>
            </tr>
            <tr>
                <td>Taux: </td>
                <td><input type="text"  name="taux" value="<%= model.gettaux() %>" /></td>
                <td>%</td>
            </tr>
            <tr>
                <td>Duree: </td>
                <td><input type="text"  name="duree" value="<%= model.getduree()%>" /></td>
                <td>mois</td>
            </tr>
        </table>
        <button type="submit">Calculer</button>
    </form>
</div>
<p>
    <div>
    Mensualite = <%=(model.getmensualite())%>
</div>
</p>
</body>
</html>