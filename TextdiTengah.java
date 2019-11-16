/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textdi.tengah;

/**
 *
 * @author User
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Panel;

public class TextdiTengah extends Panel{
TextdiTengah(){
    setBackground(Color.GRAY);
}
 public void paint (Graphics g) {
  Font   f = new Font ("Helvetica", Font.BOLD,48);
  FontMetrics fm = getFontMetrics(f);
  g.setFont(f);
  
  String S = "Teks ini tampil di tengah";
  int xpos = (this.size().width - fm.stringWidth(S)) /2;
  int ypos = (this.size().width ) /2;
  g.drawString(S, xpos, ypos);
 
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f = new Frame("Testing graphics Panel");
        TextdiTengah gp = new TextdiTengah ();
        f.add(gp);
        f.setSize(900, 900);
        f.setVisible(true);
    }
    
}
