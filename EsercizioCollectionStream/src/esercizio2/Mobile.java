/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

import esercizio1.Articolo;

/**
 *
 * @author alfonso
 */
public class Mobile implements Articolo {

    private final String nome;
    private final double prezzo;
    private final int h,w,p;

    public Mobile(String nome, double prezzo, int h, int w, int p) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.h = h;
        this.w = w;
        this.p = p;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }

    public int getP() {
        return p;
    }

    @Override
    public String toString() {
        return "Mobile{" + "nome=" + nome + ", prezzo=" + prezzo + ", h=" + h + ", w=" + w + ", p=" + p + '}';
    }
    
    

}
