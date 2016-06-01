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
             <S:if test= "key != '.user'">  
	             <div id = "sales_items" class = "row">
	             
	                 <div class = "col-md-3">
	                      <img src= " <S:property value="value.imgpath"  />  ">
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
            </S:if>
        </S:iterator>
                         
     
     </div>
   
     <div class = "container-fluid" id = "add_item_c">
	     <S:form role = "additem" action="AddItemAction" enctype = "multipart/form-data" method = "POST" namespace = "/">
	        <div class = "form-group">
	            <S:label for = "salesitem.name" value = "Name"/>
	            <S:textfield name="salesitem.name" cssClass="form-control" placeholder="ItemName"/>
	        </div>
	        <div class = "form-group">
	            <S:label for = "salesitem.price" value = "Price"/>
	            <S:textfield name="salesitem.price" cssClass="form-control" placeholder="ItemPrice"/>
	        </div>
	        <div class = "form-group">
	            <S:label for = "salesitem.category" value = "Category"/>
	            <S:select name="salesitem.category" list= "#{'Bicycle':'Bicycle', 'Book':'Book', 'Car':'Car', 'Computer':'Computer', 'Home':'Home', 'House':'House', 'Sports':'Sports', 'Supplies':'Supplies', 'Video&Video Games':'Video&Video Games'}" headerKey="-1" headerValue="Select"/>
	        </div>
	        <div class = "form-group">
	            <S:label for = "file" value = "Img Input"/>
	            <S:file name = "file"/>
	        </div>
	        <div class = "form-group">
	            <S:label for = "salesitem.info" value = "Detail"/>
	            <S:textarea name = "salesitem.info" cssClass="form-control" placeholder = "ItemDetail"/>
	        </div>
	        <S:submit cssClass = "form-control btn btn-default" value = "Submit"/>
	     </S:form>
		          
     </div>
      
  </body>
</html>
