/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author hmayw
 */
public class MyListener implements ServletContextListener {
     private Connection conn;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
       ServletContext sc=sce.getServletContext();
       String driver = sc.getInitParameter("driver");
       String path= sc.getInitParameter("path");
       String user=sc.getInitParameter("user");
       String pwd=sc.getInitParameter("pwd");
       
       try{
           Class.forName(driver);
           conn=DriverManager.getConnection(path,user,pwd);
           sc.setAttribute("conn",conn);
           System.out.println("Connection opened");
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
       }
       
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
      if(conn!=null){
            try{
           conn.close();
       }
       catch(SQLException ex)
       {
           ex.printStackTrace();
       }
      }
    }
    
}

