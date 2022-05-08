/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author hp
 */
public class fileUpdater {
    String currentString;
    String updatedString;

    @Override
    public String toString() {
        return "fileUpdater{" + "currentString=" + currentString + ", updatedString=" + updatedString + '}';
    }

    public String getCurrentString() {
        return currentString;
    }

    public void setCurrentString(String currentString) {
        this.currentString = currentString;
    }

    public String getUpdatedString() {
        return updatedString;
    }

    public void setUpdatedString(String updatedString) {
        this.updatedString = updatedString;
    }
    
}
