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
import static school.Login.url;
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
            PreparedStatement ps = con.prepareStatement("select * from teacher where name like '"+alpha+"%' and deleted=0");
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
                teach.setCast(rs.getString("cast"));
                teach.setReligion(rs.getString("religion"));
                teach.setOrderNo(rs.getInt("orderNo"));
                teach.setPersonalNo(rs.getInt("personalNo"));
                teach.setSpouceName(rs.getString("SpouseName"));
                teach.setSpouceCNIC(rs.getString("SpouseCNIC"));
                teach.setBPS(rs.getString("BPS"));
                teach.setDOB(rs.getDate("DOB"));
                teach.setDOJ(rs.getDate("DOJ"));
                teach.setDOR(rs.getDate("DOR"));
                teach.setEmailAddress(rs.getString("emailAddress"));
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
    
    public teacher getTeacherByName(String alpha){
        Database_Connection database_Connection = new Database_Connection(url);
        Connection con = database_Connection.db_connction();
        teacher teach=new teacher();
        try {
            PreparedStatement ps = con.prepareStatement("select * from teacher where name='"+alpha+"' and deleted=0");
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                teach.setId(rs.getInt("id"));
                teach.setName(rs.getString("name"));
                teach.setPh(rs.getString("ph"));
                teach.setCNIC(rs.getString("CNIC"));
                teach.setAddress(rs.getString("Address"));
                teach.setEducation(rs.getString("Education"));
                teach.setCreated(rs.getDate("created"));
                teach.setImage(rs.getBytes("image"));
                teach.setDeleted(rs.getBoolean("deleted"));
                teach.setCast(rs.getString("cast"));
                teach.setReligion(rs.getString("religion"));
                teach.setOrderNo(rs.getInt("orderNo"));
                teach.setPersonalNo(rs.getInt("personalNo"));
                teach.setSpouceName(rs.getString("SpouseName"));
                teach.setSpouceCNIC(rs.getString("SpouseCNIC"));
                teach.setBPS(rs.getString("BPS"));
                teach.setDOB(rs.getDate("DOB"));
                teach.setDOJ(rs.getDate("DOJ"));
                teach.setDOR(rs.getDate("DOR"));
                teach.setEmailAddress(rs.getString("emailAddress"));
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
        return teach;
    }
    
    public List<teacher> findAll(){
        Database_Connection database_Connection = new Database_Connection(url);
        Connection con = database_Connection.db_connction();
        List<teacher> teachers=new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("select * from teacher where deleted=0");
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
                teach.setCast(rs.getString("cast"));
                teach.setReligion(rs.getString("religion"));
                teach.setOrderNo(rs.getInt("orderNo"));
                teach.setPersonalNo(rs.getInt("personalNo"));
                teach.setSpouceName(rs.getString("SpouseName"));
                teach.setSpouceCNIC(rs.getString("SpouseCNIC"));
                teach.setBPS(rs.getString("BPS"));
                teach.setDOB(rs.getDate("DOB"));
                teach.setDOJ(rs.getDate("DOJ"));
                teach.setDOR(rs.getDate("DOR"));
                teach.setEmailAddress(rs.getString("emailAddress"));
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
            PreparedStatement ps=con.prepareStatement("insert into teacher (id, name, ph, CNIC, address, education, created, image, deleted, cast, religion, spouseName, spouseCNIC, DOB, DOJ, DOR, emailAddress, personalNo, orderNo, BPS) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, teacher.getId());
            ps.setString(2, teacher.getName());
            ps.setString(3, teacher.getPh());
            ps.setString(4, teacher.getCNIC());
            ps.setString(5, teacher.getAddress());
            ps.setString(6, teacher.getEducation());
            ps.setDate(7, Date.valueOf(sdf.format(teacher.getCreated())));
            ps.setBytes(8, teacher.getImage());
            ps.setBoolean(9, teacher.isDeleted());
            ps.setString(10, teacher.getCast());
            ps.setString(11, teacher.getReligion());
            ps.setString(12, teacher.getSpouceName());
            ps.setString(13, teacher.getSpouceCNIC());
            ps.setDate(14, Date.valueOf(sdf.format(teacher.getDOB())));
            ps.setDate(15, Date.valueOf(sdf.format(teacher.getDOJ())));
            ps.setDate(16, Date.valueOf(sdf.format(teacher.getDOR())));
            ps.setString(17, teacher.getEmailAddress());
            ps.setInt(18, teacher.getPersonalNo());
            ps.setInt(19, teacher.getOrderNo());
            ps.setString(20, teacher.getBPS());
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
            PreparedStatement ps=con.prepareStatement("update teacher set deleted=1 where id = ?");
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
            PreparedStatement ps=con.prepareStatement("update teacher set name=?, ph=?, CNIC=?, address=?, education=?, created=?, image=?, cast=?, religion=?, spouseName=?, spouseCNIC=?, DOB=?, DOJ=?, DOR=?, emailAddress=?, personalNo=?, orderNo=?, BPS=? where id=? and deleted=0");
            ps.setString(1, teacher.getName());
            ps.setString(2, teacher.getPh());
            ps.setString(3, teacher.getCNIC());
            ps.setString(4, teacher.getAddress());
            ps.setString(5, teacher.getEducation());
            ps.setDate(6, Date.valueOf(sdf.format(teacher.getCreated())));
            ps.setBytes(7, teacher.getImage());
            ps.setString(8, teacher.getCast());
            ps.setString(9, teacher.getReligion());
            ps.setString(10, teacher.getSpouceName());
            ps.setString(11, teacher.getSpouceCNIC());
            ps.setDate(12, Date.valueOf(sdf.format(teacher.getDOB())));
            ps.setDate(13, Date.valueOf(sdf.format(teacher.getDOJ())));
            ps.setDate(14, Date.valueOf(sdf.format(teacher.getDOR())));
            ps.setString(15, teacher.getEmailAddress());
            ps.setInt(16, teacher.getPersonalNo());
            ps.setInt(17, teacher.getOrderNo());
            ps.setString(18, teacher.getBPS());
            ps.setInt(19, teacher.getId());
            ps.executeUpdate();
            System.out.println("Teacher Updated successfully...");
        } catch (SQLException ex) {
            Logger.getLogger(teacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public int getMaxId(){
        Database_Connection database_Connection = new Database_Connection(url);
        Connection con = database_Connection.db_connction();
        try {
            PreparedStatement ps=con.prepareStatement("Select max(id)+1 as id from teacher");
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                return rs.getInt("id");
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
        return 1;
    }
}
