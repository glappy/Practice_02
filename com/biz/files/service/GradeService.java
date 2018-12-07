package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.files.vo.GradeVO;

public class GradeService {
	List<String> strNumList;
	List<GradeVO> gradeList;
	String strFileName;
	String file = "src/com/biz/files/service/우리말이름.txt";

	public GradeService(String file) {
		gradeList = new ArrayList();
		strNumList = new ArrayList();
	}

	public void readFile() {
		FileReader fr;
		BufferedReader buffer;
		try {
			fr = new FileReader(file);
			buffer = new BufferedReader(fr);

			while (true) {

				String fileName = buffer.readLine();
				if (fileName == null)
					break;
				String[] name = fileName.split(":");
				GradeVO vo = new GradeVO();
				vo.setStrName(name[0]);
			}
			buffer.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void makeNum() {
		int intNumLen = strNumList.size();

		for (int i = 0; i < intNumLen; i++) {
			strNumList.add("" + (i + 1));
		}
	}

	public void addNum() {
		int strLen = strNumList.size();
		for (int i = 0; i < strLen; i++) {
			GradeVO vo = gradeList.get(i);
			String strNum = strNumList.get(i);
			vo.setStrNum(strNum);

			gradeList.get(i).setStrNum(strNumList.get(i));

		}
	}
	public void makeScore() {
	for(GradeVO vo: gradeList) {
			
			int intKor = (int)(Math.random()*(100-50+1)) + 50;
			int intEng = (int)(Math.random()*(100-50+1)) + 50;
			int intMath = (int)(Math.random()*(100-50+1)) + 50;
			vo.setIntKor(intKor);
			vo.setIntKor(intEng);
			vo.setIntKor(intMath);
			
		}}
	public void view() {
	

		System.out.println("---------------------------------------");
		System.out.println("학번\t이름\t국어점수\t영어점수\t수학점수\t합계\t평균");
		System.out.println("---------------------------------------");
		
		
		for (GradeVO vo : gradeList) {
			System.out.print(vo.getStrNum() + "\t\t");
			System.out.print(vo.getStrName() + "\t\t");
			System.out.print(vo.getIntKor() + "\t\t");
			System.out.print(vo.getIntEng() + "\t\t");
			System.out.print(vo.getIntMath() + "\t\t");
			System.out.print(vo.getIntSum() + "\t\t");
			System.out.print(vo.getFloatAvg() + "\t\t");

		}

	}
	

}