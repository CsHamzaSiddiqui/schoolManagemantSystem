/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import db.Database_Connection;
import entities.searchFilter;
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
import static school.School.url;

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
            PreparedStatement ps = con.prepareStatement("select * from students where name like '"+alpha+"%' and deleted=0");
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
                std.setRollNo(rs.getString("rollNo"));
                std.setCast(rs.getString("cast"));
                std.setFatherName(rs.getString("fatherName"));
                std.setFatherCNIC(rs.getString("fatherCNIC"));
                std.setFatherPh(rs.getString("fatherPh"));
                std.setReligion(rs.getString("religion"));
                std.setMotherName(rs.getString("motherName"));
                std.setMotherCNIC(rs.getString("motherCNIC"));
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
    
    public student getStudentByName(String name){
        Database_Connection database_Connection = new Database_Connection(url);
        Connection con = database_Connection.db_connction();
        student std=new student();
        try {
            PreparedStatement ps = con.prepareStatement("select * from students where name = '"+name+"' and deleted=0");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                std.setId(rs.getInt("id"));
                std.setName(rs.getString("name"));
                std.setClassName(rs.getString("className"));
                std.setCNIC(rs.getString("CNIC"));
                std.setAddress(rs.getString("Address"));
                std.setAdmissionDate(rs.getDate("admissionDate"));
                std.setImage(rs.getBytes("image"));
                std.setDeleted(rs.getBoolean("deleted"));
                std.setRollNo(rs.getString("rollNo"));
                std.setCast(rs.getString("cast"));
                std.setFatherName(rs.getString("fatherName"));
                std.setFatherCNIC(rs.getString("fatherCNIC"));
                std.setFatherPh(rs.getString("fatherPh"));
                std.setReligion(rs.getString("religion"));
                std.setMotherName(rs.getString("motherName"));
                std.setMotherCNIC(rs.getString("motherCNIC"));
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
        return std;
    }
    
    public List<student> findAll(){
        Database_Connection database_Connection = new Database_Connection(url);
        Connection con = database_Connection.db_connction();
        List<student> students=new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("select * from students where deleted=0");
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
                std.setRollNo(rs.getString("rollNo"));
                std.setCast(rs.getString("cast"));
                std.setFatherName(rs.getString("fatherName"));
                std.setFatherCNIC(rs.getString("fatherCNIC"));
                std.setFatherPh(rs.getString("fatherPh"));
                std.setReligion(rs.getString("religion"));
                std.setMotherName(rs.getString("motherName"));
                std.setMotherCNIC(rs.getString("motherCNIC"));
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
            PreparedStatement ps=con.prepareStatement("insert into students (id, name, className, CNIC, address, admissionDate, image, deleted, rollNo, cast, religion, fatherName, fatherCNIC, fatherPh, motherName, motherCNIC) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getClassName());
            ps.setString(4, student.getCNIC());
            ps.setString(5, student.getAddress());
            ps.setDate(6, Date.valueOf(sdf.format(student.getAdmissionDate())));
            ps.setBytes(7, student.getImage());
            ps.setBoolean(8, student.isDeleted());
            ps.setString(9, student.getRollNo());
            ps.setString(10, student.getCast());
            ps.setString(11, student.getReligion());
            ps.setString(12, student.getFatherName());
            ps.setString(13, student.getFatherCNIC());
            ps.setString(14, student.getFatherPh());
            ps.setString(15, student.getMotherName());
            ps.setString(16, student.getMotherCNIC());
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
            PreparedStatement ps=con.prepareStatement("update students set deleted=1 where id = ?");
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
            PreparedStatement ps=con.prepareStatement("update students set name=?, className=?, CNIC=?, address=?, admissionDate=?, image=?, rollNo=?, cast=?, religion=?, fatherName=?, fatherCNIC=?, fatherPh=?, motherName=?, motherCNIC=? where id=? and deleted=0");
            ps.setString(1, student.getName());
            ps.setString(2, student.getClassName());
            ps.setString(3, student.getCNIC());
            ps.setString(4, student.getAddress());
            ps.setDate(5, Date.valueOf(sdf.format(student.getAdmissionDate())));
            ps.setBytes(6, student.getImage());
            ps.setString(7, student.getRollNo());
            ps.setString(8, student.getCast());
            ps.setString(9, student.getReligion());
            ps.setString(10, student.getFatherName());
            ps.setString(11, student.getFatherCNIC());
            ps.setString(12, student.getFatherPh());
            ps.setString(13, student.getMotherName());
            ps.setString(14, student.getMotherCNIC());
            ps.setInt(15, student.getId());
            ps.executeUpdate();
            System.out.println("Student updated successfully ...");
        } catch (SQLException ex) {
            Logger.getLogger(studentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getMaxId(){
        Database_Connection database_Connection = new Database_Connection(url);
        Connection con = database_Connection.db_connction();
        try {
            PreparedStatement ps=con.prepareStatement("Select max(id)+1 as id from students");
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                return rs.getInt("id");
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
        return 1;
    }
    
    public List<student> getStudentsByFilters(List<searchFilter> filters){
        Database_Connection database_Connection = new Database_Connection(url);
        Connection con = database_Connection.db_connction();
        List<student> students = new ArrayList<>();
        String query = "select * from students where deleted=0 ";
        int i=0;
        for(searchFilter filter: filters){
            i++;
            if(i==filters.size()){
                query = query + " and "+filter.getFieldName()+" like '"+filter.getFieldValue()+"%'";
            }else{
                query = query + " and "+filter.getFieldName()+" = '"+filter.getFieldValue()+"'";
            }
        }
        System.out.println("Filter query : "+query);
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
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
                std.setRollNo(rs.getString("rollNo"));
                std.setCast(rs.getString("cast"));
                std.setFatherName(rs.getString("fatherName"));
                std.setFatherCNIC(rs.getString("fatherCNIC"));
                std.setFatherPh(rs.getString("fatherPh"));
                std.setReligion(rs.getString("religion"));
                std.setMotherName(rs.getString("motherName"));
                std.setMotherCNIC(rs.getString("motherCNIC"));
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
}
