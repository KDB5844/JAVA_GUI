package ex01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.*;

public class MyFrame08 extends Frame {
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	
	//�� �Ʒ��� ������Ʈ ��ü ����
	private Button bt = new Button("Ȯ��");
	private GridBagLayout gbl = new GridBagLayout();
	private Font font = new Font("����ü",Font.ITALIC,20);
	
	private void init() {
		this.setLayout(gbl);
		bt.setFont(font);
		this.add(bt);
		//������Ʈ ��� 
	}
	private void eventInit() {
		//�̺�Ʈ ���
		 }


	


	public MyFrame08(String t, int w, int h) {
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
		MyFrame08 f = new MyFrame08("�����",400,500);
		f.setVisible(true);
	}
}
