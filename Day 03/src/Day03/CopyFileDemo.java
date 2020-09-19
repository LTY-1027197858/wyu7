package Day03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
	public static void copyFile(String src,String dest) throws IOException{
		FileInputStream in=new FileInputStream(src);
		File file=new File(dest);
		if(!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream out=new FileOutputStream(file);
		int c;
		byte buffer[]=new byte[1024];
		while((c=in.read(buffer))!=-1){
			for(int i=0;i<c;i++) {
				out.write(buffer[i]);
			}
		}
		in.close();
		out.close();
		
	}
	public static void main(String[] args) throws IOException {
		String fileSrc="S:\\WEB_Code\\Github\\wyu717\\Day 03\\src\\Day03\\myfile.txt";
		String fileDes="S:\\WEB_Code\\Github\\wyu717\\Day 03\\src\\Day03\\myfile_cp.txt";
		copyFile(fileSrc,fileDes);//调用文件复制方法
		System.out.println("文件已经复制成功");
	}
}
