/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao.Member;

import Model.member;

/**
 *
 * @author student
 */
public interface memberDao {
    //新增
    void add(member m);//註冊
    
    //查詢
    boolean query(String username,String password);
    boolean query(String username);
    boolean query1(String password);
    
    //修改
    
    
    //刪除

}
