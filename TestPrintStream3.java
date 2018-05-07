package practice;

import java.util.*;
import java.io.*;

public class TestPrintStream3 {
	public static void main(String[] args) {
		String s = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			FileWriter fw = new FileWriter("d:/java/logfile.log",true);
			PrintWriter log = new PrintWriter(fw);
			while((s = br.readLine())!= null) {
				if(s.equalsIgnoreCase("exit")) break;
				System.out.println(s.toUpperCase());
				log.println("-----");
				log.println(s.toUpperCase());
				log.flush();
			}
			log.println("==="+new Date()+"===");
			log.println(s.toUpperCase());
			log.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}