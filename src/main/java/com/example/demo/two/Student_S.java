package com.example.demo.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class Student_S {
@Autowired
JdbcTemplate js;
	void med() {
		String sql="create table staff (id int, name varchar(10), salary int)";
		js.execute(sql);
	}
}
