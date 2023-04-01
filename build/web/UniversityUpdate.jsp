<%-- 
    Document   : UniversityUpdate
    Created on : Aug 25, 2022, 6:58:42 PM
    Author     : hmayw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="MultipleLanguage.html" %>

<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Institute details</title>
    <link href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css" rel="stylesheet">
    <link rel="stylesheet" href="deshboard.css">
    <link rel="stylesheet" href="studentdashboard.css">
    <style>
        table{
            width:80%;
            margin:0px auto;
            
        }
        table,tr,td,th{
            border:none;
        }
        input{
            padding:8px 10px;
            width:40%;
            border-radius: 10px;
            outline:none;
            font-size:16px;
           
        }
        th{
            font-size:18px;
        }
        input:hover{
             box-shadow: 0px 0px 0px 2px skyblue;
            border-width: 0px;
        }
        input[type='submit']{
            width:80px;
            padding:10px 20px;
            position: relative;
            left:30%;
            top:10px;
        }
        input[type='submit']:hover{
            background-color: green;
            color:white;
            cursor: pointer;
        }
        #detailList{
            position: relative;
            left:30%;
            color:blue;
        }
    </style>
    <style>#logout{
            position:absolute;
            left:90%;
            top:50px;
            border :2px solid black;
            border-radius: 3px;
            padding:7px 15px;
            font-family: sans-serif;
            cursor: pointer;
            color:black;
            text-decoration: none;
        }
        #logout:hover{
            background-color: black;
            color:white;
            text-decoration: underline;
            
        }
         span#ses{
            position:relative;
            top:50%;
            left:40%;
            color:blue;
            font-size:20px;
            
        }
      </style>

</head>
<body>
     <%
        if(session.isNew()){
             out.println("<span id='ses'>Your Session Expired ,Please relogin !<span>");
             out.println("<a href='aicte.html' >Login page</a>");
             return ;
        }
    %>
    <a href='SessionExpire' id='logout' onclick='return check()'>logout</a>
          <script>
                 function check(){
                     let x= confirm("Are you sure ,do you want do logout");
                     return x;
                 }
            </script>
    <div id="bg">
        <div id="left">
            <div id="logo">
                <div id = "smaldiv">
                    <img src="logo.jpg" alt="">
                    <!-- <h2>J</h2> -->
                </div>
                <h4>AICTE</h4>
                
            </div>
            <div id="leftHalf">
                <div id="list">
                    <div class="details">
                        <i id="dash" class="ri-dashboard-fill"></i>
                        <a href="AdminDashboard.jsp"><h5 id="dash" >Home</h5></a>
                        
                    </div>
                    <div class="details">
                        <i id="dash" class="ri-dashboard-fill"></i>
                        <a href="UniversityInfo.jsp"><h5 id="dash" >Institute Info</h5></a>
                    </div>
                    <div class="details">
                        <i id="dash" class="ri-dashboard-fill"></i>
                        <a href="UniversityUpdate.jsp"><h5 id="dash" >Add Institute detail</h5></a>
                        
                    </div>
                    <div class="details">
                        <i id="dash" class="ri-dashboard-fill"></i>
                        <a href="AllStudents.jsp"><h5 id="dash" >Student detail</h5></a>
                        
                    </div>
                </div>
                <div id="downList">
                    <img src="https://ouch-cdn2.icons8.com/i60mWXyYo0NUDg6fCdoCvfC2JLhy2qV4abxwMPXx6hQ/rs:fit:256:256/czM6Ly9pY29uczgu/b3VjaC1wcm9kLmFz/c2V0cy9zdmcvNDE5/Lzg3YTNlOTE3LWNl/ZjAtNDg5OC04NDhi/LWE4ODk5ODMwMWZl/ZC5zdmc.png" alt="">
                </div>
            </div>
        </div>
        <div id="center">
           
            <div id="detailList">
                <h2>Institute Information</h3>
            </div>
            <div><br>
                <form action='InstituteRegstraionServlet' method="post">
                     <table>
                    <tr>
                        <th>Id</th>
                        <td><input required type="text" placeholder="Enter id" name="id"> </td>
                    </tr>
                    <tr>
                        <th>Name</th>
                        <td><input required type="text" placeholder="Enter your Institute name " name="name"> </td>
                    </tr>
                      <tr>
                        <th>Password</th>
                        <td><input required type="password" min='8' placeholder="Password" name="pwd"> </td>
                    </tr>
                    <tr>
                        <th>Address</th>
                        <td><input required type="text" placeholder="Enter Address" name="address"></td>
                     </tr>
                     <tr>
                        <th>Postal code</th>
                        <td><input required type="text" placeholder="Enter Postal code" name="postat_code"></td>
                     </tr>
                     <tr>
                        <th>Region</th>
                        <td><input required type="text" placeholder="Enter Region" name="region"></td>
                     </tr>
                     <tr>
                        <th>State</th>
                        <td><input required type="text" placeholder="Enter State" name="state"></td>
                     </tr>
                     <tr>
                        <th>City</th>
                        <td><input required type="text" placeholder="Enter City" name="city"></td>
                     </tr>
                     <tr>
                        <th>Institute Type</th>
                        <td><input required type="text" placeholder="Enter Unyversity type" name="type"></td>
                    </tr>
                    <tr>
                    <th>Website</th>
                        <td><input type="text" required placeholder="Enter Website" name="website"></td>
                    </tr>
                    <tr>
                        <th>Contact No.</th>
                        <td><input type="text" required placeholder="Enter contact No." name="contact"></td>
                    </tr>
                    <tr>
                        <th>Email Id</th>
                        <td><input required  type="email" placeholder="Enter Email" name="email"></td>
                    </tr>        
                </table>
                    <input class='edit' type='submit' value='save'/>
                </form>    
            </div>
                
                <!-- <div id="about">
                    <a href="#">About US</a>
                    <a href="#"> Help</a>
                </div> -->

            </div>
        </div>
    </div>
</body>
</html>
