<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<form action="/MVC2SimpleInterest/result.html" method="post">
<center>
<h1>Simple Interest Form</h1>
<table>
<tr>
<td>Principal Amount</td>
<td><input type="text" name="val"/></td>
</tr>
<tr>
<td>Rate in Percentage</td>
<td><input type="text" name="rate9812"/></td>
</tr>
<tr>
<td>Time in months</td>
<td><label for="time"></label>
<select name="time11" id="time">
<option value="0">Select months</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
</select>
</td>
</tr>
</table>
<br>
<input type="submit" value="Get Simple Interest"/>
</form>
</center>
</body>
</html>
