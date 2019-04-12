/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animationapplet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Randika Madhushan
 */
public class Animation extends Applet implements Runnable{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    int x,y,z;
    public void init() {
        // TODO start asynchronous download of heavy resources
//        x=100;
//        y=100;
        Thread thread = new Thread(this);
        //thread.start();
    }

    public void paint(Graphics g){
        
        setSize(470, 350);
        //=getWidth();
        setBackground(new Color(175,238,238));
        drawSun(g);
        drawMountains(g);
        drawRoad(g);
        drawPawment(g);
        drawGrass(g,i);
        drawCloud(g,i);
        drawCarForward(g,i);
        drawCarBackward(g,i);
      
    }
    int i;

    @Override
    public void run() {
        for (i = 0; i < 1000; i += 3) {

            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Animation.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
     public void drawRoad(Graphics g){   
         //road
        g.setColor(Color.black);
        g.drawLine(0,175,500,175);//x1,y1,x2,y2
        g.setColor(Color.black);
        g.fillRect(0,175,500,180);//x,y,width,height
        g.setColor(Color.white);
        g.fillRect(20, 250, 40, 15);
        g.fillRect(90, 250, 40, 15);
        g.fillRect(160, 250, 40, 15);
        g.fillRect(230, 250, 40, 15);
        g.fillRect(300, 250, 40, 15);
        g.fillRect(370, 250, 40, 15);
        g.fillRect(440, 250, 40, 15);
    }
     public void drawPawment(Graphics g){
        //pawment
        g.setColor(Color.lightGray);
        g.fillRect(0, 135, 500, 40);
     }
     public void drawMountains(Graphics g){
         //mountains
        g.setColor(new Color(210,105,30));
        g.fillOval(-40, 30, 330, 400);//x,y,width,height
        g.fillOval(170, 30, 230, 400);//x,y,width,height
     }
     public void drawGrass(Graphics g,int x){
         //g.setColor(new Color(99,201,0));
         //g.fillArc(20,20,100,100,180,180);
         //g.fillOval(180, 30, 20, 40);
        g.setColor(new Color(99,201,0));
        g.fillArc(350,90,50,100,60,60);//x,y,width,height,startangle,arcangle 
        g.fillArc(370,90,50,100,60,60);//x,y,width,height,startangle,arcangle   
        g.fillArc(380,90,50,100,60,60);//x,y,width,height,startangle,arcangle 
        g.fillArc(400,90,50,100,60,60);//x,y,width,height,startangle,arcangle
        g.fillArc(420,90,50,100,60,60);//x,y,width,height,startangle,arcangle   
        g.fillArc(430,90,50,100,60,60);//x,y,width,height,startangle,arcangle   
         
        g.setColor(new Color(24, 124, 60)); //leaf
        g.fillOval(380, 120, 96, 20);
        g.fillOval(300, 120, 100, 20);
      
     }
     public void drawSun(Graphics g){
         g.setColor(new Color(249,215,68));
         g.fillOval(180, 5, 100, 100);
     }
     public void drawCloud(Graphics g,int x){
         
         if(x<500){
         g.setColor(new Color(118,215,234));//forward
         g.fillOval(100+x, 10, 60, 40);
         g.fillOval(150+x, 10, 60, 40);
         
         g.fillOval(300-x, 35, 60, 40);
         g.fillOval(350-x, 35, 60, 40); 
         }else{
         g.setColor(new Color(118,215,234));
         g.fillOval(500, 10, 60, 40);
         g.fillOval(550, 10, 60, 40);
         
         g.fillOval(-50, 35, 60, 40);
         g.fillOval(-50, 35, 60, 40);  
         }
         
     }
     public void drawCarForward(Graphics g,int x){
         
         if(x<420){
         g.setColor(Color.magenta);
         g.fillRoundRect(20+x,175,130,50,5,5);//x,y,width,height,arcwidth,archeight//50k ekathu kranna anthima posisiton eka sapurna kan
         g.setColor(new Color(199,21,133));
         g.fillArc(24+x, 126, 120, 100, 0, 180);
         g.setColor(Color.WHITE);
         //g.fillRect(45, 145, 80, 30);
         
         g.setColor(new Color(120,120,120));
         g.fillArc(26+x, 200, 50, 50, 180, 180);
         g.fillArc(96+x, 200, 50, 50, 180, 180); 
         }else{
         g.setColor(Color.magenta);
         g.fillRoundRect(520,260,130,50,5,5);//x,y,width,height,arcwidth,archeight
         g.setColor(new Color(199,21,133));
         g.fillArc(524, 126, 120, 100, 0, 180);
         g.setColor(Color.WHITE);
         //g.fillRect(45, 145, 80, 30);
         
         g.setColor(new Color(120,120,120));
         g.fillArc(525, 200, 50, 50, 180, 180);
         g.fillArc(594, 200, 50, 50, 180, 180);
         }
         
     }
     public void drawCarBackward(Graphics g,int x){
         
         if(x<400){
         g.setColor(new Color(220,20,60));
         g.fillRoundRect(320-x,260,130,50,5,5);//x,y,width,height,arcwidth,archeight
         g.setColor(new Color(240,128,128));
         g.fillArc(324-x, 215, 120, 100, 0, 180);
         g.setColor(Color.WHITE);
         //g.fillRect(45, 145, 80, 30);
         
         g.setColor(new Color(120,120,120));
         g.fillArc(325-x, 285, 50, 50, 180, 180);
         g.fillArc(394-x, 285, 50, 50, 180, 180); 
         }else{
         g.setColor(new Color(220,20,60));
         g.fillRoundRect(-50,260,130,50,5,5);//x,y,width,height,arcwidth,archeight
         g.setColor(new Color(240,128,128));
         g.fillArc(-50, 215, 120, 100, 0, 180);
         g.setColor(Color.WHITE);
         //g.fillRect(45, 145, 80, 30);
         
         g.setColor(new Color(120,120,120));
         g.fillArc(0, 285, 50, 50, 180, 180);
         g.fillArc(0, 285, 50, 50, 180, 180);
         }
         
     }

//    @Override
//    public void run() {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
