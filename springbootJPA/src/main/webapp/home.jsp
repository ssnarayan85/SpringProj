<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <form action = "addBook">
    Book ID:<br>
	<input type="text" name="bookid" id="bkid"><br> 	
	Book Title:<br>
	<input type="text" name="title" id="bktitle"><br>
	Book Price: <br>
	<input type="text" name="price" id="bkprice"><br>
	Book Volume: <br>
	<input type="text" name="volume" id="bkvol"><br>
	Book PublishDate: <br>
	<input type="text" name="publishdate" id="bkpublishdate"><br>	 
	<button name="addbk" type="submit" value="addbk">AddBook</button>
 </form>
 
 <br>
 <h2> Search Book</h2>
 <br>
 
  <form action = "getBook">
    Book ID:<br>
	<input type="text" name="bookid" id="bkid"><br> 	
	<button name="getBk" type="submit" value="getbk">GetBook</button>
 </form>
 
 <br>
 <h2> Search Book By Title</h2>
 <br>
  <form action = "getBookByTitle">
    Book Title:<br>
	<input type="text" name="title" id="bktitle"><br>	
	<button name="getBkByTitle" type="submit" value="getbkbytitle">GetBookByTitle</button>
 </form>
 
 
 <br>
 <h2> Delete Book</h2>
 <br>
 
  <form action = "delBook">
    Book ID:<br>
	<input type="text" name="bookid" id="bkid"><br> 	
	<button name="delBk" type="submit" value="delbk">Delete</button>
 </form>
 
 
</body>
</html>