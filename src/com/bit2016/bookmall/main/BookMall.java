package com.bit2016.bookmall.main;

import java.util.List;

import com.bit2015.bookmall.dao.CategoryDao;
import com.bit2016.bookmall.vo.CategoryVo;

public class BookMall {

	public static void main(String[] args) {
		
		//각각 dao 를 생성해서 list
		
		CategoryDao dao = new CategoryDao();
		List<CategoryVo> list = dao.getList();
		for(CategoryVo vo : list){
			System.out.println(vo);
		}
	}

}
