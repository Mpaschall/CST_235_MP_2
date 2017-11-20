<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Storage space required</h1>
        
        <!--Gets and displays bean values-->
        Quality : <jsp:getProperty name = "storageBean" property="videoQuality"/>p
        <br>
        Transfer rate : <jsp:getProperty name="storageBean" property="transRate"/> Mb/s
        <br>
        Run time : <jsp:getProperty name="storageBean" property="runTime"/> seconds
        <br>
        Space needed : <jsp:getProperty name="storageBean" property="videoSpace"/> GB
        <br>
        
        <!--Gets session bean properties-->
        Number of videos : <jsp:getProperty name="sess" property="videos"/> videos
        <br>
        Total space : <jsp:getProperty name="sess" property="multStorage"/> GB
    </body>
</html>
