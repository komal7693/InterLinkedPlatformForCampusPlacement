<%-- 
    Document   : AllStudents
    Created on : Aug 25, 2022, 6:59:49 PM
    Author     : hmayw
--%>

<%@page import="DAOClasses.StudentDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<%@page import="java.sql.Connection,java.util.* ,DAOClasses.StudentDAO,PojoClasses.StudentPojo" %>
 <script src='http://translate.google.com/translate_a/element.js?cb=loadGoogleTranslate'></script>
        <script>
            function loadGoogleTranslate(){
                 new google.translate.TranslateElement("google_element");
            }
        </script>
          <style>
      div#google_element select {
        font-family: sans-serif;
        border: 2px solid gray;
        border-radius: 10px;
       
      }
      div#google_element{
        position: absolute;
        left:78%;
        top:2px;
        
      }
    </style>
    </head>
    <body>
        <div style='witdth:100px;' id="google_element"></div>
    </body>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student</title>
    <link href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css" rel="stylesheet">
    <link rel="stylesheet" href="deshboard.css">
    <link rel="stylesheet" href="studentdashboard.css">
   <style>
       select{
           width:20%;
           height:30px;
           margin-left:20px;
       }
       
       table{
           width:80%;
           text-align: center;
           margin:0px auto;
       }
       h3{
           display: inline;
           width:20%;
           margin:0px auto;
       }
       table,tr,td{
           text-align: center;
       }
       #logout{
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
                <h4>AICTE </h4>
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
                        <a href="AllStudents.jsp"><h5 id="dash" >Student detail</h5></a>
                        
                    </div>
                    
                </div>
                <div id="downList">
                    <img src="https://ouch-cdn2.icons8.com/i60mWXyYo0NUDg6fCdoCvfC2JLhy2qV4abxwMPXx6hQ/rs:fit:256:256/czM6Ly9pY29uczgu/b3VjaC1wcm9kLmFz/c2V0cy9zdmcvNDE5/Lzg3YTNlOTE3LWNl/ZjAtNDg5OC04NDhi/LWE4ODk5ODMwMWZl/ZC5zdmc.png" alt="">
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
                </div>
            </div>
        </div>
        <div id="center">
            <div id='components'>
                   </select>
                       <select id='three'  >
                    <option value='none'selected disabled="">--Select Students--</option>
                    <option value='pl'>Placed</option>
                    <option value='upl'>UnPlaced</option>
                    
                    
                    </select>
                    </select>
                       <select id='four'  >
                    <option value='none'selected disabled="">--Select Skill--</option>
                    <option value='c/c++'>C/C++</option>
                    <option value='java'>Java</option>
                    <option value='python'>Python</option>
                    <option value='reactjs'>ReactJs</option>
                    <option value='c#'>C#</option>
                    </select>
                <select id='one' style=' width:20%;height:30px;' >
                    <option  value='none'selected disabled="">--select Branch--</option>
                    <option value='cse'>Computer Science</option>
                    <option value='it'>Information Technology</option>
                    <option value='ai'>Artificial Intelligence and Machine Learning</option>
                    
                </select>
                
                     <select id='two'  >
                    <option value='none'selected disabled="">--select Passout Year--</option>
                    <option value='2017'>2017</option>
                    <option value='2018'>2018</option>
                    <option value='2019'>2019</option>
                    <option value='2020'>2020</option>
                    <option value='2021'>2021</option>
                    <option value='2022'>2022</option>
                    <option value='2023'>2023</option>
                    
                     </select>
                    
                
             
                
       
            </div>
            <div id="detailList">
                <h3>Parsonal Information</h3>
            </div>
            <div id='contents'><br>
                <table >
                    <tr>
                        <th>Name</th>
                       
                        <th>Institute id</th>
                        <th>Phone</th>
                        <th>Email</th>
                        <th>Contact Number</th>
                        <th>Passout Year</th>
                        <th>Placement Status</th>
                        <th>Branch</th>
                        <th>Skills</th>
                    </tr>
                    <%
                        List<StudentPojo>list=StudentDAO.getAllStudents((Connection)application.getAttribute("conn"));
                        for(StudentPojo obj :list){
                    %>
                    <tr>
                         <td><%= obj.getName() %></td>
                    <td><%= obj.getInstitute_id() %></td>
                    <td><%= obj.getPhone()%></td>
                    <td><%= obj.getEmail() %></td>
                    <td><%= obj.getPhone() %></td>
                    <td><%= obj.getPassout_year() %> </td>
                    <td><%= obj.getPlacement_status() %></td>
                    <td><%= obj.getBranch() %> </td>
                    <td><%= obj.getSkills() %></td>
                    </tr>
                    <% } %>
                    
                    
                </table>
            </div>
        

            </div>
        </div>
    </div>
      <script>
        
          let select=document.querySelector("#components select#two");
          let select2=document.querySelector("#components select#one");
          let select3=document.querySelector("#components select#three");
          let select4=document.querySelector("#components select#four");
          console.log(select2);
          select2.addEventListener("click",(e)=>{
              console.log("clicked");
              if(e.target.value==='cse')
              {
                 let tr=document.querySelectorAll("tr");
                 for(let i=1;i<tr.length;i++){
                     let td=tr[i].children;
                     let branch=td[7].innerText;
                    
                     if(branch=='CSE')
                         tr[i].style.display="";
                     else 
                         tr[i].style.display="none";
                 }
              }
              else if(e.target.value==='it')
              {
                 let tr=document.querySelectorAll("tr");
                 for(let i=1;i<tr.length;i++){
                     let td=tr[i].children;
                     let branch=td[7].innerText;
                   
                     if(branch=='IT')
                         tr[i].style.display="";
                     else
                         tr[i].style.display="none";
                }
              }
                else if(e.target.value==='ec')
              {
                 let tr=document.querySelectorAll("tr");
                 for(let i=1;i<tr.length;i++){
                     let td=tr[i].children;
                     let branch=td[7].innerText;
                   
                     if(branch=='EC')
                         tr[i].style.display="";
                     else
                         tr[i].style.display="none";
                }
              }
          }
              )
              
          
          select4.addEventListener("click",(e)=>{
              console.log("clicked");
              if(e.target.value==='c/c++')
              {
                 let tr=document.querySelectorAll("tr");
                 for(let i=1;i<tr.length;i++){
                     let td=tr[i].children;
                     let skill=td[8].innerText;
                    
                     if(skill=='c/c++')
                         tr[i].style.display="";
                     else 
                         tr[i].style.display="none";
                 }
              }
              else if(e.target.value==='java')
              {
                 let tr=document.querySelectorAll("tr");
                 for(let i=1;i<tr.length;i++){
                     let td=tr[i].children;
                     let skill=td[8].innerText;
                     console.log(skill);
                   
                     if(skill=='java')
                         tr[i].style.display="";
                     else
                         tr[i].style.display="none";
                }
              }
               else if(e.target.value==='python')
              {
                 let tr=document.querySelectorAll("tr");
                 for(let i=1;i<tr.length;i++){
                     let td=tr[i].children;
                     let skill=td[8].innerText;
                     console.log(skill);
                   
                     if(skill=='python')
                         tr[i].style.display="";
                     else
                         tr[i].style.display="none";
                }
              }
               else if(e.target.value==='reactjs')
              {
                 let tr=document.querySelectorAll("tr");
                 for(let i=1;i<tr.length;i++){
                     let td=tr[i].children;
                     let skill=td[8].innerText;
                     console.log(skill);
                   
                     if(skill=='reactjs')
                         tr[i].style.display="";
                     else
                         tr[i].style.display="none";
                }
              }
               else if(e.target.value==='c#')
              {
                 let tr=document.querySelectorAll("tr");
                 for(let i=1;i<tr.length;i++){
                     let td=tr[i].children;
                     let skill=td[8].innerText;
                     console.log(skill);
                   
                     if(skill=='c#')
                         tr[i].style.display="";
                     else
                         tr[i].style.display="none";
                }
              }
          }
              )
          
           select3.addEventListener("click",(e)=>{
              console.log("clicked");
              if(e.target.value==='pl')
              {
                 let tr=document.querySelectorAll("tr");
                 for(let i=1;i<tr.length;i++){
                     let td=tr[i].children;
                     let isplaced=td[6].innerText;
                    
                     if(isplaced=='Y')
                         tr[i].style.display="";
                     else 
                         tr[i].style.display="none";
                 }
              }
              else if(e.target.value==='upl')
              {
                 let tr=document.querySelectorAll("tr");
                 for(let i=1;i<tr.length;i++){
                     let td=tr[i].children;
                     let isplaced=td[6].innerText;
                   
                     if(isplaced=='N')
                         tr[i].style.display="";
                     else
                         tr[i].style.display="none";
                }
              }}
              )
              
          
          
          select.addEventListener("click",(e)=>{
              
              if(e.target.value==='2017')
              {
                 let tr=document.querySelectorAll("tr");
                 for(let i=1;i<tr.length;i++){
                     let td=tr[i].children;
                     let year=td[5].innerText;
                    
                     if(year=='2017')
                            tr[i].style.display="";
                     else
                         tr[i].style.display="none";
                  
                 }
              }
              else if(e.target.value==='2018')
              {
                 let tr=document.querySelectorAll("tr");
                 for(let i=1;i<tr.length;i++){
                     let td=tr[i].children;
                     let year=td[5].innerText;
                   
                     if(year=='2018')
                            tr[i].style.display="";
                     else
                         tr[i].style.display="none";
                 }
              }
              else if(e.target.value==='2019')
              {
                 let tr=document.querySelectorAll("tr");
                 for(let i=1;i<tr.length;i++){
                     let td=tr[i].children;
                     let year=td[5].innerText;
                     
                     if(year=='2019')
                           tr[i].style.display="";
                     else
                         tr[i].style.display="none";
                     
                 }
              }
              else if(e.target.value==='2020')
              {
                 let tr=document.querySelectorAll("tr");
                 for(let i=1;i<tr.length;i++){
                     let td=tr[i].children;
                     let year=td[5].innerText;
                    
                     if(year=='2020')
                           tr[i].style.display="";
                     else
                         tr[i].style.display="none";
                     
                 }
              }
              else if(e.target.value==='2021')
              {
                 let tr=document.querySelectorAll("tr");
                 for(let i=1;i<tr.length;i++){
                     let td=tr[i].children;
                     let year=td[5].innerText;
                    
                     if(year=='2021')
                            tr[i].style.display="";
                     else
                         tr[i].style.display="none";
                 }
              }
              else if(e.target.value==='2022')
              {
                 let tr=document.querySelectorAll("tr");
                 for(let i=1;i<tr.length;i++){
                     let td=tr[i].children;
                     let year=td[5].innerText;
                     
                     if(year=='2022')
                            tr[i].style.display="";
                     else
                         tr[i].style.display="none";
                    
                 }
              }
              else if(e.target.value==='2023')
              {
                 let tr=document.querySelectorAll("tr");
                 for(let i=1;i<tr.length;i++){
                     let td=tr[i].children;
                     let year=td[5].innerText;
                     
                     if(year=='2023')
                           tr[i].style.display="";
                     else
                         tr[i].style.display="none";
                    
                 }
              }
              
              
             
          })
          
         </script>
                  
</body>
</html>
