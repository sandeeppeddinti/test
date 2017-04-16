package com.practice.oops.inheritance.overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Square extends Shape {

	int area()  {
		int a = 2;
		int b = 4 * a * a;
		return b;

	}

}
