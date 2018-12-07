package com.biz.files;

import com.biz.files.service.UserSe03;

public class FileExec021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String readFile = "src/com/biz/files/우리말이름.txt";
		UserSe03 s = new UserSe03(readFile);
		s.readFile();
	}

}