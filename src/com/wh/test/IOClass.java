package com.wh.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

//字节流 字符流
public class IOClass {
	public static void main(String[] args) {
		try {
			// writeByteToFile();
			 readByteToFile();

//			writeCharToFile();
//			readCharToFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writeByteToFile() throws IOException {
		String hello = new String("hello word!");
		byte[] byteArray = hello.getBytes();
		File file = new File("/D:/test.txt");
		// 因为是用字节流来写媒介，所以对应的是OutputStream
		// 又因为媒介对象是文件，所以用到子类是FileOutputStream
		OutputStream os = new FileOutputStream(file);
		os.write(byteArray);
		os.flush();
		os.close();
	}

	public static void readByteToFile() throws IOException {
		File file = new File("/D:/test.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		int size = (int) file.length();
		byte[] b = new byte[size];
		fileInputStream.read(b);
		System.out.println(new String(b));
		
//		StringBuilder sBuilder = new StringBuilder();
//		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(fileInputStream));
//		String string = null;
//		while ((string = bufferedReader.readLine()) != null) {
//			sBuilder.append(string);
//		}
//		System.out.println(sBuilder.toString());
	}

	public static void writeCharToFile() throws IOException {
		String hello = new String("hello word!!!!!!");
		File file = new File("/D:/test.txt");
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(hello);
		fileWriter.flush();
		fileWriter.write(hello);
		fileWriter.close();
	}

	public static void readCharToFile() throws IOException {
		File file = new File("/D:/test.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		StringBuilder sBuilder = new StringBuilder();
		String string = null;
		while ((string = reader.readLine()) != null) {
			sBuilder.append(string);
		}
		// char[] buffer=new char[8];
		// int l=-1;
		// while ((l = reader.read(buffer)) != -1) {
		// sBuilder.append(new String(buffer));
		// }
		System.out.println(sBuilder);
	}
}
