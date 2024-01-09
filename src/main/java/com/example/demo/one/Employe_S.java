package com.example.demo.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class Employe_S {
	
	
//insert
	

		
	@Autowired
	NamedParameterJdbcTemplate njs;
	
	public int insertdata(Employe_P p3) {
	MapSqlParameterSource param =new MapSqlParameterSource()
	.addValue("id", p3.getId())
	.addValue("name", p3.getEname())
	.addValue("salary", p3.getSal())
	.addValue("joindate", p3.getHiredate());
	String sql="insert into employe values(:id,:name,:salary,:joindate)";

	return njs.update(sql, param);

	}

	
	
	
//update
	
//	@Autowired
//	JdbcTemplate e1;
//	
//	@Autowired
//	NamedParameterJdbcTemplate ne1;
//	
//	public int update(Employe_P ep) {
//	MapSqlParameterSource param =new MapSqlParameterSource()
//	.addValue("id", ep.getId())
//	.addValue("name", ep.getEname())
//	.addValue("sal", ep.getSal());
//	String sql="update employe set ename=:name, sal=:sal where id=5961";
//
//	return ne1.update(sql, param);


//}
	

	
	
//delete

//	@Autowired
//	JdbcTemplate e2;
//	
//	@Autowired
//	NamedParameterJdbcTemplate ne2;
//	
//	public int delete(Employe_P ep1) {
//	MapSqlParameterSource param =new MapSqlParameterSource()
//	.addValue("id", ep1.getId());
//	.addValue("name", ep1.getEname())
//	.addValue("sal", ep1.getSal());
//	String sql="delete from employe where id=86";
//
//	return ne2.update(sql, param);


//}

	
}
