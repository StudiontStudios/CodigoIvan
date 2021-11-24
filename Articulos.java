/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploLibro;

import java.util.Set;

/**
 *
 * @author Vespertino
 */
public class Articulos {
    private int codarti;
    private String denom;
    private int stock;
    private float pvp;
    private Set<Ventas> Compras;

    public Articulos() {
    }

    public int getCodarti() {
        return codarti;
    }

    public void setCodarti(int codarti) {
        this.codarti = codarti;
    }

    public String getDenom() {
        return denom;
    }

    public void setDenom(String denom) {
        this.denom = denom;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPvp() {
        return pvp;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }

    public Set<Ventas> getCompras() {
        return Compras;
    }

    public void setCompras(Set<Ventas> Compras) {
        this.Compras = Compras;
    }
    
    
}
