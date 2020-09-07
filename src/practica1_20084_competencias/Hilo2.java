
package practica1_20084_competencias;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

public class Hilo2 extends Thread{
    private JTextArea area;
    private boolean pausado = false;
    private boolean corriendo = true;

    public boolean isPausado() {
        return pausado;
    }

    public void setPausado(boolean pausado) {
        this.pausado = pausado;
    }
    
    public Hilo2(JTextArea area2){
        this.area = area2;
    }
    
    @Override
    public void run(){
        try{
            int i = 0;
            while(true){
                area.append(i + "\n");
                i++;
                sleep(1000);
                synchronized(this){
                    if(pausado)
                        wait();
                    if(!corriendo)
                        join();
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }    
    }
    
    public void pausar(){
        this.pausado = true;
    }
    
    public void continuar(){
        synchronized(this){
            pausado = false;
            notifyAll();
        }
    }
    
    public void parar(){
        this.corriendo = false;
    }
}