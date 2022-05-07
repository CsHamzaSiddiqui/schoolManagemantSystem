/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import DAOs.studentDAO;
import entities.student;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class popups {
    studentDAO stdDao=new studentDAO();
    public void setStudentNamePopup(String input, JList jList1, JPanel panel)
    {
        if(input.isEmpty()){
            panel.setVisible(false);
        }else{
            List<student> students=stdDao.getNameByAlpha(input);
            if(!students.isEmpty()){
                panel.setVisible(true);
            }
            jList1.removeAll();
            DefaultListModel dlm=new DefaultListModel();
            for(student std:students){
                dlm.addElement(std.getName());
            }
            jList1.setModel(dlm);
        }
    }
    
}
