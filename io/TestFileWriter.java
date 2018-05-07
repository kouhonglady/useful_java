package practice;

import java.io.*;

public class TestFileWriter {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("d:/java/unidata.dat");
			for(int i=0;i<65535;i++) {
				fw.write(i);
			}
			fw.close();
		}catch(IOException e) {
			System.out.println("写入文件出错");
			System.exit(-1);
		}
	}
}
