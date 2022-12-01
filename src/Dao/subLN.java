/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import Model.LifeClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Brian
 */
public class subLN implements lifeDao{
    
    public static void main(String[]args)
    {
        //new subLN().add("batman","19500229");
        //System.out.println();
    }

    @Override
    public void add(String name, String birth) {
        Connection conn=QQConnection.getQQ();
        String sql="insert into LifeNumber.mytable(name,birth) values(?,?)";
        LifeClass L=new  LifeClass(name,birth);
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,L.getName());
            ps.setString(2,L.getBirth());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(subLN.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @Override
    public void add(LifeClass L) {
        Connection conn=QQConnection.getQQ();
        String sql="insert into LifeNumber.mytable(name,birth) values(?,?)";
        //LifeClass L=new  LifeClass(name,birth);不用寫
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,L.getName());
            ps.setString(2,L.getBirth());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(subLN.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String Q() {
        String R="";
        Connection conn=QQConnection.getQQ();
        String sql="select * from LifeNumber.mytable";
                
        try 
        {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                R=R+("No: "+rs.getInt("id")+"\t"+
                     "Name: "+rs.getString("name")+
                      "\nBirth:\t"+rs.getNString("birth")+"\n===================================\n");
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(subLN.class.getName()).log(Level.SEVERE, null, ex);
        }
        return R;
    }
    
        
    @Override
    public void update(LifeClass L) {
        Connection conn=QQConnection.getQQ();
        String sql="update LifeNumber.mytable set name=?,birth=? where id=?";
        
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,L.getName());
            ps.setString(2,L.getBirth());
            ps.setInt(3,L.getId());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(LifeClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public LifeClass Qid(int id) {
        LifeClass L=null;
        Connection conn=QQConnection.getQQ();
        String sql="select * from LifeNumber.mytable where id=?";
        
        try {
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next())
            {
                L=new LifeClass();
                L.setId(rs.getInt("id"));
                L.setName(rs.getString("name"));
                L.setBirth(rs.getString("birth"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(subLN.class.getName()).log(Level.SEVERE, null, ex);
        }
        return L;
    }

    @Override
    public void delete(int id) 
    {
        Connection conn=QQConnection.getQQ();
        String sql="delete from LIfeNumber.mytable where id=?";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LifeClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    
    
}
