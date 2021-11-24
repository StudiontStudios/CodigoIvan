/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploLibro;

/**
 *
 * @author Vespertino
 */
public class Ventas {
    private int codventa;
    private Clientes numcli;
    private int univen;
    private String fecha;

    public Ventas() {
    }

    public int getCodventa() {
        return codventa;
    }

    public void setCodventa(int codventa) {
        this.codventa = codventa;
    }

    public Clientes getNumcli() {
        return numcli;
    }

    public void setNumcli(Clientes numcli) {
        this.numcli = numcli;
    }

    public int getUniven() {
        return univen;
    }

    public void setUniven(int univen) {
        this.univen = univen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
