/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tss
 */
public class Ex1b {
    public static void main(String[] args) throws IOException {
        
        Path srcPath = FileSystems.getDefault().getPath("Anagrafica.txt");
        
        Path destPath = FileSystems.getDefault().getPath("Anagrafica-Numerata.txt");
        
        List<String> righe = Files.readAllLines(srcPath);
        
        
        Files.deleteIfExists(destPath);
        Files.writeString(destPath, "", StandardOpenOption.CREATE_NEW);
        int count = 1;
        for (String riga : righe) {
            Files.writeString(destPath, count++ + " " +  riga + "\n", StandardOpenOption.APPEND);
        }
        

    }
}
