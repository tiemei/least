
/**
 * 一个简单的groovy servlet。
 * 可用request response等内置对象
 *
 * 可通过 /Hello.groovy访问
 *
 * @author tiemei
 * @date 2014-03-02
 */
println """
<html><head>
<title>Groovlets 101</title>
</head>
<body>
<p>
Welcome to Groovlets 101. As you can see
this Groovlet is fairly simple.
</p>
<p>
This course is being run on the following servlet container: </br>
${application.getServerInfo()}
</p>
</body>
</html>
"""
