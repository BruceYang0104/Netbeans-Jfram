/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao.Member;
import Dao.MemberConnection.DbConnection;
import Model.member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author student
 */
public class implMember implements memberDao{
    
     public static void main(String[] args) {
        /*member m=new member("teacher","teacher","1234","台北");
        new implMember().add(m);*/
        //new implMember().add(new member("Batman","aaa","1234","QQ"));
        //new implMember().add(new member("Ironman","bbb","456","WW"));
        //new implMember().add(new member("QQ","ccc","789","TW"));
        
        System.out.println(new implMember().query("ccc", "789"));//確認帳號密碼對錯
        System.out.println(new implMember().query("ccc"));//帳號有沒有重複
        
    }


    @Override
    public void add(member m) {
         Connection conn=DbConnection.getDb();
         String SQL="insert into member(name,username,password,mail) values(?,?,?,?)";
        try {          
            PreparedStatement ps=conn.prepareStatement(SQL);
            ps.setString(1, m.getName());
            ps.setString(2, m.getUsername());
            ps.setString(3, m.getPassword());
            ps.setString(4, m.getMail());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(implMember.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    /**
     * 確認帳號密碼
     * @param username
     * @param password
     * @return 
     */
    @Override
    public boolean query(String username, String password) {
     Connection conn=DbConnection.getDb();
     String sql="select * from member where username=? and password=?";
     boolean x=false;
     
         try {
             PreparedStatement ps=conn.prepareStatement(sql);
             ps.setString(1,username);
             ps.setString(2,password);
             ResultSet rs=ps.executeQuery();
             if(rs.next()) x=true;
             
         } catch (SQLException ex) {
             Logger.getLogger(implMember.class.getName()).log(Level.SEVERE, null, ex);
         }
     
     return x;
      
    }
    /**
     * 帳號有沒有重複
     * @param username
     * @return 
     */
    @Override
    public boolean query(String username) {
      Connection conn=DbConnection.getDb();
     String sql="select * from member where username=?";
     boolean x=false;
     
         try {
             PreparedStatement ps=conn.prepareStatement(sql);
             ps.setString(1,username);
             //ps.setString(2,password);
             
             ResultSet rs=ps.executeQuery();
             if(rs.next()) x=true;
             
         } catch (SQLException ex) {
             Logger.getLogger(implMember.class.getName()).log(Level.SEVERE, null, ex);
         }
     
     return x;
    }
    
    
    //密碼重複
    @Override
    public boolean query1(String password) {
      Connection conn=DbConnection.getDb();
     String sql="select * from member where password=?";
     boolean x=false;
     
         try {
             PreparedStatement ps=conn.prepareStatement(sql);
             ps.setString(1,password);
             //ps.setString(2,password);
             
             ResultSet rs=ps.executeQuery();
             if(rs.next()) x=true;
             
         } catch (SQLException ex) {
             Logger.getLogger(implMember.class.getName()).log(Level.SEVERE, null, ex);
         }
     
     return x;
    }
}
