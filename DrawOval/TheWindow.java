import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class TheWindow extends JFrame{

	
	private JSlider slider;
	private DrawOval myPanel;
	
	//Title
	public TheWindow(){
		super("The Oval");
		myPanel = new DrawOval();
		//Background color
		myPanel.setBackground(Color.cyan);
		
		//Slider
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		//Listener
		slider.addChangeListener(
				new ChangeListener(){
					public void stateChanged(ChangeEvent e){
						myPanel.setD(slider.getValue());
						
					}
					
				}
				
				
				
			);
		add(slider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
		
	}
	
}
