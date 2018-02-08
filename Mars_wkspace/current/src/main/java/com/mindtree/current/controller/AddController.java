package com.mindtree.current.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AddController {
	
	ArrayList<Integer> list = new ArrayList<>();

	
	@RequestMapping("/add")
	public ArrayList<Integer> add() {
		list.add(1);
		list.add(2);
		list.add(3);
		//System.out.println("u r here");
		return list;
		
	}

}
