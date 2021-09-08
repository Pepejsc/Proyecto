package policine;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;

public class PoliCine {

    static int contador  = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        int velocidad =2;
         Timer timer;
         TimerTask tarea;
         
         int velMil = velocidad*1000;
         
         GUI_Main principal = new GUI_Main();
         principal.setVisible(true);
         
         tarea = new TimerTask(){
            @Override
            public void run() {
                Icon icono ;
                
                switch(contador){
                    case 0:
                        contador = 1 ;
                        icono =  new ImageIcon(getClass().getResource("/imagenes/t1.jpg"));
                        principal.jblV2.setIcon(icono);
                        break;
                    case 1:
                        contador = 2 ;
                        icono =  new ImageIcon(getClass().getResource("/imagenes/t2.jpg"));
                        principal.jblV2.setIcon(icono);
                        break;
                    case 2 :
                        contador = 0 ;
                        icono =  new ImageIcon(getClass().getResource("/imagenes/t3.jpg"));
                        principal.jblV2.setIcon(icono);
                        break;
                }
            }
             
         };
         timer = new Timer();
         timer.scheduleAtFixedRate(tarea, velMil, velMil);
    }
    
}
