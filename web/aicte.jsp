<%-- 
    Document   : aicte
    Created on : Aug 26, 2022, 3:57:45 PM
    Author     : hmayw
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file='MultipleLanguage.html' %>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="aicte.css">
    <script src="aicte.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">

    <title>AICTE</title>

</head>
<body>

<!--News Section-->
<div class="news">
    <p>News</p>
    <div>
        <marquee>•All Institutions are requested to complete Registration & Assessments without fail.
            •Implementation of PARAKH has been made mandatory for every Institute (Engineering, MBA & MCA
            Institutions) as per the Norms for Essential Requirements of the Technical Institutions mentioned in
            Approval Process Handbook 2022-23(APPENDIX-6, 6.1/42) •AICTE PARAKH Portal is OPEN for Registration and
            Assessments •AICTE SLA (PARAKH) is not an Examination, its a friendly assessment pattern </marquee>
    </div>
</div>

<!--This is header-->

    <header class="header">
        <a href="#">
            <img src="images/aicte logo.jpg"></a>
        <h1>AICTE</h1>
        <li style="list-style-type:none; padding:1% 0">
            <button class="sbutton" onclick="login()" >Login</button>
        </li>
  </label>

        <div id="mee" class="mee" onclick="myfun()">
            <div class="mee1"></div>
            <div class="mee2"></div>
            <div class="mee3"></div>
        </div>

    </header>




<!--This is menu-->
    <menu class="menu" id="menu">

        <ul>


            <li><a href="aicte.html">
                    Home
                </a></li>

            <li> <a href="about.html">
                    About Us
                </a></li>

            <li><a href="privacypolicy.html">
                    Privacy Policy
                </a></li>

            <li><a href="desclaimer.html">
                    Disclaimer
                </a></li>

         
            <li><a href="faq.html">
                    FAQ
                </a></li>
            <li><a href="contactus.html">
                    Contact Us
                </a></li>
            <li><a href="tandc.html">
                    Terms and Condition
                </a></li>
            
                   
        </ul>
        

    </menu>







    <!-- Login institute -->
 
<div class="register "  id="login">
    <form action='CheckServlet'>
        <div class="login">
   
            <h1 class="close" onclick="login_close()"><abbr title="Click to close">X</abbr></h1>
            <h1>Login Panel</h1>
            <br><br>
            <fieldset>
                <legend>Already a Member</legend>

                <br>

               
                    <label>&nbsp;ID: </label>
                 <input type="text" placeholder="Enter Username" name="username" required>
                 <label>&nbsp;Password: </label>
                 <input type="password" class="password-register" placeholder="Enter Password" name="password" required>
               <input type='radio' name='user' value='admin'/>  Admin &nbsp;&nbsp;
                <input type='radio' name='user' value='inistitute'/> Institute &nbsp;&nbsp;
                 <input type='radio' name='user' value='company'/>Companies 
                 <button type="submit" class="registerbtn">Login</button>
               
                
               
                <br>
                <input type="checkbox"> Remember me

                <span style="float:right; padding:1px;"> Forgot <a href="#"> password? </a></span>
            </fieldset>
        </div>
    </form>
   
</div>








<!-- Company login -->

<div class="register "  id="login_c">
    <form>
        <div class="login">
            <h1 class="close" onclick="login_close_c()"><abbr title="Click to close">X</abbr></h1>
            <h1>Company Login</h1>
            <br><br>
            <fieldset>
                <legend>Already a Member</legend>

                <br>

                <label>Company ID: </label>
                <input type="text" placeholder="Enter Username" name="username" required>
                <label>Password: </label>
                <input type="password" class="password-register" placeholder="Enter Password" name="password" required>
                <button type="submit" class="registerbtn">Login</button>
                <div class="registerbtn" onclick="register_c()" style="text-align:center; background-color:gray">Sineup</div>
                <br>
                <input type="checkbox"> Remember me

                <span style="float:right; padding:1px;"> Forgot <a href="#"> password? </a></span>
            </fieldset>
        </div>
    </form>
    <button class="sbutton" onclick="login()" >Institute Login</button>
</div>







    <!--Register-->
    <div class="register" id="register">
        <form>

            <h1 class="close" onclick="register_close()"><abbr title="Click to close">X</abbr></h1>
            <h1>Institute Registration </h1>
            <br>
            <br>
            <label>Institute ID</label>
            <input type="text" name="instituteid" placeholder="Enter Erollment Number"  required>
            
            <label>Institute Name</label>
            <input type="text" name="institutename" placeholder="Enter University ID"  required>

         
            
                <br>
                Mobile No. :
                <div style="display:flex; ">
            </label>
            <input style="display: inline-block ; border:2px solid gray; width:70px; margin-right:2px;" type="text"
                name="country code" placeholder="Country Code" value="+91" size="2" />
            <input type="text" name="phone" placeholder="phone no." size="10"  required>
    </div>
    Address :
    <textarea cols="80" rows="5" placeholder="Current Address"  required>
              </textarea>
    <label for="email">Email:</label>
    <input type="text" placeholder="Enter Email ID" name="email"  required>


<input type="number"  min="0" max="1" step="0.001" placeholder="Enter Graduation Percentage" name="Graduation"  required>
    <label for="psw">Password</label>
    <input type="password" class="password-register" placeholder="Enter Password" name="psw"  required>

    <label for="psw-repeat">Re-type Password</label>
    <input type="password" class="password-register" placeholder="Retype Password" name="psw-repeat"s  required>
    <button type="submit" class="registerbtn" value="register" >Register</button>

    </form>
    <button class="sbutton" onclick="register_c()" >Company Register</button>
    
    </div>





<!-- /Company signup -->

<div class="register" id="register_c">
    <form>

        <h1 class="close" onclick="register_close_c()"><abbr title="Click to close">X</abbr></h1>
        <h1>Company Registration </h1>
        <br>
        <br>
        <label>Company ID</label>
        <input type="text" name="instituteid" placeholder="Enter Erollment Number"  required>
        
        <label>Company Name</label>
        <input type="text" name="institutename" placeholder="Enter University ID"  required>

     
        
            <br>
            mobile No. :
            <div style="display:flex; ">
        </label>
        <input style="display: inline-block ; border:2px solid gray; width:70px; margin-right:2px;" type="text"
            name="country code" placeholder="Country Code" value="+91" size="2" />
        <input type="text" name="phone" placeholder="phone no." size="10"  required>
</div>
Address :
<textarea cols="80" rows="5" placeholder="Current Address"  required>
          </textarea>
<label for="email">Email:</label>
<input type="text" placeholder="Enter Email ID" name="email"  required>


<input type="number"  min="0" max="1" step="0.001" placeholder="Enter Graduation Percentage" name="Graduation"  required>
<label for="psw">Password</label>
<input type="password" class="password-register" placeholder="Enter Password" name="psw"  required>

<label for="psw-repeat">Re-type Password</label>
<input type="password" class="password-register" placeholder="Retype Password" name="psw-repeat"s  required>
<button type="submit" class="registerbtn" value="register" >Register</button>

</form>
<button class="sbutton" onclick="register_c()" >Institute Register</button>

</div>




    <!--Company-->
    <style>
        
.cnt {
  background-position: contain;
  background-size: 100% 100%;
}
.flex {
  background-color: aliceblue;
  height: 60%;
  border: 2px solid black;
  text-align: center;
  display: flex;
  flex-direction: column;
  margin: 20px;
  padding: 2% 6%;
  border-radius: 30px;
  position: relative;
}
.flex h1 {
  padding: 7px 0;
}
.box {
  float: right;
}

/* footer */

.container {
  max-width: 1170px;
  margin: auto;
}
.row {
  display: flex;
  flex-wrap: wrap;
}
ul {
  list-style: none;
}
.footer {
  height: 80%;
  background-color: #24262b;
  padding: 40px 0;
}
.footer-col {
  margin: 0 10px 10px 0;
  width: 25%;
  padding: 0px 5px;
}
.footer-col h4 {
  font-size: 18px;
  color: #ffffff;
  text-transform: capitalize;
  margin-bottom: 35px;
  font-weight: 500;
  position: relative;
}
.footer-col h4::before {
  position: absolute;
  left: 0;
  bottom: -10px;
  height: 2px;
  box-sizing: border-box;
  width: 50px;
}
.footer-col ul {
  margin: 10px;
}
.footer-col ul li a {
  display: flex;
  font-size: 16px;
  text-transform: capitalize;
  color: #ffffff;
  text-decoration: none;
  font-weight: 300;
  color: #bbbbbb;
  display: block;
  transition: all 0.3s ease;
}
.footer-col ul li a:hover {
  color: #ffffff;
  padding-left: 8px;
}
.footer-col .social-links a {
  display: inline-block;
  height: 40px;
  width: 40px;
  background-color: rgba(255, 255, 255, 0.2);
  margin: 0 10px 10px 0;
  text-align: center;
  line-height: 40px;
  border-radius: 50%;
  color: #ffffff;
  transition: all 0.5s ease;
}
.footer-col .social-links a:hover {
  color: #24262b;
  background-color: #ffffff;
}

.c p{
    color:white;
}
    </style>
<div class="cnt" style="background-image: url('aicte_banner.jpg');">

    <div class="flex" style="margin-top:15%;">
        <h1>Welcome to AICTE</h1>
        <p>All India Council for Technical Education (AICTE) was set up in 
            November 1945 as a national-level Apex Advisory Body to conduct 
            a survey on the facilities available for technical education and 
            to promote development in the country in a coordinated and 
            integrated manner.
        </p>
    </div>
    
    <div class="flex" >
        <h1>How to use Portal</h1>
        <p>Mahatma Gandhi came back to India in 1915. By this time,
            there was a significant escalation in the reputation of
             this man. Furthermore, Mahatma Gandhi becameMahatma Gandhi came back to India in 1915. By this time,
             there was a significant escalation in the reputation of
              this man. Furthermore, Mahatma Gandhi became famous as 
              a leading Indian nationalist. After his return, Gandhi 
              became part of the Indian National Congress. In 1920, 
              this man took leadership of the Congress.
               famous as 
             a leading Indian nationalist. After his return, Gandhi 
             became part of the Indian National Congress. In 1920, 
             this man took leadership of the Congress.
       </p>
    </div>
</div> 

    <br><br><br><br>







    <!--Company-->

    <div class="companies">

        <div class="c">
            <p>All India Council for Technical Education (AICTE)
                was sett up in November 1945 as a national-level Apex</p>

            <button>Visit Company</button>
            <h2>Techgig</h2>
        </div>
        <div class="c">
            <p>All India Council for Technical Education (AICTE) was sett up in November 1945 as a national-level Apex
            </p><button>Visit Company</button>
            <h2>TCS</h2>
        </div>
        <div class="c">
            <p>All India Council for Technical Education (AICTE) was sett up in November 1945 as a national-level Apex
            </p><button>Visit Company</button>
            <h2>Hexaware</h2>
        </div>
        <div class="c">
            <p>All India Council for Technical Education (AICTE) was sett up in November 1945 as a national-level Apex
            </p><button>Visit Company</button>
            <h2>Capegemini</h2>
        </div>
        <div class="c">
            <p>All India Council for Technical Education (AICTE) was sett up in November 1945 as a national-level Apex
            </p><button>Visit Company</button>
            <h2>Cognizent</h2>
        </div>
        <div class="c">
            <p>All India Council for Technical Education (AICTE) was sett up in November 1945 as a national-level Apex
            </p><button>Visit Company</button>
            <h2>Amazon</h2>
        </div>
        <div class="c">
            <p>All India Council for Technical Education (AICTE) was sett up in November 1945 as a national-level Apex
            </p><button>Visit Company</button>
            <h2>Flipkart</h2>
        </div>
        <div class="c">
            <p>All India Council for Technical Education (AICTE) was sett up in November 1945 as a national-level Apex
            </p><button>Visit Company</button>
            <h2>Google</h2>
        </div>
    </div>

    
<br><br>





<!--About AICTE-->
    <section id="au">

        <h2>About AICTE</h2><br>
        <p>All India Council for Technical Education (AICTE) was sett up in November 1945 as a national-level Apex
            Advisory Body to conduct a survey on the facilities available for technical education and to promote
            development in the country in a coordinated and integrated manner. </p>
    </section>

<style>
    .footer-col li{
        list-style-type: none;
        
        padding:5px;
    }
    .footer-col li a{
        color:white;
        list-style-type: none;

    }
</style>

<!--footer-->

<footer class="footer"'>
    <div class="container">
        <div class="row">
            <div class="footer-col">
                <h4>
                    <li><a href="about.html">about us</a></li>
                    <li><a href="privacypolicy.html">privacy policy</a></li></h4>
               
            </div>
            <div class="footer-col">
                <h4>
                    <li><a href="faq.html">FAQ</a></li>
                    <li><a href="contactus.html">contact</a></li></h4>
                
            </div>
            <div class="footer-col">
                <h4><div class="social-links">
                   
                    <a href="#"><i  class="fab fa-facebook-f"></i></a>
                    <a href="#"><i  class="fab fa-twitter"></i></a>
                    <a href="#"><i  class="fab fa-instagram"></i></a>
                    <a href="#"><i  class="fab fa-linkedin-in"></i></a>
                </div></h4>
                
            </div>
        </div>
    </div>
</footer>


    <footer class="f">
        <p style="color:white" id="copico">Created By Heroic Abhiyanta</p>

    </footer>




</body>

</html>

