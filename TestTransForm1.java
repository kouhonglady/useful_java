package practice;

import java.io.*;
public class TestTransForm1 {
	public static void main(String[] args) {
		try {
			OutputStreamWriter osw = new OutputStreamWriter(
					new FileOutputStream("d:/java/data1.txt"));
			osw.write("mircosoftimbsunapplehp");
			System.out.println(osw.getEncoding());
			osw.close();
			
			osw = new OutputStreamWriter(
					new FileOutputStream("d:/java/data1.txt",true),"ISO8859_1");
			osw.write("mircosoftibmsunapplehp");
			System.out.println(osw.getEncoding());
			osw.close();
					
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
