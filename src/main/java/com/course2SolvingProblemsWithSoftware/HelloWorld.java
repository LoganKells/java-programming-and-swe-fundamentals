package com.course2SolvingProblemsWithSoftware;

import edu.duke.FileResource;

public class HelloWorld {
	public void runHello () {
		FileResource res = new FileResource("hello_unicode.txt");
		for (String line : res.lines()) {
			System.out.println(line);
		}
	}

	public static void main(String[] args) {
		var myHelloWorld = new HelloWorld();
		myHelloWorld.runHello();
	}
}