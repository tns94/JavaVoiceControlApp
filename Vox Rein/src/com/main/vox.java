package com.main;



import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;
import edu.cmu.sphinx.util.props.PropertyException;
import com.main.Clock;
import com.main.dfltcmd;
import com.main.tts;

import java.io.IOException;
import java.net.URL;
import java.util.Calendar;


public class vox extends javax.swing.JFrame {
            dfltcmd d=new dfltcmd();
            tts t=new tts();
            static VoiceManager vm ;
            public static Voice v ;
            static Recognizer r;
	    static Microphone m ;
            static ConfigurationManager cm;
            static boolean show;
  
void vr()
{
   String rt;
   if (m.startRecording())
            {	
            while(true)
            { 
            Result re=r.recognize();
            said.setText("");
           
            if(re!=null)
            {
             rt = re.getBestFinalResultNoFiller();
             if(rt!="")
             {
             if(rt.equalsIgnoreCase("sleep")&&show==true) {  
                 said.setText("You Said :"+rt);
                 btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/red.jpg")));
                 v.speak("i am sleeping");
                 show=false;
                }
            if(rt.equalsIgnoreCase("kill yourself")) { 
                    said.setText("You Said :"+rt);
                    v.speak("commeeting suicide");
                    v.deallocate();
                    r.deallocate();
                    System.exit(0);
            }
    
            if (rt.equalsIgnoreCase("wake up")&&show==false) {
                   said.setText("You Said :"+rt);
                   btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/green.jpg")));
                   v.speak("now i am listening");
                  show=true;
                }
            if (show==true)
            {   
                
                switch(rt)
            {
                case "whats time now":said.setText("You Said :"+rt);
                                 Calendar n = Calendar.getInstance();
                                 int hrs = n.get(Calendar.HOUR);
                                 int min = n.get(Calendar.MINUTE);
                                 int sec = n.get(Calendar.SECOND);
                                 int ap = n.get(Calendar.AM_PM);
                                 String ampm= (ap==0)?("AM"):("PM");
                                 if (hrs==0)
                                 {hrs=12;}
                                 String time = (hrs)+" "+(min)+" "+ ampm;
 	                 	 v.speak("its"+time); 
                                 break;
                case "whats date":said.setText("You Said :"+rt);
                                 n = Calendar.getInstance();
                                 int date = n.get(Calendar.DAY_OF_MONTH);
                                 int month = n.get(Calendar.MONTH);
                                 int year = n.get(Calendar.YEAR);
                                 String m="";
                                 switch(month){case 0: m="january";break;case 1: m="february";break;case 2:m="march";break; case 3:m="april";break; case 4: m="may";break;case 5:m="june";break;case 6:m="july";break;case 7:m="august";break;case 8:m="september";break;case 9:m="october";break;case 10:m="november";break;case 11:m="december";break;}
                                 v.speak("its"+date+""+m);
                                 v.speak(year+""); 
                                 break;
                
                case "open command line":said.setText("You Said :"+rt);
                               try{
                                      v.speak("opening command line");
                                      Runtime.getRuntime().exec("cmd /c start cmd");
                                  }
                                  catch(IOException e){}
                break;
                    
                case "close command line":said.setText("You Said :"+rt);
                               try{
                                      v.speak("closing command line");
                                      Runtime.getRuntime().exec("cmd /c start taskkill /im cmd.exe /f");
                                  }
                                  catch(IOException e){}
               break;
                    
                case "open media player":said.setText("You Said :"+rt);
                               try{
                                      v.speak("opening media player");
                                      Runtime.getRuntime().exec("cmd /c start wmplayer");
                               }
                                  catch(IOException e){}
                break;
                    
                case "open m s access":said.setText("You Said :"+rt);
                                try{
                                      v.speak("opening m s access");
                                      Runtime.getRuntime().exec("cmd /c start msaccess");
                                  }
                                  catch(IOException e){}
                break;
                case "open micro soft access": said.setText("You Said :"+rt); 
                                try{
                                      v.speak("opening microsoft access");
                                      Runtime.getRuntime().exec("cmd /c start msaccess");
                                  }
                                  catch(IOException e){}
                break;
 		case "close media player":said.setText("You Said :"+rt);
                              try{
                                     v.speak("closing media player");
                                     Runtime.getRuntime().exec("cmd /c start taskkill /im wmplayer.exe /f");
                                 }
                                     catch(IOException e){}
                break;
                case "stop music":said.setText("You Said :"+rt);
                               try{
                                      v.speak("stopping music");
                                      Runtime.getRuntime().exec("cmd /c start taskkill /im wmplayer.exe /f");
                                  }
                                  catch(IOException e){}
                break;    
 		case "close m s access":said.setText("You Said :"+rt);
                               try{
                                      v.speak("closing m s access");
                                      Runtime.getRuntime().exec("cmd /c start taskkill /im msaccess.exe /f");
                                  }
                                  catch(IOException e){}
                break;
                case "open blue tooth file transfer":said.setText("You Said :"+rt);
                               try{
                                      v.speak("opening bluetooth interface");
                                      Runtime.getRuntime().exec("cmd /c fsquirt");
                                  }
                                  catch(IOException e){}
                break; 
                case "open calculator":said.setText("You Said :"+rt);
                               try{
                                      v.speak("opening calculator");
                                      Runtime.getRuntime().exec("cmd /c start calc");
                                  }
                                  catch(IOException e){}
                break; 
                case "open windows security center":said.setText("You Said :"+rt);
                               try{
                                      v.speak("opening windows security center");
                                      Runtime.getRuntime().exec("cmd /c wscui.cpl");
                                  }
                                  catch(IOException e){}
                break;
                case "open programs":said.setText("You Said :"+rt);
                               try{
                                      v.speak("opening programs and features");
                                      Runtime.getRuntime().exec("cmd /c start appwiz.cpl");
                                  }
                                  catch(IOException e){}
                break;
                case "open control panel":said.setText("You Said :"+rt);
                               try{
                                      v.speak("opening control panel");
                                     Runtime.getRuntime().exec("cmd /c control");
                                }
                                  catch(IOException e){}
                break;
                
                case "open micro soft paint":said.setText("You Said :"+rt);
                               try{
                                      v.speak("opening microsoft paint");
                                      Runtime.getRuntime().exec("cmd /c start mspaint");
                                  }
                                  catch(IOException e){}
                break;
                case "close micro soft paint":said.setText("You Said :"+rt);
                               try{
                                      v.speak("closing microsoft paint");
                                      Runtime.getRuntime().exec("cmd /c start taskkill /im mspaint.exe /f");
                                  }
                                  catch(IOException e){}
                break;
                case "close micro soft access":said.setText("You Said :"+rt);
                               try{
                                     
                                      v.speak("closing microsoft access");
                                      Runtime.getRuntime().exec("cmd /c start taskkill /im msaccess.exe /f");
                                  }
                                  catch(IOException e){}
                break;
                
                
                
                case "why fi on":said.setText("You Said :"+rt);
                               try{    
                                      said.setText("You Said: Wi-Fi On");
                                      v.speak("starting why fy");
                                     Runtime.getRuntime().exec("cmd /c wmic path win32_networkadapter where index=7 call enable");
                                       // Runtime.getRuntime().exec("cmd /c netsh interface set interface name =\"Wi-Fi\"  enable");
                                  }
                                  catch(IOException e){} 
                break;
                     
                case "why fi off":said.setText("You Said :"+rt);
                               try{
                                      said.setText("You Said: Wi-Fi Off");
                                      v.speak("stopping why fy");
                                       Runtime.getRuntime().exec("cmd /c wmic path win32_networkadapter where index=7 call disable");
                                    
                                    //  Runtime.getRuntime().exec("cmd /c netsh interface set interface name =\"Wi-Fi\"  disable");
                                  }
                                  catch(IOException e){} 
                break;  
                     
                case "open browser":said.setText("You Said :"+rt);
                               try{
                                      v.speak("opening browser");
                                      Runtime.getRuntime().exec("cmd /c start chrome.exe");
                                  }
                                  catch(IOException e){} 
                break;
                     
                case "close browser":said.setText("You Said :"+rt);
                               try{
                                      v.speak("closing browser");
                                      Runtime.getRuntime().exec(" cmd /c start taskkill /im chrome.exe /f");
                                  }
                                  catch(IOException e){} 
                break;
                    
                case "open task manager":said.setText("You Said :"+rt);
                               try{
                                      v.speak("opening task manager");
                                      Runtime.getRuntime().exec("cmd /c start taskmgr.exe");
                                  }
                                  catch(IOException e){}  
                break;
                case "open device manager":said.setText("You Said :"+rt);
                               try{
                                      v.speak("opening device manager");
                                      Runtime.getRuntime().exec("cmd /c start devmgmt.msc");
                                  }
                                  catch(IOException e){}  
                break;
                    
                case "close task manager":said.setText("You Said :"+rt);
                               try{
                                      v.speak("closing task manager");
                                      Runtime.getRuntime().exec(" cmd /c start taskkill /im taskmgr.exe /f");
                                  }
                                  catch(IOException e){} 
                break; 
                    
                case "site face book":said.setText("You Said :"+rt);
                               try{
                                      said.setText("You Said: Site Facebook");
                                      v.speak("opening website facebook");
                                      Runtime.getRuntime().exec("cmd /c start chrome www.facebook.com");
                                  }
                                  catch(IOException e){}  
                break;
                 case "site you tube":said.setText("You Said :"+rt);
                               try{
                                      said.setText("You Said: Site Youtube");
                                      v.speak("opening website you tube");
                                      Runtime.getRuntime().exec("cmd /c start chrome www.youtube.com");
                                  }
                                  catch(IOException e){}  
                break;
                case "site tweet er":
                               try{said.setText("You Said :"+rt);
                                      said.setText("You Said: Site Twitter");
                                      v.speak("opening website twitter");
                                      Runtime.getRuntime().exec("cmd /c start chrome www.twitter.com");
                                  }
                                  catch(IOException e){}  
                break;
                
                case "site g mail":said.setText("You Said :"+rt);
                               try{
                                      v.speak("opening website g mail");
                                      Runtime.getRuntime().exec("cmd /c start chrome www.gmail.com");
                                  }
                                  catch(IOException e){}  
                break;
                case "site go girl":said.setText("You Said :"+rt);
                               try{   said.setText("You Said: Site Google");
                                      v.speak("opening website google");
                                      Runtime.getRuntime().exec("cmd /c start chrome www.google.com");
                                  }
                                  catch(IOException e){}  
                break;
                        
                 
                case "site week e p d ya":said.setText("You Said :"+rt);
                               try{   said.setText("You Said: Site wikipedia");
                                      v.speak("opening website v key pedia");
                                      Runtime.getRuntime().exec("cmd /c start chrome www.wikipedia.org");
                                  }
                                  catch(IOException e){}  
                break;
                    
                case "who are you":said.setText("You Said :"+rt);
                                
                                      v.speak(" I am vox rein ");
                                     
                                  
                break;
                    
                case "open note pad":said.setText("You Said :"+rt);
                               try{
                                      v.speak("opening notepad");
                                      Runtime.getRuntime().exec("cmd /c start notepad");
                                  }
                                  catch(IOException e){} 
                break;
                    
                case "close note pad":said.setText("You Said :"+rt);
                               try{
                                      v.speak("closing note pad");
                                      Runtime.getRuntime().exec(" cmd /c start taskkill /im notepad.exe /f");
                                  }
                                  catch(IOException e){} 
                break; 
                     
                case "open micro soft word":said.setText("You Said :"+rt);
                               try{
                                      v.speak("opening microsoft word");
                                      Runtime.getRuntime().exec("cmd /c start winword");
                                  }
                                  catch(IOException e){} 
                break;
                     
                case "open m s word":said.setText("You Said :"+rt);
                               try{
                                      v.speak("opening m s word");
                                      Runtime.getRuntime().exec("cmd /c start winword");
                                  }
                                  catch(IOException e){} 
                break;
                    
                case "close micro soft word":said.setText("You Said :"+rt);
                               try{
                                      v.speak("closing microsoft word");
                                      Runtime.getRuntime().exec(" cmd /c start taskkill /im winword.exe /f");
                                  }
                                  catch(IOException e){} 
                break; 
                    
                case "close m s word":said.setText("You Said :"+rt);
                               try{
                                      v.speak("closing m s word");
                                      Runtime.getRuntime().exec(" cmd /c start taskkill /im winword.exe /f");
                                  }
                                  catch(IOException e){} 
                break;
                case "close calculator":
                               try{said.setText("You Said :"+rt);
                                      v.speak("closing calculator");
                                      Runtime.getRuntime().exec(" cmd /c start taskkill /im calc.exe /f");
                                  }
                                  catch(IOException e){} 
                break;    
                     
                case "open word pad":said.setText("You Said :"+rt);
                               try{
                                      v.speak("opening word pad");
                                      Runtime.getRuntime().exec("cmd /c start wordpad.exe");
                                  }
                                  catch(IOException e){} 
                break;
                     
                case "close word pad":said.setText("You Said :"+rt);
                               try{
                                      v.speak("closing word pad");
                                     Runtime.getRuntime().exec(" cmd /c start taskkill /im wordpad.exe /f");
                                  }
                                  catch(IOException e){} 
                break;
                    
                case "open micro soft excel":said.setText("You Said :"+rt);
                               try{
                                      v.speak("opening microsoft excel");
                                      Runtime.getRuntime().exec("cmd /c start excel");
                                  }
                                  catch(IOException e){} 
                break;
                     
                case "open m s excel":said.setText("You Said :"+rt);
                               try{
                                      v.speak("opening m s excel");
                                      Runtime.getRuntime().exec("cmd /c start excel");
                                  }
                                  catch(IOException e){} 
                break;
                    
                case "close micro soft excel":said.setText("You Said :"+rt);
                               try{
                                      v.speak("closing microsoft excel");
                                      Runtime.getRuntime().exec("cmd /c start taskkill /im excel.exe /f");
                                  }
                                  catch(IOException e){} 
                break;  
                    
                case "close m s excel":said.setText("You Said :"+rt);
                               try{
                                      v.speak("closing m s excel");
                                      Runtime.getRuntime().exec("cmd /c start taskkill /im excel.exe /f");
                                  }
                                  catch(IOException e){} 
                break;  
                    
                case "play music":said.setText("You Said :"+rt);
                     try{
                                      v.speak("playing music");
                                      Runtime.getRuntime().exec("cmd /c start wmplayer /playlist play");
                                  }
                                  catch(IOException e){} 
                break;
              /*  case "open music":
                     try{
                                      v.speak("opening music folder");
                                      Runtime.getRuntime().exec("cmd /c start explorer C:\\Users\\hp\\Music");
                                  }
                                  catch(IOException e){} 
                break;   
                case "open games":
                     try{
                                      v.speak("opening games folder");
                                      Runtime.getRuntime().exec("cmd /c start explorer C:\\Users\\hp\\Desktop\\g\\games");
                                  }
                                  catch(IOException e){} 
                break;  */
                    
                case "show default commands":said.setText("You Said :"+rt);
                                    v.speak("showing default commands");
                                    d.setVisible(true);
                break;
                    
                case "hide default commands":said.setText("You Said :"+rt);
                                    v.speak("hiding default commands");
                                    d.setVisible(false);
                                    
                break;    
                    
                case "text to speech":said.setText("You Said :"+rt);
                                   
                                    t.setVisible(true);
                break;
                
              /*  case "speak up":
                                    v.allocate();
                break;  
                
                case "mute":
                                    v.deallocate();
                break;
                */  
               
            }
                
                
            }
            
            
            }
            }
            
            }
            }

}
    public vox() {
        initComponents(); 
        mnlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/finaldefault.gif")));
        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/red.jpg"))); 
        show=false;
        //setAlwaysOnTop(true);
        Clock c =new Clock();
        c.setSize(clk.getSize());
        c.setOpaque(false);
        c.setBorder(null);
        clk.add(c);
        setTitle("Vox Rein");
        URL ico=getClass().getResource("/resources/vr.jpg");
        setIconImage(new javax.swing.ImageIcon(ico).getImage());
        //System.setProperty("mbrola.base", "G:\\SW\\JavaSTt\\mbrola\\mbrola");
        dflt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
         vm = VoiceManager.getInstance();
         v = vm.getVoice("kevin16");
         v.allocate();
         try {
            
         URL url = vox.class.getResource("voxrein.xml");
         cm = new ConfigurationManager(url);
         r = (Recognizer) cm.lookup("recognizer");
	 m = (Microphone) cm.lookup("microphone");
         r.allocate();
         }
            catch (IOException e) {
            System.err.println("Problem when loading voxrein: " + e);
            e.printStackTrace();
            }
            catch (PropertyException e) {
            System.err.println("Problem configuring voxrein: " + e);
            e.printStackTrace();
            }   
            catch (InstantiationException e) {
            System.err.println("Problem creating voxrein: " + e);
            e.printStackTrace();
            }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        dflt = new javax.swing.JLabel();
        said = new javax.swing.JLabel();
        clk = new javax.swing.JPanel();
        btn = new javax.swing.JLabel();
        mnlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl.setOpaque(false);
        pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(50, 165, 255));
        jLabel2.setText("Shubham");
        pnl.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 80, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(50, 165, 255));
        jLabel3.setText("Tarun");
        pnl.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 80, 20));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(50, 165, 255));
        jLabel1.setText("Sadanand");
        pnl.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 100, 20));

        about.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        about.setForeground(new java.awt.Color(50, 165, 255));
        about.setText("Developed By:");
        pnl.add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 120, 20));

        dflt.setToolTipText("Default Commands");
        dflt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dfltMouseClicked(evt);
            }
        });
        pnl.add(dflt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 120, 30));

        said.setFont(new java.awt.Font("orange juice", 0, 30)); // NOI18N
        said.setForeground(new java.awt.Color(50, 165, 255));
        said.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl.add(said, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 510, 30));

        clk.setOpaque(false);
        pnl.add(clk, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 250, 70));

        btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn.setToolTipText("start/stop");
        btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMouseClicked(evt);
            }
        });
        pnl.add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 110, 120));
        pnl.add(mnlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

        getContentPane().add(pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMouseClicked
       if (show==false)
         {btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/green.jpg")));
         show=true;
        
         }
        else {  
          btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/red.jpg")));
          show=false;
         }
     
    }//GEN-LAST:event_btnMouseClicked

    private void dfltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dfltMouseClicked
        
        d.setVisible(true);
         //btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("red.jpg")));
                // show=false;
    }//GEN-LAST:event_dfltMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
                vox h=new vox();
                h.setVisible(true);
                h.vr();
                v.deallocate();
                
              
               
                
                
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JLabel btn;
    private javax.swing.JPanel clk;
    private javax.swing.JLabel dflt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel mnlbl;
    private javax.swing.JPanel pnl;
    private javax.swing.JLabel said;
    // End of variables declaration//GEN-END:variables
}