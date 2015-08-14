
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T-107
 */
public class ExamenFinal extends javax.swing.JFrame {
     public ExamenFinal(){
         initComponents();
         setSize(new Dimension (300,180));
         EtiquetaLabel.setLocation(x,y);
         Thread t=new Thread(new Runnable(){
                 public void run (){
                 int x;
                 int y;
                 try {
                 Thread.sleep (500);
                 } catch (InterruptedException ex) {
                 Logger.getLogger(ExamenFinal.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 if((x==300)&&(y==180)){
                 x=0;
                 y=0;
                 }else{
                 x=x+1;
                 y=y+1;
                 }
                 EtiquetaLabel.setLocation(x,y);
                 }catch(Exception ex){    
                 
                 
                 }
                 
                 
                 }
                 
                 @Override
                 ;
             public void run() {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
             
         }
         
         
         
     } 

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class EtiquetaLabel {

        private static void setLocation(int x, int y) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public EtiquetaLabel() {
        }
    }
 
             
}
