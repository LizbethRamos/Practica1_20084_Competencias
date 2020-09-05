
package practica1_20084_competencias;

import javax.swing.JTextArea;

public class Hilo2 extends Thread{
    private JTextArea area;
    
    public Hilo2(JTextArea area2){
        this.area = area2;
    }
    @Override
    public void run(){
        int i = 0;
        while(true){
            area.append(i + "\n");
            i++;
        }
        
    }
}