/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoknn;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ICO
 */
public class AlgoritmoKnn {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);



    static int clases,elementos,k;
    static ArrayList<Vecino> puntos=new ArrayList(); 
    static int x,y;

    
    
    
    AlgoritmoKnn(int C, int N, int K, int X, int Y) {
        clases=C;
        elementos=N;
        k=K;
        x=X;
        y=Y;
    }
    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        AlgoritmoKnn.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        AlgoritmoKnn.y = y;
    }

    
    public static int getClases() {
        return clases;
    }

    public static void setClases(int clases) {
        AlgoritmoKnn.clases = clases;
    }

    public static int getElementos() {
        return elementos;
    }

    public static void setElementos(int elementos) {
        AlgoritmoKnn.elementos = elementos;
    }

    public static int getK() {
        return k;
    }

    public static void setK(int k) {
        AlgoritmoKnn.k = k;
    }

    public static ArrayList<Vecino> getPuntos() {
        return puntos;
    }

    public static void setPuntos(ArrayList<Vecino> puntos) {
        AlgoritmoKnn.puntos = puntos;
    }

    public static ArrayList<Float> getDistancias() {
        return distancias;
    }

    public static void setDistancias(ArrayList<Float> distancias) {
        AlgoritmoKnn.distancias = distancias;
    }
    static ArrayList<Float> distancias=new ArrayList();
    public static void main(String[] args) {
        // TODO code application logic here
        Ventana v1=new Ventana();
        v1.setVisible(true);
        /*
        Random ran = new Random();
        int aux,clasenueva;
        ArrayList<Integer> indices;
        ArrayList<Vecino> kcercano=new ArrayList<>();
        */
        /*
        System.out.println("Ingrese el numero de clases");
        clases=leer.nextInt();
        System.out.println("Ingrese el numero de elementos");
        elementos=leer.nextInt();
        System.out.println("Ingrese el numero de vecinos a identificar");
        k=leer.nextInt();
        */
        /*
        System.out.println(clases);
        System.out.println(elementos);
        System.out.println(k);
        if(clases<=5&&elementos<=200&&k<=elementos){
            for(int i=1;i<=elementos;i++){
                aux=(int)(Math.random()*clases+1);
                switch(aux){
                    case 1:
                        x=-40+ran.nextInt(40-(-40)+1);
                        y=-40+ran.nextInt(40-(-40)+1);
                        puntos.add(new Vecino(x,y,aux));
                        break;
                    case 2:
                        x=-100+ran.nextInt(20-(-100)+1);
                        y=-20+ran.nextInt(100-(-20)+1);
                        puntos.add(new Vecino(x,y,aux));
                        break;
                    case 3:
                        x=-20+ran.nextInt(100-(-20)+1);
                        y=-20+ran.nextInt(100-(-20)+1);
                        puntos.add(new Vecino(x,y,aux));
                        break;
                    case 4:
                        x=-100+ran.nextInt(20-(-100)+1);
                        y=-100+ran.nextInt(20-(-100)+1);
                        puntos.add(new Vecino(x,y,aux));
                        break;
                    case 5:
                        x=-20+ran.nextInt(100-(-20)+1);
                        y=-100+ran.nextInt(20-(-100)+1);
                        puntos.add(new Vecino(x,y,aux));
                        break;
                }
            }
        }else{
            System.out.println("Error en los datos");
        }    
        */
        /*
        for (int i =0; i<puntos.size(); i++){
            System.out.print(i+1+"  ");
            System.out.println(puntos.get(i));
        }*/
        /*
        System.out.println("Ingrese el valor de x del punto a evaluar");
        x=leer.nextInt();
        System.out.println("Ingrese el valor de y del punto a evaluar");
        y=leer.nextInt();
        */
        /*
        for (int i =0; i<puntos.size(); i++){
            distancias.add(Calc_distancia(x,y,puntos.get(i).getX(),puntos.get(i).getY()));
        }
        indices=ordenaindices(distancias);
        clasenueva=asignaclase(indices,k,kcercano);
        System.out.print("Los "+ k +" vecinos más cercanos a el punto X= "+x+ " Y=" + y+" Son:");
        for (int i =0; i<kcercano.size(); i++){            
            System.out.println(kcercano.get(i).toString());
        }
        System.out.print("por lo tanto se asigna el punto a la clase "+ clasenueva);
        puntos.add(new Vecino(x,y,clasenueva)); 
        */
        //cartesiano v2=new cartesiano();
        //v2.setVisible(true);
    
}//fin main
    
    ////////////metodos//////////////
    
        public static float Calc_distancia(int x1,int x2,int y1,int y2){
            float dist=(float) (Math.sqrt((Math.pow(x1-x2,2))+(Math.pow(y1-y2,2))));
            return dist;
        }
        
        public static ArrayList<Integer> ordenaindices(ArrayList<Float> dist){
            ArrayList<Integer> indices=new ArrayList();
            for(int i=0;i<=dist.size();i++){
                indices.add(i);
            }    
            int auxiliar;
            
            for(int i = 1; i < dist.size(); i++)
            {
                for(int j = 0;j < dist.size()-i;j++)
                {
                    if(dist.get(indices.get(j)) > dist.get(indices.get(j+1)))
                    {
                        auxiliar = indices.get(j);
                        indices.set(j,indices.get(j+1));
                        indices.set(j+1,auxiliar);
                    }   
                }
            }  
            /* 
            for (int i =0; i<dist.size(); i++){
            
            System.out.println(dis.get(indices.get(i)));
            }*/
            return indices;
        }
        
        public static int asignaclase(ArrayList<Integer> indices,int k,ArrayList<Vecino> Kcercano){
            int aux,clase=0; 
            float cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;
            ArrayList<Float> contador=new ArrayList();
            ArrayList<Integer> ind=new ArrayList();
            for(int i=0;i<=k;i++){
                aux=puntos.get(indices.get(i)).getClase();
                Kcercano.add(puntos.get(indices.get(i)));
                switch(aux){
                        case 1:
                        cont1++;
                        break;
                    case 2:
                        cont2++;
                        break;
                    case 3:
                        cont3++;
                        break;
                    case 4:
                        cont4++;
                        break;
                    case 5:
                        cont5++;
                        break;
                }
            }
            contador.add(cont1);
            contador.add(cont2);
            contador.add(cont3);
            contador.add(cont4);
            contador.add(cont5);
            
            ind=ordenaindices(contador);
            if(contador.get(ind.get(contador.size()-1))!=contador.get(ind.get(contador.size()-2))){
                clase=(ind.get(contador.size()-1))+1;
            }else{
                clase=(int)(Math.random()*clases+1);
            }
            /* 
            for (int i =0; i<contador.size(); i++){
            
                System.out.println(contador.get(ind.get(i))+", "+ind.get(i));
            }*/
            return clase;
        }

    

     
}
    

