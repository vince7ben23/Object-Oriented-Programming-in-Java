package testgui;

import processing.core.PApplet;

public class SmileFace extends PApplet {
	public void setup() {
		size(600, 600);
		background(230);
		
	}
	
	public void draw() {
		fill(255, 255, 0);
		ellipse(300, 300, 200, 200);
		
		fill(0, 0, 0);
		ellipse(250, 275, 25, 50);
		ellipse(350, 275, 25, 50);
		arc(300, 350, 120, 50, 0, PI);
		
		fill(100, 100, 100);
		ellipse(300, 475, 200, 50);
		stroke(100, 100, 100);
		
	}
}
