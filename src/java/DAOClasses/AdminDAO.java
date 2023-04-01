/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hmayw
 */
public class AdminDAO {
    public static boolean validateAdmin(Connection conn,String id,String pwd)throws SQLException{
        PreparedStatement ps=conn.prepareStatement("select * from admin where id=? and password=?");
        ps.setString(1,id);
        ps.setString(2,pwd);
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }
}
