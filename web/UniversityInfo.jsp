<%-- 
    Document   : UniversityInfo
    Created on : Aug 25, 2022, 6:57:51 PM
    Author     : hmayw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DAOClasses.InstituteDAO,PojoClasses.InstitutePojo,java.sql.Connection"%>
<%@page import='java.util.*' %>
<%@include file="MultipleLanguage.html" %>

<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AICTE details</title>
    <link href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css" rel="stylesheet">
    <link rel="stylesheet" href="deshboard.css">
    <link rel="stylesheet" href="studentdashboard.css">
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
                    <!-- h2>AICTE</h2>< -->
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
                        <a href="UniversityInfo.jsp"><h5 id="dash" >Institute detail</h5></a>
                        
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
            </div>
        </div>
        <div id="center">
            <nav>
                <div id="one">
                    <i class="ri-search-line"></i>
                    <input type="text" placeholder="Search">
                </div>
                <div id="two">
                    <i class="ri-notification-2-fill"></i>
                </div>
            </nav>
            <div id="detailList">
                <h3>Institute Information</h3>
            </div>
            <div><br>
                <table style="width:50%">
            
                    <tr>
                      <th>University Name</th>
                      <th>Id</th>
                      <th>Website</th>
                      <th>Email</th>
                      <th>Contact Number</th>
                      <th>Number of Students</th>
                      <th>Address</th>
                    </tr>
                      <% List<InstitutePojo> list=InstituteDAO.getAllInstitute((Connection)application.getAttribute("conn"));%>
               <%  
                    System.out.println(list.size());
                   for(InstitutePojo obj:list) {
                       %>
                  <tr>
                      <td><%= obj.getName() %></td>
                      <td><%= obj.getId() %></td>
                      <td><%= obj.getWebsite() %></td>
                      <td><%= obj.getEmail() %></td>
                      <td><%= obj.getPhone() %></td>
                      <td><%= obj.getStudents_count() %></td>
                      <td><%= obj.getAddress() %></td>
                    </tr>
                   
                    <% } %>
                  </table>  
               </table>
            </div>
               
        </div>
    </div>
</body>
</html>
