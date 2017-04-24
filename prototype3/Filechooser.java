package prototype3;

import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Filechooser
{
	JFileChooser fileC = new JFileChooser();
	StringBuilder filecon = new StringBuilder();
	Scanner contents;
	public void Filepick() throws Exception
	{
		if(fileC.showOpenDialog(null)== JFileChooser.APPROVE_OPTION)
		{
			java.io.File file = fileC.getSelectedFile();
			
			Scanner contents = new Scanner(file);
			
			while(contents.hasNext())
			{
				filecon.append(contents.nextLine());
				filecon.append("\n");
			}
			contents.close();
		}
		else
		{
			filecon.append("No file was Chosen");
		}
	}
}