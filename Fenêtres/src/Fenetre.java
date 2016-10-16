import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;

public class Fenetre extends JFrame 
{
	public Fenetre()
	{
		/*JPanel pan = new JPanel();
		pan.setBackground(Color.darkGray);    
		this.setContentPane(pan);*/
		
        this.setTitle("Ma première fenêtre java");
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        //this.setContentPane(new Pannel());
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        this.setResizable(false);
		this.setVisible(true);
		
		go();
	}
	
	private Panneau pan = new Panneau();
	
    private void go()
    {
    	int x = pan.getPosX(), y = pan.getPosY();
        boolean backX = false;
        boolean backY = false;
    	this.setContentPane(pan);
        for(;;)
        {
        	if(x < 1)backX = false;
        	if(x > pan.getWidth()-50)backX = true;
            if(y < 1)backY = false;
            if(y > pan.getHeight()-50)backY = true;
            if(!backX)
                pan.setPosX(x+=5);
            else
                pan.setPosX(x-=5);
            if(!backY)
                pan.setPosY(y+=5);
            else
                pan.setPosY(y-=5);
            pan.repaint();
            try 
            {
            	Thread.sleep(10);
            } 
            catch (InterruptedException e) 
            {
            	e.printStackTrace();
            }
        }
        
} 
}
