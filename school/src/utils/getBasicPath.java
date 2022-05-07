/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author hp
 */
public class getBasicPath {
    
    public static String currentPath(){
        String url_basic=System.getProperty("user.dir")+"\\src";
        return url_basic;
    }
    
}
