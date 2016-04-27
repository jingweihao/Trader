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
	               <li><a href = "#">Home</a></li>
	               <li class = "active"><a href = "#" >Personal</a></li>
	               <li><a href = "#" class = "navbar-link">Log out</a></li>        
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
        <S:iterator value = "list" var = "cur">  
             <div id = "sales_items" class = "row">
             
                 <div class = "col-md-3">
                      <img src= " <S:property value="#cur.img"  />  ">
	             </div>
	             <div class = "col-md-6">
	                   <h2> <S:property value="#cur.name"  />  </h2>
	                   <h4> <S:property value="#cur.price"  /> </h4>
	                   <p> <S:property value="#cur.info"  /> </p>
	             </div>
	             <div class = "col-md-3">
	                   <button type = "button" class = "btn btn-default"> Sold </button>
	             </div>
             
            </div>
            <hr>
        </S:iterator>
                         
     
     </div>
   
  </body>
</html>
