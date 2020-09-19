package Day03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static String bufferedReader(String path) throws IOException{
		File file=new File(path);
		if(!file.exists()||file.isDirectory()) {
			throw new FileNotFoundException();
		}
		BufferedReader br=new BufferedReader(new FileReader(file));
		String temp=null;
		StringBuffer sb=new StringBuffer();
		temp=br.readLine();
		while(temp!=null){
			sb.append(temp+" ");
			temp=br.readLine();
		}
		return sb.toString();
	}
	public static void main(String[] args) throws IOException {
		String path="S:\\WEB_Code\\Github\\wyu717\\Day 03\\src\\Day03\\note.txt";
		String str=bufferedReader(path);
		System.out.println("��ӡ�����ݣ�"+str);
	}
}
