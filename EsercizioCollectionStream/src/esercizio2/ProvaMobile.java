/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

import esercizio1.Catalogo;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author alfonso
 */
public class ProvaMobile {
    
    public static <T extends Mobile> List<T> scegliMobile(Catalogo<T> catalogo, double prezzo, int h, int w, int p){
        return catalogo.getArticoliSottoPrezzo(prezzo)
                .stream()
                .filter(v -> v.getH() < h && v.getW() < w && v.getP() < p)
                .collect(Collectors.toList());
    }
}
