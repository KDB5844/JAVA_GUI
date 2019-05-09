package ex01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;

public class MyFrame2 extends Frame{
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	
	//�� �Ʒ��� ������Ʈ ��ü ����
	
	public class WindowExit extends WindowAdapter { //���� 
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
	}
	private void init() {
		
		//������Ʈ ��� 
		this.addWindowListener(new WindowExit()); //����
	}
	private void eventInit() {
		//�̺�Ʈ ���
	}
	
	public MyFrame2(String t, int w, int h) {
		super(t);
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
		MyFrame2 f = new MyFrame2("�����",400,500);
		f.setVisible(true);
		
	}
}
