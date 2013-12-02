package org.jessie.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestIt {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		BufferedReader keyboard = 
				new BufferedReader(new InputStreamReader(System.in));
		ChatUI theUI = new ChatUI("Window Title", new OutputStreamWriter(System.out));
		String line;
		while(( line = keyboard.readLine()) != null) {
			theUI.appendText(line);
		}
	}

}
