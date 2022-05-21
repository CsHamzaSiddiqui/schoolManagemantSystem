/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.lang.reflect.Field;
import java.util.Map;

/**
 *
 * @author hp
 */
public class SystemUtil {
    public String getEnvironmentVariable(String name){
        String value = System.getenv(name);
        if(value.isEmpty()){
            return null;
        }
        return  value;
    }
    
    public static void updateOrAddEnviromentVariable(String name, String val) throws ReflectiveOperationException {
        Map<String, String> env = System.getenv();
        Field field = env.getClass().getDeclaredField("m");
        field.setAccessible(true);
        ((Map<String, String>) field.get(env)).put(name, val);
    }
}
