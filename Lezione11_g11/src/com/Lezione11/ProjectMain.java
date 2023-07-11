package com.Lezione11;

import java.sql.SQLException;
import java.time.LocalDate;


public class ProjectMain {

	public static void main(String[] args) {
		try {
			DbConnection db = new DbConnection();
			Student s = new Student("Andrea","Bardons",Gender.MALE,LocalDate.of(1988,11,21),7,6,8);
			db.insertStudent(s);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
}
