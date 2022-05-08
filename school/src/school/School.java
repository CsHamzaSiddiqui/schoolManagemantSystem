/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
import db.masterFile;
import utils.getBasicPath;
/**
 *
 * @author Laptop Point
 */
public class School {
//    public static String url=getBasicPath.currentPath()+"/dataBases/schoolDB.db";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        masterFile master=new masterFile();
        master.runMigrations();
//        new Login().setVisible(true);
        // TODO code application logic here
    }
    
}
