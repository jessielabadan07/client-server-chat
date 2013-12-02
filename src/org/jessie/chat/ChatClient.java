package org.jessie.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class ChatClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Throwable
	{
		Socket s = new Socket("127.0.0.1", 4321);
		
		BufferedReader input = 
				new BufferedReader(new InputStreamReader(s.getInputStream()));
		Writer output = new OutputStreamWriter(s.getOutputStream());
		
		ChatUI theUI = new ChatUI("Client End", output);
		
		String line;
		while ((line = input.readLine()) != null) {
			theUI.appendText(line);
		}
		theUI.appendText("Connection lost");
	}

}
