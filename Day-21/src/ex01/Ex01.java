package ex01;

import java.awt.*;
import java.awt.Event;


public class Ex01 {
	public static void main(String[] args){
		Frame f = new Frame("�����");
		Dimension screenSize = 
				Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(screenSize);
		Dimension size = new Dimension();
		size.height = 400;
		size.width = 300;
		f.setSize(size);
		f.setResizable(false);
		Point loc = new Point();
		loc.x = screenSize.width / 2 - f.getWidth()/2;
		loc.y = screenSize.height / 2 - f.getWidth()/2;
		f.setLocation(loc);
		
		f.setVisible(true); //���� �������� ����
	}
}


