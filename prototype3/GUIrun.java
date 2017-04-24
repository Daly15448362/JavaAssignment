package prototype3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import assignment1.editgui;

public class GUIrun extends JFrame implements ActionListener  
{

	JFrame frame;
   JButton button1;
   JTextField searchstring;
   JLabel stringlabel = new JLabel("String to Search :");
   
   
   public static void main(String[] args)
   {
   EventQueue.invokeLater(new Runnable()
	{
	   public void run()
	   {
		   try
		   {
			   GUIrun GUIPswd = new GUIrun();
			   GUIPswd.frame.setVisible(true);
		   }//end try
		   catch(Exception e2)
		   {
			   e2.printStackTrace();
		   }//end catch
	   }//end run
	});//end eventqueue
   }//End Static
  public GUIrun()
   {
	  start();
   }
  public void start() 
  {
	 frame = new JFrame();
	 frame.setBounds(100, 100, 400, 300);
	 frame.getContentPane().setLayout(null);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 JTextArea Filetext = new JTextArea();
	 Filetext.setBounds(80, 35, 250, 100);
	 Filetext.setEditable(false);
	 Filetext.setForeground(Color.GREEN);
	 frame.getContentPane().add(Filetext);
	   
	   searchstring = new JTextField(25);
	   searchstring.setBounds(80, 140, 250, 30);
	   frame.getContentPane().add(searchstring);
	   
	   button1 = new JButton("Search");
	   button1.setBounds(145, 180, 110, 50);
	   frame.getContentPane().add(button1);
	   setVisible(true);
	  
	   button1.addActionListener(new ActionListener()
	   {
		   public void actionperformed(ActionEvent arg0)
		   {
			   Filechooser searchfile = new Filechooser();
  
			   try
			   {
				   searchfile.Filepick();
			   }//end try
			   catch (Exception e1)
			   {
				   e1.printStackTrace();
			   }//endcatch
			   Filetext.setText(searchfile.contents.toString());   
		   }

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			  Filechooser searchfile = new Filechooser();
			  
			   try
			   {
				   searchfile.Filepick();
			   }//end try
			   catch (Exception e1)
			   {
				   e1.printStackTrace();
			   }//endcatch
			   Filetext.setText(searchfile.contents.toString());
		}//end actionperformed
		   
	   });
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
