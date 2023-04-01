/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOClasses;

import PojoClasses.InstitutePojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class InstituteDAO {
   
    public static boolean addInstitute(Connection conn,InstitutePojo obj)throws SQLException {
        PreparedStatement ps=conn.prepareStatement("insert into institutes values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,obj.getId());
        ps.setString(2,obj.getName());
        ps.setString(3,obj.getCity());
        ps.setString(4,obj.getState());
        ps.setInt(5,obj.getStudents_count());
       
        ps.setString(6,obj.getPassword());
        ps.setString(7,obj.getPostal_code());
        ps.setString(8, obj.getAddress());
        ps.setString(9,obj.getRegion());
        ps.setString(10,obj.getType());
        ps.setString(11,obj.getWebsite());
        ps.setString(12,obj.getPhone());
        ps.setString(13,obj.getEmail());
        
        return ps.executeUpdate()==1;
    }
    public static List<InstitutePojo> getAllInstitute(Connection conn)throws SQLException{
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from institutes");
        List<InstitutePojo>list=new ArrayList<>();
        while(rs.next()){
            InstitutePojo obj=new InstitutePojo();
            obj.setId(rs.getString(1));
            obj.setName(rs.getString(2));
            obj.setCity(rs.getString(3));
            obj.setState(rs.getString(4));
            obj.setStudents_count(rs.getInt(5));
            
            obj.setPassword(rs.getString(6));
            obj.setPostal_code(rs.getString(7));
            obj.setAddress(rs.getString(8));
            obj.setRegion(rs.getString(9));
            obj.setType(rs.getString(10));
            obj.setWebsite(rs.getString(11));
            obj.setPhone(rs.getString(12));
            obj.setEmail(rs.getString(13));
            list.add(obj);
        }
        return list;
    }
    public static boolean validateUser(Connection conn,String id,String pwd)throws SQLException {
        PreparedStatement ps=conn.prepareStatement("select * from institutes where id=? and password=?");
        ps.setString(1, id);
        ps.setString(2,pwd);
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }
    
}
