/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class BrowsingUtil {
    public void brows(JLabel img, JTextField path)
    {
        String filename="";
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File file=chooser.getSelectedFile();
        filename=file.getAbsolutePath();
        ImageIcon icon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH));
        img.setIcon(icon);
        path.setText(filename);
    }
    
    public static String browseFile()
    {
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File file=chooser.getSelectedFile();
        String filename=file.getAbsolutePath();
        return filename;
    }
    
    public static String browseFolder()
    {
        JFileChooser chooser=new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.showOpenDialog(null);
        File file=chooser.getSelectedFile();
        String filename=file.getAbsolutePath();
        return filename;
    }
}
