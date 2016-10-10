package thread2;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author juchafernandez
 */
public class Thread2 extends Thread {
    
    public Thread2(String variable) {
        super(variable);
    }
    
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + getName());
             if (i==4) try {
                 Thread.sleep(1000);
                 System.out.println("thread "+getName()+" listo para la ejecución");
            } catch (InterruptedException ex) {
                 System.out.println("error con la interrupción");;
            }
            
    }}
    
    public static void main(String[] args) {
        new Thread2("Manel").start();
        new Thread2("Joteruuuuu").start();
        new Thread2("Tonaisco").start();
        new Thread2("teu pai").start();
        System.out.println("acabado 2");
        
        
    }
   
    
}