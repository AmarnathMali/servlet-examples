package springboard;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("amar.txt");
		String str = "hi dude";
		fw.write(str);
		System.out.println("written succesful");
        fw.close();
        
        
        FileReader fr = new FileReader("amar.txt");
        int a;
        while((a=fr.read()) != -1){
        	System.out.print((char)a);
        }
	}

}
