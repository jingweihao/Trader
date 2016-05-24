<%@taglib prefix = "S" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Home</title>
	
    <link rel="stylesheet" type="text/css" href="style_home.css" />
    <link rel="stylesheet" type="text/css" href="bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="docs.min.css" />    

  </head>
  
  <body>
     <nav class = "navbar navbar-default navbar-fixed-top" role = "navigation">
        <div class = "container-fluid">
            <div class = "navbar-header">
	            <a class = "navbar-brand" href = "#">Trader</a>
	        </div>
	        <div>
	            <ul class = "nav navbar-nav navbar-right">
	               <li class = "active"><a href = "Home.jsp">Home</a></li>
	               <li><a href = "Personal.jsp" >Personal</a></li>
	               <li><a href = "login.jsp" class = "navbar-link">Log out</a></li>        
	            </ul>
	        
	        </div>
        </div>        
     </nav> 
     <div class = "bs-docs-header" id = "content" tabindex = "-1">
        <div class = "container">
            <h1>Buy</h1>
        </div>        
     </div>
     
<!--      <img alt="Anteater" src="anteater.png" id = "Ant" />
    <form action="PersonalAction" method = "GET">
        <input class = "btn btn-large btn-primary" type = "button" value = "Personal" id = "Personal" >
        <input class = "btn btn-large" type = "button" value = "Logout" id = "Logout" >
    </form> -->
    
    
    <S:form action="SearchAction" method = "GET" namespace = "/">
    <div class = "row">
        <div class = "col-md-6 col-md-offset-3">
	        <div class = "input-group" id = "Searchbox">
	             <S:textfield cssClass = "form-control" id = "Querybox" name = "searchword" />
	             <span class = "input-group-btn">
	                 <S:submit cssClass = "btn btn-primary" value = "Search" />
	             </span>           
	        </div>
        </div>
    </div>
    </S:form>
    
  </body>
</html>
