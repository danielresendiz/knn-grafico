/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoknn;

/**
 *
 * @author ICO
 */
public class Vecino {

    private int x;
    private int y;
    private int clase;

    public Vecino(int x, int y, int clase) {
        this.x = x;
        this.y = y;
        this.clase = clase;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }
    
        
    public String toString(){
        String texto;
        texto = "Clase: "+getClase()+" X: "+getX()+" Y: "+getY();
        return texto;
    }
}
