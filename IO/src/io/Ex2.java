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
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author tss
 */
public class Ex2 {

    public static void main(String[] args) {
        Path srcPath = FileSystems.getDefault().getPath("Anagrafica.txt");
        Path destPath = FileSystems.getDefault().getPath("Anagrafica-Maiuscolo.txt");
        try (Stream<String> s = Files.lines(srcPath)) {

            Files.write(destPath,
                    s.map(v -> v.toUpperCase())
                            .collect(Collectors.toList()));

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
