package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void ownFlag() {
		StdDraw.setXscale(0,24);
		StdDraw.setYscale(0,16);
		
//		StdDraw.setPenColor(0,0,0);
//		StdDraw.filledRectangle(0,0,24,16);
//		StdDraw.setPenColor(255,255,255);
//		StdDraw.filledRectangle(1,1,23,15);
		
		StdDraw.setPenColor(51,153,255);
		StdDraw.filledRectangle(0, 0, 24, 16);
		
		StdDraw.setPenColor(255,0,255);
		StdDraw.filledRectangle(8, 0, 12, 16);
		
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledCircle(12,8,5);
	}
		
	public static void main(String[] args) {
		int canvasHeight = 512;
		int canvasWidth = 22 * canvasHeight / 16;
		StdDraw.setCanvasSize(canvasWidth, canvasHeight);
		
		ownFlag();
	}
}