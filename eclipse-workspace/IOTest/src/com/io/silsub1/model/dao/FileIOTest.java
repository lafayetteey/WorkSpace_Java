package com.io.silsub1.model.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIOTest {
	
	public static void fileSave() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = null;
		
		try {
			System.out.print("파일명 입력 : ");
			String fileName = br.readLine();
			fw = new FileWriter(fileName);
			
			String answer = "";
			while(true) {
				if(! answer.equals("exit") ) {
					System.out.println("파일에 저장할 내용을 입력하세요 ");
					answer = br.readLine();
					fw.write(answer);
				} else {
					System.out.println("파일 저장 완료 . 시스템 종료");
					break;
				}
			} 
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
			try {
				br.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void fileRead() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileReader fr = null;
		
		System.out.println("읽을 파일명 입력 : ");
		try {
			String fileName = br.readLine();
			fr = new FileReader(fileName);
			int value = 0;
			StringBuilder sb = new StringBuilder();
			while((value = fr.read()) != -1) {
				sb.append((char)value);
			}
			String str = sb.toString();
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		fileSave();
	}
}	