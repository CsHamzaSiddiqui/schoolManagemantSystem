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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static school.Login.url;

/**
 *
 * @author hp
 */
public class customDAO {
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    public List<String> getNameByFilters(String table, List<searchFilter> filters, String requiredFiled){
        Database_Connection database_Connection = new Database_Connection(url);
        Connection con = database_Connection.db_connction();
        List<String> names = new ArrayList<>();
        String query = "select "+requiredFiled+" from "+table+" where deleted=0 ";
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
                names.add(rs.getString(requiredFiled));
            }
        } catch (SQLException ex) {
            Logger.getLogger(customDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(customDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return names;
    }
}
