/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author alfonso
 */
public class App {
    public static void main(String[] args) {
            
        Integer[] numeri = {1,5,9,4,6};
        
        minoriDi(numeri,5).stream().forEach(System.out::println);
    }
    
    public static <T extends Number> List<T> minoriDi(T[] array, T valore){
        return Arrays.asList(array).stream()
                .filter(v -> v.doubleValue() < valore.doubleValue())
                .collect(Collectors.toList());
    }
}
