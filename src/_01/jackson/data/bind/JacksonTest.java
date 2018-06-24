package _01.jackson.data.bind;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTest {
	
	public static void main(String[] args) {
		
		liteJsonExample();
		
		fullJsonExample();
		
	}
	
	public static void liteJsonExample() {
		
		try {
			// create an object mapper
			
			ObjectMapper objectMapper = new ObjectMapper();
			
			// read JSON file and convert to Java POJO : data/sample-lite.json
			Student theStudent = objectMapper.readValue(new File("data/sample-lite.json"), Student.class);
			
			// print the Java POJO
			System.out.println(theStudent);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void fullJsonExample() {
		
		try {
			// create an object mapper
			
			ObjectMapper objectMapper = new ObjectMapper();
			
			// read JSON file and convert to Java POJO : data/sample-lite.json
			Student theStudent = objectMapper.readValue(new File("data/sample-full.json"), Student.class);
			
			// print the Java POJO
			System.out.println(theStudent);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
