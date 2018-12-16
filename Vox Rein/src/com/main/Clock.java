package com.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.border.BevelBorder;


class Clock extends JLabel
{
    Timer t = null;

    //get current time
    public String timeNow()
    {
       Calendar n = Calendar.getInstance();
       int ap = n.get(Calendar.AM_PM);
       int hrs=n.get(Calendar.HOUR);
       if (hrs==0) {hrs=12;}
       String ampm= (ap==0)?("am"):("pm");
       return zero(hrs)+":"+zero(n.get(Calendar.MINUTE))+":"+zero(n.get(Calendar.SECOND))+" "+ampm;
 
    }

     public String zero(int num)
     {
       return ( num < 10) ? ("0"+num) : (""+num);
                                          //Add leading zero if needed
     }

    public Clock()
    {
        super();
        float f[] = new float[3];
        Color.RGBtoHSB(50,190,255,f);
        setFont(new Font("orange juice", Font.BOLD,45));    
        setForeground(Color.getHSBColor(f[0], f[1] ,f[2]));
      
        setBorder(new BevelBorder(4));
        t = new Timer(1000, new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                DoChangeText();
                
            }
        });

        t.start();
    }

    public void DoChangeText()
    {
        this.setText(timeNow());
    }
}