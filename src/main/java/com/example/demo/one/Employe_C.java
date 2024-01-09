package com.example.demo.one;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Employe_C {
	
	
	
//insert
	
	@Autowired
	Employe_S s3;

	@PostMapping("/emp-ni")
	public Map insertdata(@RequestBody Employe_P p3) {
	Map <String,String> data =new HashMap<String,String>();
	try {
	int response=s3.insertdata(p3);

	if(response>0)
	data.put("1", "Data inserted");
	else
	data.put("2", "Data not inserted");
	}
	catch (Exception e) {
	data.put("3", e.toString());
	}
	return data;

	}

	
	
	
//Update
	
	
//	@Autowired
//	Employe_S c;
//
//	@PostMapping("/emp-ud")
//	public Map update(@RequestBody Employe_P u) {
//	Map <String,String> data =new HashMap<String,String>();
//	try {
//	int response=c.update(u);
//
//	if(response>0)
//	data.put("1", "Data inserted");
//	else
//	data.put("2", "Data not inserted");
//	}
//	catch (Exception e) {
//	data.put("3", e.toString());
//	}
//	return data;
//
//	}
//	
//	
	
//Delete
	
	
//			@Autowired
//		Employe_S c1;
//
//		@PostMapping("/emp-dd")
//		public Map delete(@RequestBody Employe_P u) {
//		Map <String,String> data =new HashMap<String,String>();
//		try {
//		int response=c1.delete(u);
//
//		if(response>0)
//		data.put("1", "Data inserted");
//		else
//		data.put("2", "Data not inserted");
//		}
//		catch (Exception e) {
//		data.put("3", e.toString());
//		}
//		return data;
//
//		}


	} 





