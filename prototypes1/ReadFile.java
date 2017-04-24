package prototypes1;



	import java.io.File;
	import java.util.Scanner;

	public class ReadFile {

	    public static void main(String[] args) {

	        try {
	            System.out.print("Enter the file name with extension : ");

	            Scanner stuff = new Scanner(System.in);

	            File search = new File(stuff.nextLine());

	            stuff = new Scanner(search);


	            while (stuff.hasNextLine()) {
	                String content = stuff.nextLine();
	                System.out.println(content);
	            }
	            stuff.close();

	        } catch (Exception e1) {
	            e1.printStackTrace();
	        }
	    }

	}
