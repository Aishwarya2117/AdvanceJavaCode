<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <%!
       int a=10;
       String name="Aishwarya";
       int Square(){
    	   return a*a;
       }
     %>
     
     <%
        out.println("a:"+a);
        out.println("\nName:"+name);
        out.println("\n"+Square());
        
        int b=40;
         if(b<50){
        	out.println("\nLess");
         }
         else
        	 out.println("\nGreater");
         
         for(int i=1;i<10;i++){
        	 out.println(i);
         }
     
     %>
     <%=a %>
      <%=name %>
       <%= Square() %>
     

</body>
</html>