package springboard;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str = "welcome to wonder land";
       FileOutputStream input = new FileOutputStream("info.txt");
       byte[] b = str.getBytes();
       input.write(b);
       System.out.println("operation succesful");
       
       
       
       FileInputStream fis = new FileInputStream("info.txt");
       int a ;
       while((a= fis.read())!=-1){
    	   System.out.print((char)a);
       }
	}

}
