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
public class SecurityUtils {
    public String encryptString(String str) {
        char c[] =str.toCharArray();
        String str1 = "";
        int i=str.length();
       for(char c1 : c){
           c1 = (char) (c1 + i);
           str1 += c1;
           i++;
       }
       return str1;
    }
    
    public String decryptString(String str) {
        char c[] =str.toCharArray();
        String str1 = "";
        int i=str.length();
       for(char c1 : c){
           c1 = (char) (c1 - i);
           str1 += c1;
           i++;
       }
       return str1;
    }
}
