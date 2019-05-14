package de.mhaeusser.misc;

import org.junit.Test;

public class StringTest {

	@Test
	public void stringValueOfTest() {
		System.out.println(1);
		System.out.println(String.valueOf(""));
		System.out.println(2);
		System.out.println(String.valueOf((Object) null));
		System.out.println(3);
		System.out.println(String.valueOf(null)); // goes to valueOf(char data[]) 
		System.out.println(4);
	}
	
    public static void changeString(String string) {
        string = "changed";
	}

    public static void main(String[] args) {
        String string = "string";
        changeString(string);
        System.out.println(string);
    }
}
