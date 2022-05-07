/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import DAOs.customDAO;
import DAOs.studentDAO;
import entities.searchFilter;
import entities.student;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class popups {
    customDAO customDao=new customDAO();
    public void setStudentNamePopup(String input, JList jList1, JPanel panel)
    {
        if(input.isEmpty()){
            panel.setVisible(false);
        }else{
            searchFilter filter=new searchFilter();
            filter.setFieldName("name");
            filter.setFieldValue(input);
            List<searchFilter> filters = new ArrayList<>();
            filters.add(filter);
            List<String> students=customDao.getNameByFilters("students", filters, "name");
            if(!students.isEmpty()){
                panel.setVisible(true);
            }
            jList1.removeAll();
            DefaultListModel dlm=new DefaultListModel();
            for(String std:students){
                dlm.addElement(std);
            }
            jList1.setModel(dlm);
        }
    }
    
}
