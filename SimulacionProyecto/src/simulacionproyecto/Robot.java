/* Algoritmos y Estructuras de Datos.
 * Nombres: Didier Salazar, 15487. Raul de Leon, Michelle Morales, Joselin Ortiz.
 * Proyecto
 * 
 */

import java.util.*;

public class Robot {
    private Vector recorrido;
    private Vector recorridoInverso;
    private Sensor datosArea;
    private Vector cruces;
    private int estado;
    private String movimiento;
    private boolean inicial;
    
    public Robot(Sensor datosArea){
        this.datosArea=datosArea;
        recorrido=new Vector(1,1);
        recorridoInverso=new Vector(1,1);
        cruces=new Vector(1,1);
        
    }
    public boolean isInicial(){
        return inicial;
    }
    public String[][] validacionMovimiento(Sensor datosArea,String[][] laberinto){
        String[][] go = null;
        Random rnd = new Random();
        if(inicial==true){
        if(datosArea.getLeft()==0&&datosArea.getRight()==0&&datosArea.getForward()==0&&datosArea.getBackward()==0){
            int alea=rnd.nextInt(4);
            if(alea==0){
              go=avanzarAdelante(laberinto); 
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=0;
              cruce[2]=0;
              cruce[3]=0;
              cruces.addElement(cruce);
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=1;
            }
            else if(alea==1){
              go=giraDerechaAvanza(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=0;
              cruce[1]=1;
              cruce[2]=0;
              cruce[3]=0;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=2;
            }
            else if(alea==2){
              go=giraIzquierdaAvanza(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=0;
              cruce[1]=0;
              cruce[2]=1;
              cruce[3]=0;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=3;
            }
            else if(alea==3){
              go=avanzarHaciaAtras(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=0;
              cruce[1]=0;
              cruce[2]=0;
              cruce[3]=1;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=4;
            }
        }
        else if(datosArea.getLeft()==1&&datosArea.getRight()==0&&datosArea.getForward()==1&&datosArea.getBackward()==1){
            inicial=false;
            go=giraDerechaAvanza(laberinto);
            estado=2;
        }
        }
        if(datosArea.getLeft()==0&&datosArea.getRight()==0&&datosArea.getForward()==0&&estado==1){
            int alea2=rnd.nextInt(3);
            if(alea2==0){
              go=avanzarAdelante(laberinto); 
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=0;
              cruce[2]=0;
              cruce[3]=1;
              cruces.addElement(cruce);
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=1;
            }
            else if(alea2==1){
              go=giraDerechaAvanza(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=0;
              cruce[1]=1;
              cruce[2]=0;
              cruce[3]=1;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=2;
            }
            else if(alea2==2){
              go=giraIzquierdaAvanza(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=0;
              cruce[1]=0;
              cruce[2]=1;
              cruce[3]=1;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=3;
            }
            
        }
        if(datosArea.getBackward()==0&&datosArea.getLeft()==0&&datosArea.getForward()==0&&estado==3){
            int alea2=rnd.nextInt(3);
            if(alea2==0){
              go=avanzarAdelante(laberinto); 
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=1;
              cruce[2]=0;
              cruce[3]=0;
              cruces.addElement(cruce);
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=1;
            }
            else if(alea2==1){
              go=giraIzquierdaAvanza(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=0;
              cruce[1]=1;
              cruce[2]=1;
              cruce[3]=0;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=3;
            }
            else if(alea2==2){
              go=avanzarHaciaAtras(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=0;
              cruce[1]=1;
              cruce[2]=0;
              cruce[3]=1;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=4;
            }    
        }
        if(datosArea.getBackward()==0&&datosArea.getRight()==0&&datosArea.getForward()==0&&estado==2){
            int alea2=rnd.nextInt(3);
            if(alea2==0){
              go=avanzarAdelante(laberinto); 
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=0;
              cruce[2]=1;
              cruce[3]=0;
              cruces.addElement(cruce);
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=1;
            }
            else if(alea2==1){
              go=giraDerechaAvanza(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=0;
              cruce[1]=1;
              cruce[2]=1;
              cruce[3]=0;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=2;
            }
            else if(alea2==2){
              go=avanzarHaciaAtras(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=0;
              cruce[1]=0;
              cruce[2]=1;
              cruce[3]=1;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=4;
            }
        }
        if(datosArea.getBackward()==0&&datosArea.getRight()==0&&datosArea.getBackward()==0&&estado==4){
            int alea2=rnd.nextInt(3);
            if(alea2==0){
              go=avanzarHaciaAtras(laberinto); 
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=0;
              cruce[2]=0;
              cruce[3]=1;
              cruces.addElement(cruce);
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=4;
            }
            else if(alea2==1){
              go=giraDerechaAvanza(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=1;
              cruce[2]=0;
              cruce[3]=0;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=2;
            }
            else if(alea2==2){
              go=giraIzquierdaAvanza(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=0;
              cruce[2]=1;
              cruce[3]=0;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=3;
            }
        }
        if(estado==2&&datosArea.getRight()==0&&datosArea.getForward()==0&&datosArea.getBackward()==1){
            int alea=rnd.nextInt(2);
            if(alea==0){
              go=avanzarAdelante(laberinto); 
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=0;
              cruce[2]=1;
              cruce[3]=1;
              cruces.addElement(cruce);
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=1;
            }
            else if(alea==1){
              go=giraDerechaAvanza(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=0;
              cruce[1]=1;
              cruce[2]=1;
              cruce[3]=1;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=2;
            }
        }
        if(estado==2&&datosArea.getRight()==0&&datosArea.getForward()==1&&datosArea.getBackward()==0){
            int alea=rnd.nextInt(2);
            if(alea==0){
              go=avanzarHaciaAtras(laberinto); 
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=0;
              cruce[2]=1;
              cruce[3]=1;
              cruces.addElement(cruce);
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=4;
            }
            else if(alea==1){
              go=giraDerechaAvanza(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=0;
              cruce[1]=1;
              cruce[2]=1;
              cruce[3]=1;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=2;
            }
        }
        if(estado==4&&datosArea.getRight()==0&&datosArea.getForward()==0&&datosArea.getLeft()==1){
            int alea=rnd.nextInt(2);
            if(alea==0){
              go=avanzarHaciaAtras(laberinto); 
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=0;
              cruce[2]=1;
              cruce[3]=1;
              cruces.addElement(cruce);
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=4;
            }
            else if(alea==1){
              go=giraDerechaAvanza(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=1;
              cruce[2]=1;
              cruce[3]=0;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=2;
            }
        }
        if(estado==3&&datosArea.getLeft()==0&&datosArea.getForward()==1&&datosArea.getBackward()==0){
            int alea=rnd.nextInt(2);
            if(alea==0){
              go=avanzarHaciaAtras(laberinto); 
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=1;
              cruce[2]=0;
              cruce[3]=1;
              cruces.addElement(cruce);
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=4;
            }
            else if(alea==1){
              go=giraIzquierdaAvanza(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=1;
              cruce[2]=1;
              cruce[3]=0;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=3;
            }
        }
        if(estado==1&&datosArea.getRight()==0&&datosArea.getForward()==0&&datosArea.getLeft()==1){
            int alea=rnd.nextInt(2);
            if(alea==0){
              go=avanzarAdelante(laberinto); 
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=0;
              cruce[2]=1;
              cruce[3]=1;
              cruces.addElement(cruce);
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=1;
            }
            else if(alea==1){
              go=giraDerechaAvanza(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=0;
              cruce[1]=1;
              cruce[2]=1;
              cruce[3]=1;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=2;
            }
        }
        if(datosArea.getLeft()==0&&estado==3&&datosArea.getForward()==0&&datosArea.getBackward()==1){
            int alea=rnd.nextInt(2);
            if(alea==0){
              go=avanzarAdelante(laberinto); 
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=1;
              cruce[2]=0;
              cruce[3]=1;
              cruces.addElement(cruce);
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=1;
            }
            else if(alea==1){
              go=giraIzquierdaAvanza(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=0;
              cruce[1]=1;
              cruce[2]=1;
              cruce[3]=1;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=3;
            }
        }
        if(datosArea.getLeft()==0&&estado==1&&datosArea.getForward()==0&&datosArea.getRight()==1){
            int alea=rnd.nextInt(2);
            if(alea==0){
              go=avanzarAdelante(laberinto); 
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=1;
              cruce[2]=0;
              cruce[3]=1;
              cruces.addElement(cruce);
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=1;
            }
            else if(alea==1){
              go=giraIzquierdaAvanza(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=0;
              cruce[1]=1;
              cruce[2]=1;
              cruce[3]=1;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=3;
            }
        }
        if(datosArea.getLeft()==0&&datosArea.getRight()==0&&estado==1&&datosArea.getForward()==1){
            int alea=rnd.nextInt(2);
            if(alea==0){
              go=giraIzquierdaAvanza(laberinto); 
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=0;
              cruce[2]=1;
              cruce[3]=1;
              cruces.addElement(cruce);
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=3;
            }
            else if(alea==1){
              go=giraDerechaAvanza(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=1;
              cruce[2]=0;
              cruce[3]=1;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=2;
            }
        }
        if(datosArea.getLeft()==0&&datosArea.getRight()==0&&estado==4&&datosArea.getBackward()==1){
            int alea=rnd.nextInt(2);
            if(alea==0){
              go=giraIzquierdaAvanza(laberinto); 
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=0;
              cruce[2]=1;
              cruce[3]=1;
              cruces.addElement(cruce);
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=3;
            }
            else if(alea==1){
              go=giraDerechaAvanza(laberinto);
              inicial=false;
              int[] cruce=new int[4];
              cruce[0]=1;
              cruce[1]=1;
              cruce[2]=0;
              cruce[3]=1;
              cruces.addElement(cruce);  
              recorrido.addElement(0);
              recorridoInverso.addElement(0);
              estado=2;
            }
        }
        if(datosArea.getLeft()==1&&datosArea.getRight()==1&&datosArea.getForward()==0&&datosArea.getBackward()==0){
            if(estado==1){
            go=avanzarAdelante(laberinto); 
              inicial=false;
            }
            else if(estado==4){
            go=avanzarHaciaAtras(laberinto); 
              inicial=false;
            }
        }
        if(datosArea.getLeft()==1&&datosArea.getRight()==0&&datosArea.getForward()==1&&datosArea.getBackward()==0){
            if(estado==3){
            go=avanzarHaciaAtras(laberinto); 
              inicial=false;
              estado=4;
            }
            else if(estado==1){
            go=giraDerechaAvanza(laberinto); 
              inicial=false;
              estado=2;
            }
        }
        if(datosArea.getLeft()==0&&datosArea.getRight()==1&&datosArea.getForward()==1&&datosArea.getBackward()==0){
            if(estado==1){
            go=giraIzquierdaAvanza(laberinto); 
            inicial=false;
            estado=3;
            }
            else if(estado==2){
              go=avanzarHaciaAtras(laberinto); 
              inicial=false;
              estado=4;  
            }
        }
        if(datosArea.getLeft()==1&&datosArea.getRight()==0&&datosArea.getForward()==0&&datosArea.getBackward()==1){
            if(estado==3){
            go=avanzarAdelante(laberinto); 
            inicial=false;
            estado=1;
            }
            else if(estado==4){
              go=giraDerechaAvanza(laberinto); 
              inicial=false;
              estado=2;  
            }
        }
        if(datosArea.getLeft()==0&&datosArea.getRight()==1&&datosArea.getForward()==0&&datosArea.getBackward()==1){
            if(estado==2){
            go=avanzarAdelante(laberinto); 
            inicial=false;
            estado=1;
            }
            else if(estado==4){
              go=giraIzquierdaAvanza(laberinto); 
              inicial=false;
              estado=3;  
            }
        }
        if(datosArea.getLeft()==0&&datosArea.getRight()==0&&datosArea.getForward()==1&&datosArea.getBackward()==1){
            if(estado==3){
            go=giraIzquierdaAvanza(laberinto); 
            inicial=false;
 
            }
            else if(estado==2){
              go=giraDerechaAvanza(laberinto); 
              inicial=false;
  
            }
        }
        if(datosArea.getLeft()==1&&datosArea.getRight()==1&&datosArea.getForward()==1&&estado==1){
            go[0][0]="0";
        }
        if(datosArea.getLeft()==1&&datosArea.getRight()==1&&datosArea.getBackward()==1&&estado==4){
            go[0][0]="0";
        }
        if(datosArea.getForward()==1&&datosArea.getLeft()==1&&datosArea.getBackward()==1&&estado==3){
            go[0][0]="0";
        }
        if(datosArea.getBackward()==1&&datosArea.getRight()==1&&datosArea.getForward()==1&&estado==2){
            go[0][0]="0";
        }
        
        
        if(datosArea.getLeft()==5&&datosArea.getRight()==1&&datosArea.getForward()==1&&estado==1){
            go[0][0]="3";
        }
        if(datosArea.getLeft()==1&&datosArea.getRight()==5&&datosArea.getForward()==1&&estado==1){
            go[0][0]="2";
        }
        if(datosArea.getLeft()==1&&datosArea.getRight()==1&&datosArea.getForward()==5&&estado==1){
            go[0][0]="1";
        }
        
        
        if(datosArea.getLeft()==1&&datosArea.getRight()==5&&datosArea.getBackward()==1&&estado==4){
            go[0][0]="2";
        }
        if(datosArea.getLeft()==5&&datosArea.getRight()==1&&datosArea.getBackward()==1&&estado==4){
            go[0][0]="3";
        }
        if(datosArea.getLeft()==1&&datosArea.getRight()==1&&datosArea.getBackward()==5&&estado==4){
            go[0][0]="4";
        }
        
        
        if(datosArea.getForward()==5&&datosArea.getLeft()==1&&datosArea.getBackward()==1&&estado==3){
            go[0][0]="1";
        }
        if(datosArea.getForward()==1&&datosArea.getLeft()==5&&datosArea.getBackward()==1&&estado==3){
            go[0][0]="3";
        }
        if(datosArea.getForward()==1&&datosArea.getLeft()==1&&datosArea.getBackward()==5&&estado==3){
            go[0][0]="4";
        }
        
        
        if(datosArea.getBackward()==5&&datosArea.getRight()==1&&datosArea.getForward()==1&&estado==2){
            go[0][0]="4";
        }
        if(datosArea.getBackward()==1&&datosArea.getRight()==5&&datosArea.getForward()==1&&estado==2){
            go[0][0]="2";
        }
        if(datosArea.getBackward()==1&&datosArea.getRight()==1&&datosArea.getForward()==5&&estado==2){
            go[0][0]="1";
        }
        return go;
    }
    public String[][] avanzarAdelante(String[][] laberinto){
        String[][] go;
        laberinto[datosArea.getPosicion()[0]][datosArea.getPosicion()[1]+1]="8";
        laberinto[datosArea.getPosicion()[0]][datosArea.getPosicion()[1]-1]="0";
        int[] nuevaPosicion=new int[2];
        nuevaPosicion[0]=datosArea.getPosicion()[0];
        nuevaPosicion[1]=datosArea.getPosicion()[1]+1;
        datosArea.setPosicion(nuevaPosicion);
        recorrido.addElement(1);
        recorridoInverso.addElement(4);
        go=laberinto;
        return go;
    }
    public String[][] giraDerechaAvanza(String[][] laberinto){
        String[][] go;  
        laberinto[datosArea.getPosicion()[0]+1][datosArea.getPosicion()[1]]="8";
        laberinto[datosArea.getPosicion()[0]-1][datosArea.getPosicion()[1]]="0";
        int[] nuevaPosicion=new int[2];
        nuevaPosicion[0]=datosArea.getPosicion()[0]+1;
        nuevaPosicion[1]=datosArea.getPosicion()[1];
        datosArea.setPosicion(nuevaPosicion);
        recorrido.addElement(2);
        recorridoInverso.addElement(3);
        go=laberinto;
        return go;      
    }
    public String[][] giraIzquierdaAvanza(String[][] laberinto){
        String[][] go;
        laberinto[datosArea.getPosicion()[0]-1][datosArea.getPosicion()[1]]="8";
        laberinto[datosArea.getPosicion()[0]+1][datosArea.getPosicion()[1]]="0";
        int[] nuevaPosicion=new int[2];
        nuevaPosicion[0]=datosArea.getPosicion()[0]-1;
        nuevaPosicion[1]=datosArea.getPosicion()[1];
        datosArea.setPosicion(nuevaPosicion);
        recorrido.addElement(3);
        recorridoInverso.addElement(2);
        go=laberinto;
        return go;      
    }
    public String[][] avanzarHaciaAtras(String[][] laberinto){
        String[][] go;
        laberinto[datosArea.getPosicion()[0]][datosArea.getPosicion()[1]-1]="8";
        laberinto[datosArea.getPosicion()[0]][datosArea.getPosicion()[1]+1]="0";
        int[] nuevaPosicion=new int[2];
        nuevaPosicion[0]=datosArea.getPosicion()[0];
        nuevaPosicion[1]=datosArea.getPosicion()[1]-1;
        datosArea.setPosicion(nuevaPosicion);
        recorrido.addElement(4);
        recorridoInverso.addElement(1);
        go=laberinto;
        return go; 
    }
    public String[][] ganarForward(String[][] laberinto){
        laberinto=avanzarAdelante(laberinto);
        movimiento= "Has completado el laberinto";
        return laberinto;
    }
    public String[][] ganarBackward(String[][] laberinto){
        laberinto=avanzarHaciaAtras(laberinto);
        movimiento= "Has completado el laberinto";
        return laberinto;
    }
    public String[][] ganarIzquierda(String[][] laberinto){
        laberinto=giraIzquierdaAvanza(laberinto);
        movimiento= "Has completado el laberinto";
        return laberinto;
    }
    public String[][] ganarDerecha(String[][] laberinto){
        laberinto=giraIzquierdaAvanza(laberinto);
        movimiento= "Has completado el laberinto";
        return laberinto;
    }
    public Vector retornaCamino(String[][] laberinto){
        Vector retorno=new Vector (1,1);
        boolean ceroEncontrado=false;
        for (int i = 0; i < recorridoInverso.size(); i--) {
            if((Integer)recorridoInverso.elementAt(i)!=0){
                retorno.addElement(recorrido.elementAt(i));
            }
            else{
                break;
            }
        }
        return retorno;
    }
    public Vector CruceNuevo(){
        int cont=0;
        for (int i = 0; i < cruces.size(); i--) {
            for(int j=0;j<4;j++){
                int[] nums= new int[2];
                
                    
                }
            }
        return cruces;
            
    }
    public void setRecorrido (Vector recorrido){
        this.recorrido=recorrido;
    }
    public void setRecorridoInverso (Vector recorridoInverso){
        this.recorridoInverso=recorridoInverso;
    }
    public void setDatosArea(Sensor datosArea){
        this.datosArea=datosArea;
    }
    public void setCruces(Vector cruces){
        this.cruces=cruces;
    }
    public void setEstado(int estado){
        this.estado=estado;
    }
    public void setMovimiento(String movimiento){
        this.movimiento=movimiento;
    }
    public String getMovimiento(){
        return movimiento;
    }
    public int getEstado(){
        return estado;
    }
    public Vector getRecorrido(){
        return recorrido;
    }
    public Vector getRecorridoInverso(){
        return recorridoInverso;
    }
    public Vector getCruces(){
        return cruces;
    }
    public Sensor getDatosArea(){
        return datosArea;
    }
    public String toString(){
        String cadena="";
        return cadena;
    }
    
}

