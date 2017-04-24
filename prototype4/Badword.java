package prototype4;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Badword {

	public class editgui extends JFrame implements ActionListener  
	{
	

	   JButton button1;
	   JTextField searchstring;
	   JLabel stringlabel = new JLabel("String to Search :");
	   
	   // constructor
	  editgui(String title)
	   {
		   super(title);
		   setSize(450,450);
		   setLayout(new FlowLayout());
		   
		   
		   searchstring = new JTextField(25);
		   add(searchstring);
		   
		   String search = searchstring.getText(); 
		   
		   button1 = new JButton("Enter Texted to be find (40 characters max)");
		   add(button1);
		   setVisible(true);
		   button1.addActionListener(this);
		}


        public void actionPerformed(ActionEvent e)
        {
        
        	if (e.getSource().equals(button1))
        	{	
        		if (searchstring.getText().equals(""))
        		{
        			JOptionPane.showMessageDialog(this ,"text not entered" );
        		}
        		else if(searchstring.getText().length()>40)
        		{
        			JOptionPane.showMessageDialog(this ,"Too many characters entered" );
        		}
        		
        		else
        		{
        			try {
						FileReader r=new FileReader("Badword.txt");
						BufferedReader bb =new BufferedReader(r);
						String word;
						String key = searchstring.getText();
						
						while((word=bb.readLine())!=null)
						{
							if(word.contains(key))
								JOptionPane.showMessageDialog(this, word);
						}
						
					} catch (HeadlessException | IOException e1) {
					
						e1.printStackTrace();
					}
        			
        		}
        	}
        }		
	}


}
