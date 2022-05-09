package vd;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ASSIGNMENTPROB1 {
	
	static ASSIGNMENTPROB1 obj = new ASSIGNMENTPROB1();
	
	
/** This Method checks whether file in the parameter is already present n if so it is not a txt document and then creates a text file n prints its details */
	public void CreateFile(String name) {
		System.out.println(name);
		File newfile = new File("c:\\java\\"+name);
		
		boolean check = newfile.exists() && (!newfile.isDirectory()) && newfile.isFile();
		if(check==false) {
			try {
				newfile.createNewFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println("THE FILE "+name+".txt AS BEEN CREATED \n");
			obj.DetailsOfFile(newfile ,name);
	}
		else {
			System.out.println("The abc.txt file already exists in \\\"c:\\\\\\\\java\\\\\\\\");
		}	
	}
	
	
	public void DetailsOfFile(File newfile ,String name) {
		System.out.println("The name of the file is          :"+newfile.getName());
		System.out.println("The relative path of the file is :"+newfile.getPath());
		System.out.println("The absolute path of the file is :"+newfile.getAbsolutePath());
	}
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The text file will be created in the path of \"c:\\\\java\\\\ \nPlease enter the text file name without extension");	
		
		while(true) {
		String fname= sc.nextLine();
		if(fname.contains(".")) {
			System.out.println("Please enter the name without extension");
		}
		else {
			obj.CreateFile(fname);
			break;
		}
		}		
}
}
