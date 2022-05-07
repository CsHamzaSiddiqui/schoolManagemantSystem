/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class imageConversion {
    public byte[] fileToByte(String name)
    {
        byte[]  imagebyte = null;

        //File image=new File(name.replaceAll("//", "\\"));
        try {
            FileInputStream fis=new FileInputStream(name);
            ByteArrayOutputStream stream=new ByteArrayOutputStream();
            byte[] byt=new byte[1024];
            for(int i=0;(i=fis.read(byt))!=-1;)
            {
              stream.write(byt, 0, i);   
            }
           imagebyte=stream.toByteArray();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Image not found");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return imagebyte;
    }
}
