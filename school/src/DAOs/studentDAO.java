/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import db.Database_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static school.School.url;
import entities.student;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author hp
 */
public class studentDAO {
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    
    public List<student> getNameByAlpha(String alpha){
        Database_Connection database_Connection = new Database_Connection(url);
        Connection con = database_Connection.db_connction();
        List<student> students=new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("select * from students where name like '"+alpha+"%' and deleted=false");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                student std=new student();
                std.setId(rs.getInt("id"));
                std.setName(rs.getString("name"));
                std.setClassName(rs.getString("className"));
                std.setCNIC(rs.getString("CNIC"));
                std.setAddress(rs.getString("Address"));
                std.setAdmissionDate(rs.getDate("admissionDate"));
                std.setImage(rs.getBytes("image"));
                std.setDeleted(rs.getBoolean("deleted"));
                students.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(studentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(studentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return students;
    }
    
    public List<student> findAll(){
        Database_Connection database_Connection = new Database_Connection(url);
        Connection con = database_Connection.db_connction();
        List<student> students=new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("select * from students where deleted=false");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                student std=new student();
                std.setId(rs.getInt("id"));
                std.setName(rs.getString("name"));
                std.setClassName(rs.getString("className"));
                std.setCNIC(rs.getString("CNIC"));
                std.setAddress(rs.getString("Address"));
                std.setAdmissionDate(rs.getDate("admissionDate"));
                std.setImage(rs.getBytes("image"));
                std.setDeleted(rs.getBoolean("deleted"));
                students.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(studentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(studentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return students;
    }
    
    public void saveStudent(student student){
        Database_Connection database_Connection = new Database_Connection(url);
        Connection con = database_Connection.db_connction();
        try {
            PreparedStatement ps=con.prepareStatement("insert into students (id, name, className, CNIC, address, admissionDate, image, deleted) values (max(id)+1, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, student.getName());
            ps.setString(2, student.getClassName());
            ps.setString(3, student.getCNIC());
            ps.setString(4, student.getAddress());
            ps.setDate(5, Date.valueOf(sdf.format(student.getAdmissionDate())));
            ps.setBytes(6, student.getImage());
            ps.setBoolean(7, student.isDeleted());
            ps.executeUpdate();
            System.out.println("Student added succesfully...");
        } catch (SQLException ex) {
            Logger.getLogger(studentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(studentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void deleteStudent(int id){
        Database_Connection database_Connection = new Database_Connection(url);
        Connection con = database_Connection.db_connction();
        try {
            PreparedStatement ps=con.prepareStatement("update students set deleted=true where id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Student deleted succesfully...");
        } catch (SQLException ex) {
            Logger.getLogger(studentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(studentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void updateStudent(student student){
        Database_Connection database_Connection = new Database_Connection(url);
        Connection con = database_Connection.db_connction();
        try {
            PreparedStatement ps=con.prepareStatement("update students set name=?, className=?, CNIC=?, address=?, admissionDate=?, image=? where id=? and deleted=false");
            ps.setString(1, student.getName());
            ps.setString(2, student.getClassName());
            ps.setString(3, student.getCNIC());
            ps.setString(4, student.getAddress());
            ps.setDate(5, Date.valueOf(sdf.format(student.getAdmissionDate())));
            ps.setBytes(6, student.getImage());
            ps.setInt(7, student.getId());
            ps.executeUpdate();
            System.out.println("Student updated successfully ...");
        } catch (SQLException ex) {
            Logger.getLogger(studentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
