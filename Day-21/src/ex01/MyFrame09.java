package ex01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.*;

public class MyFrame09 extends Frame {
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	
	//�� �Ʒ��� ������Ʈ ��ü ����
	
	private void init() {
		//������Ʈ ��� 
	}
	private void eventInit() {
		//�̺�Ʈ ���
	}
	
	public MyFrame09(String t, int w, int h) {
		super(t);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image img = tk.getImage("aaa.gif");
		this.setIconImage(img);
		size.width = w;
		size.height = h;
		setSize(size);
		loc.x = (screenSize.width/2) - (getWidth()/2);
		loc.y = (screenSize.height/2) - (getHeight()/2);
		setLocation(loc);
		setResizable(false);
		
		init();
		eventInit();
	}
	public static void main(String[] args) {
		MyFrame09 f = new MyFrame09("�����",400,500);
		f.setVisible(true);
	}
}
