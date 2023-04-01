<%@include file="MultipleLanguage.html" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Registration Success</title>
    <link rel="stylesheet" type="text/css" href="success.css" />
  </head>
  <body>
    <div class="content">
      <img src="images/approve.png" />
      <h2>Registration Success</h2>

      <div class="details">
          Your Collage/university Name : <span><%=request.getAttribute("name") %></span>
        <br />
        Id : <span><%=request.getAttribute("id")%></span><br />
        password <span><%=request.getAttribute("pwd")%></span>
      </div>
      <div class="greet">
        <span> <img src="images/approve.png" /></span>
        <p>
          Thank you, We have sent all other information to your registered email
          <span><%=request.getAttribute("email")%></span>
        </p>
      </div>
      <div>
        <p id="desc">Now you can login By Clicking the below button</p>
        <a href="aicte.html">Home Page</a>
      </div>
    </div>
  </body>
</html>
