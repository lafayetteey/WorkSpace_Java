package com.io.silsub1.model.dao;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIOTest {

	public static void main(String[] args) {
		fileSave();
	}

	public static void fileSave() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw =null;

		try {
			System.out.println("파일명을 입력해주세요 : ");
			String fileName = br.readLine();
			fw = new FileWriter(fileName);
			
			String answer = "";
			while(true) {
				if(! answer.equals("exit")) {
					System.out.println("파일에 저장할 내용을 입력해주세요 : ");
					answer = br.readLine();
					fw.write(answer);
				} else {
					System.out.println("파일에 정상적으로 저장되었습니다.");
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
