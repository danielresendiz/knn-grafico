/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoknn;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Daniel
 */
public class Plano extends JPanel{

    @Override
    public void paint(Graphics g) {
        ArrayList<Vecino> p=new ArrayList();
        p=AlgoritmoKnn.getPuntos();
        int aux,x,y;
        for (int i =0; i<p.size(); i++){            
            aux=p.get(i).getClase();
            x=((p.get(i).getX())*3)+300;
            y=Math.abs(((p.get(i).getY())*3)-300);
            switch(aux){
                    case 1:
                        g.setColor(Color.GREEN);
                        g.fillOval(x,y,5,5);
                        break;
                    case 2:
                        g.setColor(Color.RED);
                        g.fillRect(x,y,5,5);
                        break;
                    case 3:
                        g.setColor(Color.ORANGE);
                        g.fillRect(x,y,5,5);             
                        break;
                    case 4:
                        g.setColor(Color.BLACK);
                        g.fillOval(x,y,5,5);
                        break;
                    case 5:
                        g.setColor(Color.darkGray);
                        g.fillOval(x,y,5,5);
                        break;
                }
        }
        System.out.println(p.get(p.size()-1).getX());
        System.out.println(p.get(p.size()-1).getY());
        x=((p.get(p.size()-1).getX())*3)+300;
        y=Math.abs(((p.get(p.size()-1).getY())*3)-300);
        g.setColor(Color.MAGENTA);
        g.fillRect(x,y,7,7);
        g.setColor(Color.blue);
        g.drawLine(this.getWidth()/2,0, this.getWidth()/2,this.getHeight());
        g.drawLine(0,this.getHeight()/2, this.getWidth(),this.getHeight()/2);        
    }            
}