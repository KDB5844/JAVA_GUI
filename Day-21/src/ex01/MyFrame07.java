package ex01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.*;

public class MyFrame07 extends Frame {
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
		
	
	
	//�� �Ʒ��� ������Ʈ ��ü ����
	private void init() {
		Color cc = new Color(58, 110, 165);
		Color cc1 = new Color(0,0,0);
		Color cc2 = new Color(255,0,0);
		Button bt = new Button("Ȯ��");
		GridBagLayout gbl = new GridBagLayout();
		this.setBackground(cc);
		this.setLayout(gbl);
		
		bt.setBackground(cc1);
		bt.setForeground(cc2);
		
		this.add(bt);
		//������Ʈ ��� 
	}
	private void eventInit() {
		//�̺�Ʈ ���
	}
	
	public MyFrame07(String t, int w, int h) {
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
		MyFrame07 f = new MyFrame07("�����",400,500);
		f.setVisible(true);
	}
}
