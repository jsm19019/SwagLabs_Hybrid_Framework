package Utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomString {

	public String randomstring() {
		try {
			String randomString = RandomStringUtils.randomAlphabetic(5, 5);
			return randomString;
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	public static void main(String args[])
	{
		GenerateRandomString obj = new GenerateRandomString();
		String name = obj.randomstring();
		System.out.println(name);		
	}
}
