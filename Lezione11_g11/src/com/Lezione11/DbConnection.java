package com.Lezione11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class DbConnection {

	String url = "jdbc:postgresql://localhost:5432/";
    String dbName = "Esercizio_g2";
    String user = "postgres";
    String pass = "root";
    Statement st;
    
    public DbConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url + dbName, user, pass);
		st = conn.createStatement(); 
		createTableStudenti();
		System.out.println("DB Connect!!!");
    }
    private void createTableStudenti() throws SQLException {
    	String sql =  " CREATE TABLE IF NOT EXISTS students ("
				+ "		id SERIAL,"
				+ " 	name VARCHAR NOT NULL,"
				+ "		lastname VARCHAR NOT NULL,"
				+ "		gender VARCHAR NOT NULL,"
				+ "		birthdate DATE NOT NULL,"
				+ "		avg DECIMAL NOT NULL,"
				+ "		min_vote DECIMAL NOT NULL,"
				+ "		max_vote DECIMAL NOT NULL"
				+ " );" ;
	st.executeUpdate(sql);
	System.out.println("Table students created!!!");
    }
    
    public void insertStudent(Student s) throws SQLException {
		String sql = " INSERT INTO students (name, lastname, gender, birthdate, avg, min_vote, max_vote) "
				   + "VALUES ('"+s.getName()+"', '"+s.getLastname()+"', '"
				   + s.getGender()+"', '"+s.getBirthdate()+"', '"+ s.getAvg()+"', '"+ s.getMin_vote()+"','"+s.getMax_vote()+"');";
		st.executeUpdate(sql);
		System.out.println(s.getName() + " " + s.getLastname() + " created!!!");
	}
    
    public Student getStudentdById(long id) throws SQLException {
    	String sql = "SELECT * FROM students WHERE id = " + id;
    	ResultSet rs = st.executeQuery(sql); // Eseguo la query di ricerca e mi salvo il risultato in un ogg di tipo ResultSet
    	Student s = null;
    	// Controllo se è presente un valore nel ResultSet che mi retituisce il db
    	// ciò che può contenere il ResultSet è null oppure un ogg Utente
    	if(rs.next()) {
    		Long studentId = rs.getLong("id");
    		String name = rs.getString("name");
    		String lastname = rs.getString("lastname");
    		Character gender = rs.getString("gender").charAt(0);
    		LocalDate birthdate = rs.getDate("birthdate").toLocalDate();
    		Double avg = rs.getDouble("avg");
    		Double min_vote = rs.getDouble("min_vote");
    		Double max_vote = rs.getDouble("max_vote");
    		s = new Student(studentId, name, lastname, gender, birthdate, avg, min_vote, max_vote);
    	}
    	return s;
}
}
