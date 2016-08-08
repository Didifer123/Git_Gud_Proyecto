/* Algoritmos y Estructuras de Datos.
 * Nombres: Didier Salazar, 15487. Raul de Leon, Michelle Morales, Joselin Ortiz.
 * Proyecto
 * 
 */

import java.util.Random;

public class Sensor {
    private int left;
    private int right;
    private int forward;
    private int backward;
    private int[] posicion;

    public Sensor(int[] posicion){
        this.posicion=posicion;
    }
    public String[][] sondeo(String[][] laberinto){
        
        if(laberinto[posicion[0]-1][posicion[1]].equals("|")||laberinto[posicion[0]-1][posicion[1]].equals("-")||laberinto[posicion[0]-1][posicion[1]].equals("1")){
           left=1;
        }
        else if (laberinto[posicion[0]-1][posicion[1]].equals("5")){
            left=5;
        }
        else if(laberinto[posicion[0]-1][posicion[1]].equals("0")){
           left=0;
        }
        else if(laberinto[posicion[0]+1][posicion[1]].equals("|")||laberinto[posicion[0]+1][posicion[1]].equals("-")||laberinto[posicion[0]+1][posicion[1]].equals("1")){
           right=1;
        }
        else if(laberinto[posicion[0]+1][posicion[1]].equals("5")){
            right=5;
        }
        else if(laberinto[posicion[0]+1][posicion[1]].equals("0")){
           right=0;
        }
        else if(laberinto[posicion[0]][posicion[1]+1].equals("|")||laberinto[posicion[0]][posicion[1]+1].equals("-")||laberinto[posicion[0]][posicion[1]+1].equals("1")){
           forward=1;
        }
        else if(laberinto[posicion[0]][posicion[1]+1].equals("5")){
            forward=5;
        }
        else if(laberinto[posicion[0]][posicion[1]+1].equals("0")){
           forward=0;
        }
        else if(laberinto[posicion[0]][posicion[1]-1].equals("|")||laberinto[posicion[0]][posicion[1]-1].equals("-")||laberinto[posicion[0]][posicion[1]-1].equals("1")){
           backward=1;
        }
        else if(laberinto[posicion[0]][posicion[1]-1].equals("5")){
            backward=5;
        }
        else if(laberinto[posicion[0]][posicion[1]-1].equals("0")){
           backward=0;
        }
        return laberinto;
    }
    public void setLeft(int left){
        this.left=left;
    }
    public void setRight(int right){
        this.right=right;
    }
    public void setForward(int forward){
        this.forward=forward;
    }
    public void setBackward(int backward){
        this.backward=backward;
    }
    public void setPosicion(int[] posicion){
        this.posicion=posicion;
    }

    public int[] getPosicion(){
        return posicion;
    }
    public int getLeft(){
        return left;
    }
    public int getRight(){
        return right;
    }
    public int getForward(){
        return forward;
    }
    public int getBackward(){
        return backward;
    }
    public String toString(){
        String cadena="";
        return cadena;
    }
}

