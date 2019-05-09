package ex01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import ex01.Grade.WindowExit;

import java.awt.*;
import java.awt.*;

class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("��ư �̺�Ʈ �߻�!");
		
	}
	
}

class MyMouseListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Clicked");
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Entered");
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Exited");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Pressed");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Released");
	}
	
}

public class MyFrame0x extends Frame{
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	
	//�� �Ʒ��� ������Ʈ ��ü ����
	Button bt1 = new Button("bt1");
	Button bt2 = new Button("bt2");
	
	public class WindowExit extends WindowAdapter { //���� 
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
	}
	private void init() {
		this.add(bt1,"Center");
		this.add(bt2,"North");
		
		//������Ʈ ��� 
		
	}
	private void eventInit() {
		System.out.println("bt1��ü : "+bt1);
		bt1.addActionListener(new MyActionListener());	//��ư�� �̺�Ʈ�� ���!
		bt2.addMouseListener(new MyMouseListener());	//��ư�� �̺�Ʈ�� ���!
		this.addWindowListener(new WindowExit()); //����
		
		//�̺�Ʈ ���
	}
	
	public MyFrame0x(String t, int w, int h) {
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
		MyFrame0x f = new MyFrame0x("�����",400,500);
		f.setVisible(true);
		
	}
}
