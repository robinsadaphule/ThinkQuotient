package Morning;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fileread {

	public static void main(String[] args)throws IOException
	{
	int ch;
	FileReader fr=null;
	try{
		fr=new FileReader("e:\\Sample.txt");
	}
		catch(FileNotFoundException fe)
	{
		System.out.println("File not exists");	
		
	}
	while ((ch=fr.read())!=-1)
		System.out.print((char)ch);
	fr.close();
}
}
