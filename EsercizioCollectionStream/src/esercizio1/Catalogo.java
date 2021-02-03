/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

import esercizio2.Mobile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author alfonso
 * @param <E>
 */
public class Catalogo<E extends Articolo> implements Iterable<E> {

    private final List<E> catalogo;

    public Catalogo() {
        catalogo = new ArrayList<>();
    }

    public void aggiungiArticolo(E art) {
        catalogo.add(art);
    }

    public List<E> getArticoliSottoPrezzo(double prezzo) {
        return catalogo.stream()
                .filter(v -> v.getPrezzo() < prezzo)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return catalogo.stream()
                .map(v -> v.getNome() + " - " + v.getPrezzo())
                .collect(Collectors.joining("\n"));
    }

    @Override
    public Iterator<E> iterator() {
        return new CatIterator();
    }

    private class CatIterator implements Iterator<E> {

        private int cur = -1;

        @Override
        public boolean hasNext() {
            return cur < catalogo.size() - 1;
        }

        @Override
        public E next() {
            return catalogo.get(++cur);
        }

    }

    /**
     * restituisce un nuovo catalogo con gli articoli del tipo passato come
     * parametro
     *
     * @param <E>
     * @param clazz
     * @return
     */
    public <E extends Articolo> Catalogo<E> sottocatalogo(Class<E> clazz) {
        Catalogo<E> result = new Catalogo<>();
        catalogo.stream().filter(v-> clazz.isInstance(v)).forEach(v -> result.aggiungiArticolo((clazz.cast(v))));
        /*
        for (Articolo articolo : catalogo) {
            if (clazz.isInstance(articolo)) {
                result.aggiungiArticolo((E) articolo);
            }
        }
        */
        return result;
    }
}
