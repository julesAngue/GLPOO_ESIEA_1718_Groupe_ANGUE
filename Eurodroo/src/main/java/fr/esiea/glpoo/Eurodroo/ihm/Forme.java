package fr.esiea.glpoo.Eurodroo.ihm;
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class Forme extends JPanel{  
	
		  //public void paintComponent(Graphics g){ 
		 //   g.fillOval(20, 20, 75, 75);
		 // }               
		  public void paintComponent(Graphics g){                
			    int x1 = this.getWidth()/4;
			    int y1 = this.getHeight()/4;
			    g.drawOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
			  }

		}

