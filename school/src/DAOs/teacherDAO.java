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
import entities.teacher;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author hp
 */
public class teacherDAO {
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    
    public List<teacher> getNameByAlpha(String alpha){
        Database_Connection database_Connection = new Database_Connection(url);
        Connection con = database_Connection.db_connction();
        List<teacher> teachers=new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("select * from teacher where name like '"+alpha+"%' and deleted=false");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                teacher teach=new teacher();
                teach.setId(rs.getInt("id"));
                teach.setName(rs.getString("name"));
                teach.setPh(rs.getString("ph"));
                teach.setCNIC(rs.getString("CNIC"));
                teach.setAddress(rs.getString("Address"));
                teach.setEducation(rs.getString("Education"));
                teach.setCreated(rs.getDate("created"));
                teach.setImage(rs.getBytes("image"));
                teach.setDeleted(rs.getBoolean("deleted"));
                teachers.add(teach);
            }
        } catch (SQLException ex) {
            Logger.getLogger(teacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(teacherDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return teachers;
    }
    
    public List<teacher> findAll(){
        Database_Connection database_Connection = new Database_Connection(url);
        Connection con = database_Connection.db_connction();
        List<teacher> teachers=new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("select * from teacher where deleted=false");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                teacher teach=new teacher();
                teach.setId(rs.getInt("id"));
                teach.setName(rs.getString("name"));
                teach.setPh(rs.getString("ph"));
                teach.setCNIC(rs.getString("CNIC"));
                teach.setAddress(rs.getString("Address"));
                teach.setEducation(rs.getString("Education"));
                teach.setCreated(rs.getDate("created"));
                teach.setImage(rs.getBytes("image"));
                teach.setDeleted(rs.getBoolean("deleted"));
                teachers.add(teach);
            }
        } catch (SQLException ex) {
            Logger.getLogger(teacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(teacherDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return teachers;
    }
    
    public void saveTeacher(teacher teacher){
        Database_Connection database_Connection = new Database_Connection(url);
        Connection con = database_Connection.db_connction();
        try {
            PreparedStatement ps=con.prepareStatement("insert into teacher (id, name, ph, CNIC, address, education, created, image, deleted) values (max(id)+1, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, teacher.getName());
            ps.setString(2, teacher.getPh());
            ps.setString(3, teacher.getCNIC());
            ps.setString(4, teacher.getAddress());
            ps.setString(5, teacher.getEducation());
            ps.setDate(6, Date.valueOf(sdf.format(teacher.getCreated())));
            ps.setBytes(7, teacher.getImage());
            ps.setBoolean(8, teacher.isDeleted());
            ps.executeUpdate();
            System.out.println("Teacher added succesfully...");
        } catch (SQLException ex) {
            Logger.getLogger(teacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(teacherDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void deleteTeacher(int id){
        Database_Connection database_Connection = new Database_Connection(url);
        Connection con = database_Connection.db_connction();
        try {
            PreparedStatement ps=con.prepareStatement("update teacher set deleted=true where id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Teacher deleted succesfully...");
        } catch (SQLException ex) {
            Logger.getLogger(teacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(teacherDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void updateTeacher(teacher teacher){
        Database_Connection database_Connection = new Database_Connection(url);
        Connection con = database_Connection.db_connction();
        try {
            PreparedStatement ps=con.prepareStatement("update teacher set name=?, ph=?, CNIC=?, address=?, education=?, created=?, image=? where id=? and deleted=false");
            ps.setString(1, teacher.getName());
            ps.setString(2, teacher.getPh());
            ps.setString(3, teacher.getCNIC());
            ps.setString(4, teacher.getAddress());
            ps.setString(5, teacher.getEducation());
            ps.setDate(6, Date.valueOf(sdf.format(teacher.getCreated())));
            ps.setBytes(7, teacher.getImage());
            ps.setInt(8, teacher.getId());
            ps.executeUpdate();
            System.out.println("Teacher Updated successfully...");
        } catch (SQLException ex) {
            Logger.getLogger(teacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
