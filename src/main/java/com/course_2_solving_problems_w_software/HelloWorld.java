package com.course_2_solving_problems_w_software;

import edu.duke.FileResource;

public class HelloWorld {
	public void runHello () {
		FileResource res = new FileResource("course_2_solving_problems_w_software/perimeter/hello_unicode.txt");
		for (String line : res.lines()) {
			System.out.println(line);
		}
	}

	public static void main(String[] args) {
		var myHelloWorld = new HelloWorld();
		myHelloWorld.runHello();
	}
}
