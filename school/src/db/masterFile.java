/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static school.Login.url;
import utils.getBasicPath;


/**
 *
 * @author hp
 */
public class masterFile {
    Database_Connection databaseConnection = new Database_Connection(url);
    List<String> gettingMigrations(){
        Connection con = databaseConnection.db_connction();
        List<String> discription=new ArrayList<>();
        try{
            PreparedStatement ps=con.prepareStatement("Select * from changeLogs");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                discription.add(rs.getString("discription"));
            }         
        }catch(Exception ex){
            System.out.println("Getting Migrations Exception : "+ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(masterFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return discription;
    }
    
    public void runMigrations(){
        List<String> migrationFiles = new ArrayList<>();
        migrationFiles.add("createStudent");
        migrationFiles.add("createTeacher");
        List<String> dbMigrations = gettingMigrations();
        for(String migrationFile : migrationFiles){
            if(!dbMigrations.contains(migrationFile)){
                Connection con = databaseConnection.db_connction();
                try {
                    String s = new String();
                    StringBuffer sb = new StringBuffer();
                    FileReader fr = new FileReader(new File(getBasicPath.currentPath()+"/db/"+migrationFile+".sql"));
                    // be sure to not have line starting with “–” or “/*” or any other non aplhabetical character
                    BufferedReader br = new BufferedReader(fr);
                    while((s = br.readLine()) != null)
                    {
                        sb.append(s);
                    }
                    br.close();
                    String migration = sb.toString();
                    System.out.println("Running "+migrationFile+".sql : BD Query : "+migration);
                    PreparedStatement ps=con.prepareStatement(migration);
                    ps.executeUpdate();
                    ps.close();
                    System.out.println(migrationFile+".sql executed.");
                    ps = con.prepareStatement("insert into changeLogs (discription, created) values (? ,?) ");
                    ps.setString(1, migrationFile);
                    ps.setDate(2, java.sql.Date.valueOf(LocalDate.now()));
                    ps.executeUpdate();
                    
                    
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(masterFile.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(masterFile.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(masterFile.class.getName()).log(Level.SEVERE, null, ex);
                }finally{
                    try {
                        con.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(masterFile.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
}
