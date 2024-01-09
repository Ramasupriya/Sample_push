package com.example.demo.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student_C {
@Autowired
Student_S sobj;

@PostMapping("/hlo")
String m() {
	String s=" ";
	sobj.med();
	s="database created";
	
	return s;
}
}
