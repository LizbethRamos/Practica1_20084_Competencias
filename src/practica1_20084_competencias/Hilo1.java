
package practica1_20084_competencias;

import javax.swing.JTextArea;

public class Hilo1 extends Thread{
    private JTextArea area;
    
    public Hilo1(JTextArea area1){
        this.area = area1;
    }
    public void run(){
        int i = 0;
        while(true){
            area.append(i + "\n");
            i++;
        }
        
    }
}