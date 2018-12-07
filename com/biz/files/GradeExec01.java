package com.biz.files;

import com.biz.files.service.GradeService;
import com.biz.files.vo.GradeVO;

public class GradeExec01 {

	public static void main(String[] args) {
		String fileName = "src/com/biz/files/service/우리말이름.txt";
		GradeService gs = new GradeService(fileName);

		gs.addNum();
		gs.makeNum();
		gs.readFile();
		gs.view();

		
	}

}
