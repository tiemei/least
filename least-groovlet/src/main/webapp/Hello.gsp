<html>
<head><title>index.gsp</title></head>
<body>
<b><% println "hello gsp" %></b>
<p>
<% wrd = "Groovy"
   for (i in wrd){
 %>
 <h1> <%=i%> <br/>

 <%} %>
</p>
</body>
</html>