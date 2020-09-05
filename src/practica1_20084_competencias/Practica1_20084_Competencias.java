package practica1_20084_competencias;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practica1_20084_Competencias extends JFrame{

    private JButton bRun, bPausa, bDetener;
    private JLabel etiHilo1, etiHilo2;
    private JTextArea areaHilo1, areaHilo2;
    private JScrollPane jspHilo1, jspHilo2;
    
    public Practica1_20084_Competencias(){
        setSize(400,400);
        setTitle("Condiciones de Competencia");
        MisComponentes();
    }
    
    public void MisComponentes(){
        bRun = new JButton("RUN");
        bPausa = new JButton("PAUSA");
        bDetener = new JButton("DETENER");
        
        etiHilo1 = new JLabel("Hilo 1");
        etiHilo2 = new JLabel("Hilo 2");
        
        areaHilo1 = new JTextArea();
        areaHilo2 = new JTextArea();
        
        jspHilo1 = new JScrollPane(areaHilo1);
        jspHilo2 = new JScrollPane(areaHilo2);        
        
        bRun.setBounds(10, 100, 100, 25);
        bPausa.setBounds(10, 150, 100, 25);
        bDetener.setBounds(10, 200, 100, 25);
        
        etiHilo1.setBounds(150, 10, 100, 25);
        etiHilo2.setBounds(250, 10, 100, 25);

        jspHilo1.setBounds(150, 50, 100, 300);
        jspHilo2.setBounds(250, 50, 100, 300);
        
        setLayout(null);
        add(bRun);
        add(bPausa);
        add(bDetener);
        add(etiHilo1);
        add(etiHilo2);
        add(jspHilo1);
        add(jspHilo2);
        
        bRun.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Hilo1 h1 = new Hilo1(areaHilo1);
                Hilo2 h2 = new Hilo2(areaHilo2);
                h1.start();
                h2.start();
            }
        });
    }
    
    public static void main(String []  args){
               
        Practica1_20084_Competencias fr = new Practica1_20084_Competencias();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
