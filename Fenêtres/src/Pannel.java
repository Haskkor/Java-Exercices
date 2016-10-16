import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.GradientPaint;

public class Pannel extends JPanel 
{
    public void paintComponent(Graphics g)
    {    	
         try 
         {
             Image img = ImageIO.read(new File("images.jpg"));
             g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
         } 
         catch (IOException e) 
         {
             e.printStackTrace();
         }
         
         System.out.println("Je suis exécutée ! ! !"); 
         g.fillOval(20, 20, 75, 75);         
         
         int x1 = this.getWidth()/4;
         int y1 = this.getHeight()/4;
       
         System.out.println("largeur = " + this.getWidth() + ",  longueur = " + this.getHeight());
         System.out.println(" coordonnée de début d'affichage x1 = " + x1 + " y1 = " + y1);
         
         g.fillOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
         
     	 Graphics2D g2d = (Graphics2D) g;
         GradientPaint gp = new GradientPaint(0, 0, Color.cyan, 30, 30, Color.pink, true);
         g2d.setPaint(gp);
         Font font = new Font("Courier", Font.BOLD, 20);
         g2d.setFont(font);       
         g2d.drawString("Bonjour.", 160, 100);
        
    }
}
