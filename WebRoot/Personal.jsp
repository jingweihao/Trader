<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "S" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Personal</title>
   
    <link rel="stylesheet" type="text/css" href="bootstrap.css">
    <link rel="stylesheet" type="text/css" href="style_personal.css">

  </head>
  
  <body>
    
    <nav class = "navbar navbar-default navbar-fixed-top" role = "navigation">
        <div class = "container-fluid">
            <div class = "navbar-header">
	            <a class = "navbar-brand" href = "#">Trader</a>
	        </div>
	        <div>
	            
	            <ul class = "nav navbar-nav navbar-right">
	               <li><a href = "Home.jsp">Home</a></li>
	               <li class = "active"><a href = "Personal.jsp" >Personal</a></li>
	               <li><a href = "login.jsp" class = "navbar-link">Log out</a></li>        
	            </ul>
	            <S:form cssClass = "navbar-form navbar-right" role = "search" action="SearchAction" namespace = "/">
	            <div class = "form-group">
	               <S:textfield cssClass = "form-control" id = "Querybox" name = "searchword" />
	            </div>
	            <S:submit cssClass = "btn btn-primary" value = "Search" />
	            </S:form>
	            
	        </div>
        </div>        
     </nav>
     
     
     <div class = "container-fluid" id = "mycontainer"> 
        <S:iterator value = "#session">  
             <div id = "sales_items" class = "row">
             
                 <div class = "col-md-3">
                      <img src= " <S:property value="value.img"  />  ">
	             </div>
	             <div class = "col-md-6">
	                   <h2> <S:property value="value.name"  />  </h2>
	                   <h4> <S:property value="value.price"  /> </h4>
	                   <p> <S:property value="value.info"  /> </p>
	             </div>
	             <div class = "col-md-3">
	                   <S:a href = "SoldAction.action?itemid=%{key}" cssClass = "btn btn-default"> Sold </S:a>
	                   <!-- <button type = "button" class = "btn btn-default"> Sold </button>  -->
	             </div>
             
            </div>
            <hr>
        </S:iterator>
                         
     
     </div>
   
      
      
  </body>
</html>
