package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Point;
import com.hw2.model.vo.Ractangle;

public class Run {

	public static void main(String[] args) {
		
		
		Circle[] c = new Circle[2];
		c[0] = new Circle(1,2,3);
		c[1] = new Circle(3,3,4);
		
		Ractangle[] r = new Ractangle[2];
		r[0] = new Ractangle(-1,-2,5,2);
		r[1] = new Ractangle(-2,5,2,8);
		
		for(int i =0; i<c.length; i++) {
			c[i].draw();
		}
		
		for(int i =0; i<r.length; i++) {
			r[i].draw();
		}
	}

}
