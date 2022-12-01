/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brian
 */
public class QQConnection {
    public static void main(String[] args) {//Main方法在class裡面
        System.out.println(QQConnection.getQQ());
    }//注意
    public static Connection getQQ()
        {
            Connection conn=null;
            String url="jdbc:mysql://localhost:3306/LifeNumber";
            String user="root";
            String password="1234";
            try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url, user, password);
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(QQConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(QQConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
            return conn;
        }
}
