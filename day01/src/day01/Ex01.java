package day01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;

public class Ex01 {
	public static void main(String[] args) {
		Frame f = new Frame();
		Dimension screenSize = 
				Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(screenSize);
		Dimension size = new Dimension();
		size.width = 400;
		size.height = 500;
		f.setSize(size);
		Point loc = new Point();
		
		loc.x = (screenSize.width/2) - (f.getWidth()/2);
		loc.y = (screenSize.height/2) - (f.getHeight()/2);
		
		f.setLocation(loc);
		f.setResizable(false);
		f.setVisible(true);
	}
}
