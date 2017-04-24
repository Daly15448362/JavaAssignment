package assignment1;

import javax.swing.*;//imports needed for code
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class editgui extends JFrame implements ActionListener  
	{
	
		
		JFrame frame;
	   
		JButton button1;//button to run code when clicked
	   JButton button2;//button to run code when clicked
	   JButton button3;//button to run code when clicked
	   JButton allbutton;
	   
	   JTextField searchstring;//input bar
	   
	   JLabel stringlabel;//label for input bar
	   JLabel heading;
	   
	   // constructor
	  editgui()//implement gui
	   {
		 frame = new JFrame();
		 frame.setBounds(300, 300, 400, 300);
		 frame.getContentPane().setLayout(null);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.getContentPane().setBackground( Color.GREEN);
		
		   
		  
		   JLabel stringlabel = new JLabel("String to Search :");
		   stringlabel.setBounds(10, 50, 140, 30);
		   stringlabel.setFont(new Font("Serif", Font.BOLD ,17));
		   frame.getContentPane().add(stringlabel);
		   stringlabel.setForeground(Color.RED);
		   
		   JLabel heading = new JLabel("Daly's Java Search Engine");
		   heading.setBounds(125,10, 400, 30);
		   frame.getContentPane().add(heading);
		   heading.setForeground(Color.RED);
		   heading.setFont(new Font("Serif", Font.ITALIC ,22));
		   
		   searchstring = new JTextField(25);//input bar
		   searchstring.setBounds(145, 50, 200, 40);
		   frame.getContentPane().add(searchstring);//add input bar
		   
		   button1 = new JButton("Search Badwords.txt(30 characters max)");//button description
		   button1.setBounds(145,90,200,40);
		   button1.setForeground(Color.RED);
		   frame.getContentPane().add(button1);//add button
		   setVisible(true);//show
		   button1.addActionListener(this);//action listener for button
		   
		   button2 = new JButton("Search SecretInvasion.txt(30 characters max)");//button description
		   button2.setBounds(145, 130, 200, 40);
		   button2.setForeground(Color.DARK_GRAY);
		   frame.getContentPane().add(button2);//add button
		   setVisible(true);//show
		   button2.addActionListener(this);//action listener for button
		   
		   button3 = new JButton("Search Stalin.txt(30 characters max)");//button description
		   button3.setBounds(145, 170, 200, 40);
		   button3.setForeground(Color.MAGENTA);
		   frame.getContentPane().add(button3);//add button
		   setVisible(true);//show
		   button3.addActionListener(this);//action listener for button
		   
		   allbutton = new JButton("Search all 3 Text Files");//button description
		   allbutton.setBounds(145, 210, 200, 40);
		   allbutton.setForeground(Color.BLUE);
		   frame.getContentPane().add(allbutton);//add button
		   setVisible(true);//show
		   allbutton.addActionListener(this);//action listener for button
		}//end gui layout


        public void actionPerformed(ActionEvent e1)//action implementation
        {
        	int count=0;//for running statement in all 3files
        	int count1=0;//count badwords by itself
			int count2=0;//count secretinvasion by itself
			int count3=0;//count stalin by itslef
			int count4=0;//count badwords while in group
			int count5=0;//count secretinvasion while in group
			int count6=0;//count stalin while in group
			int count7 = count4+count5+count6;
			
			
        	if/*1*/ (e1.getSource().equals(button1))//if clicked
        	{	
        		if/*2*/ (searchstring.getText().equals(""))//if empty
        		{
        			JOptionPane.showMessageDialog(this ,"text not entered" );//shows message dialog window
        		}//end if2					
        		else if(searchstring.getText().length()>30)//if too many letters typed
        		{
        			JOptionPane.showMessageDialog(this ,"Too many characters entered" );//message dialog window
        		}//end else if
        		
        		else//1
        		{
        			try {
						FileReader r1=new FileReader("Badwords.txt");//choose file to read
						BufferedReader BB8 =new BufferedReader(r1);//read file
						String word;//words in file
						String key = searchstring.getText();//string for user input
						
						while((word=BB8.readLine())!=null)//while there is words
						{
							if/*3*/(word.contains(key))//if user input is found in file
							{
								JOptionPane.showMessageDialog(this, word);//show the findings
								count1++;
							}//end if3
							
						}//end while
						if/*exception and count*/((word=BB8.readLine())== null)
						{
							JOptionPane.showMessageDialog(this, "Matches of " + key + " in the File Badwords was " + count1 + " times");
						}//end ifexceptionandcount
					}//end try
        			catch (HeadlessException | IOException e) 
        			{
					
						e.printStackTrace();//print errors
					}//end catch
        			
        		}//end else1
        	}//end if1
        	
        	
        	else if/*1*/ (e1.getSource().equals(button2))//if clicked
        	{	
        		if/*2*/ (searchstring.getText().equals(""))//if empty
        		{
        			JOptionPane.showMessageDialog(this ,"text not entered" );//shows message dialog window
        		}//end if2					
        		else if(searchstring.getText().length()>30)//if too many letters typed
        		{
        			JOptionPane.showMessageDialog(this ,"Too many characters entered" );//message dialog window
        		}//end else if
        		
        		else//1
        		{
        			try {
						FileReader r2=new FileReader("SecretInvasion2.txt");//choose file to read
						BufferedReader BB9 =new BufferedReader(r2);//read file
						String word;//words in file
						String key = searchstring.getText();//string for user input
						
						while((word=BB9.readLine())!=null)//while there is words
						{
							if/*3*/(word.contains(key))//if user input is found in file
							{
								JOptionPane.showMessageDialog(this, word);
								count2++;//show the findings
							}//end if3
							
						}//end while
						if/*exception and count*/((word=BB9.readLine())== null)
						{
							JOptionPane.showMessageDialog(this, "Matches of " + key + " in the File SecretInvasion was " + count2 + " times");
						}//end ifexceptionandcount
					}//end try
        			catch (HeadlessException | IOException e9) 
        			{
					
						e9.printStackTrace();//print errors
					}//end catch
        			
        		}//end else1
        	}//end if2
        	
        	
        	else
        	{
        	if/*1*/ (e1.getSource().equals(button3))//if clicked
        	{	
        		if/*2*/ (searchstring.getText().equals(""))//if empty
        		{
        			JOptionPane.showMessageDialog(this ,"text not entered" );//shows message dialog window
        		}//end if2					
        		else if(searchstring.getText().length()>30)//if too many letters typed
        		{
        			JOptionPane.showMessageDialog(this ,"Too many characters entered" );//message dialog window
        		}//end else if
        		
        		else//1
        		{
        			try {
						FileReader r3=new FileReader("Stalin2.txt");//choose file to read
						BufferedReader BB10 =new BufferedReader(r3);//read file
						String word;//words in file
						String key = searchstring.getText();//string for user input
						
						while((word=BB10.readLine())!=null)//while there is words
						{
							if/*3*/(word.contains(key))//if user input is found in file
							{
								JOptionPane.showMessageDialog(this, word);
								count3++;//show the findings
							}//end if3
							
						}//end while
						if/*exception and count*/((word=BB10.readLine())== null)
						{
							JOptionPane.showMessageDialog(this, "Matches of " + key + " in the File Stalin was " + count3 + " times");
						}//end ifexceptionandcount
					}//end try
        			catch (HeadlessException | IOException e) 
        			{
					
						e.printStackTrace();//print errors
					}//end catch
        			
        		}//end else1
        	}//end if1
        	
        	if/*1*/ (e1.getSource().equals(allbutton))//if clicked
        	{	
        		if/*2*/ (searchstring.getText().equals(""))//if empty
        		{
        			JOptionPane.showMessageDialog(this ,"text not entered" );//shows message dialog window
        		}//end if2					
        		else if(searchstring.getText().length()>30)//if too many letters typed
        		{
        			JOptionPane.showMessageDialog(this ,"Too many characters entered" );//message dialog window
        		}//end else if
        		
        		
        		else//1
        		{
        			try {
						FileReader all1=new FileReader("Badwords.txt");
						FileReader all2=new FileReader("SecretInvasion2.txt");
						FileReader all3=new FileReader("Stalin2.txt");//choose file to read
						
						BufferedReader R2D2 =new BufferedReader(all1);//read file
						BufferedReader C3PO =new BufferedReader(all2);
						BufferedReader BB18 =new BufferedReader(all3);
						
						String word;//words in file
						
						
						String key = searchstring.getText();//string for user input
						
						
						while((word=R2D2.readLine())!=null)//while there is words
						{
							if(count==0)
							{
								JOptionPane.showMessageDialog(this, "Results in Badwords File are:");
								count++;
							}//endcountif
							if/*3*/(word.contains(key))//if user input is found in file
							{
								JOptionPane.showMessageDialog(this, word);//show the findings
								count4++;
							}//end if3
							
						}//end while
						
						while((word=C3PO.readLine())!=null)
						{
							if(count==1)
							{
								JOptionPane.showMessageDialog(this, "Results in SecretInvasion File are:");
								count++;
							}//endcountif
							if(word.contains(key))
							{
								JOptionPane.showMessageDialog(this, word);
								count5++;
							}//enddisplayif
							
						}
						
						while((word=BB18.readLine())!=null)
						{
							if(count==2)
							{
								JOptionPane.showMessageDialog(this, "Results in Stalin File are:");
								count++;
							}//endcountif
							if(word.contains(key))
							{
								JOptionPane.showMessageDialog(this, word);
								count6++;
							}//enddisplayif
							
						}
						
						if/*exception and count*/((word=R2D2.readLine())== null)
						{
							JOptionPane.showMessageDialog(this, "Matches of " + key + " in the File Badwords was " + count4 + " times");
						}//end ifexceptionandcount
						
						if/*exception and count*/((word=C3PO.readLine())== null)
						{
							JOptionPane.showMessageDialog(this, "Matches of " + key + " in the File SecretInvasion was " + count5 + " times");
						}//end ifexceptionandcount
						
						if/*exception and count*/((word=BB18.readLine())== null)
						{
							JOptionPane.showMessageDialog(this, "Matches of " + key + " in the File Stalin was " + count6 + " times");
						}//end ifexceptionandcount
						count7=count4+count5+count6;//addcounts
						if/*exception and count*/((word=BB18.readLine())== null)
						{
							JOptionPane.showMessageDialog(this, "Total Matches of " + key + " in the Files Badwords,SecretInvasion and  Stalin was " + count7 + " times");
						}//end ifexceptionandcount
						
					}//end try
        			catch (HeadlessException | IOException e) 
        			{
					
						e.printStackTrace();//print errors
					}//end catch
        			
        		}//end else1
        	}//end if1
        }//end action		
        }//end else3
        
	}//end editgui class
