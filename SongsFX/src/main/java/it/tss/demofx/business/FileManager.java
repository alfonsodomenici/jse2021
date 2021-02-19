/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.demofx.business;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tss
 */
public class FileManager {

    private static final String MEDIA_FOLDER = "/home/tss/Documenti/";

    public static void copy(File file, String filename) {
        try {
            Files.copy(new FileInputStream(file), Paths.get(MEDIA_FOLDER + filename), StandardCopyOption.REPLACE_EXISTING);
        } catch (FileNotFoundException ex) {
            throw new SongsStoreException("Impossibile copiare il file: " + filename);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void delete(String filename) {
        try {
            if (filename == null || filename.isEmpty()) {
                return;
            }
            Files.deleteIfExists(Paths.get(MEDIA_FOLDER + filename));
        } catch (IOException ex) {
            throw new SongsStoreException("Impossibile eliminare il file: " + filename);
        }
    }

    public static String getFile(String filename) {
        return Paths.get(MEDIA_FOLDER + filename).toUri().toString();
    }
}
