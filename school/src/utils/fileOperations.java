/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import entities.fileUpdater;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class fileOperations {

    public void updateFile(String fileName, List<fileUpdater> fileUpdaters) {
        Path path = Paths.get(fileName);
        List<String> lines;
        try {
            lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            List<String> newLines = new ArrayList<>();
            for(String line:lines){
                boolean found = false;
                for(fileUpdater updater: fileUpdaters){
                    if(line.startsWith(updater.getCurrentString()) && !found){
                        newLines.add(updater.getUpdatedString());
                        found = true;
                        break;
                    }
                }
                if(!found){
                    newLines.add(line);
                }
            }
            Files.write(path, newLines, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            Logger.getLogger(fileOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
