package ex01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import java.awt.*;

public class MyFrame01 extends Frame{
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	GridLayout g1 = new GridLayout(12,1);
	
	
	//�� �Ʒ��� ������Ʈ ��ü ����
	
	public class WindowExit extends WindowAdapter { //���� 
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
	}
	
	class ButtonListener implements ActionListener{
		Frame frame;
		public ButtonListener(Frame f) {
			frame=f;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			System.out.println(command+"��ư�� ������.");
			
			if(command.equals("�Ķ�")){
				frame.setBackground(Color.blue);
				JOptionPane.showMessageDialog(frame, "�Ķ��� �Դϴ�.");
			}else if(command.equals("����")){
				frame.setBackground(Color.red);
				JOptionPane.showMessageDialog(frame, "������ �Դϴ�.");
			}else if(command.equals("�ʷ�")){
				frame.setBackground(Color.green);
				JOptionPane.showMessageDialog(frame, "�ʷϻ� �Դϴ�.");
			}else if(command.equals("���")){
				frame.setBackground(Color.yellow);
				JOptionPane.showMessageDialog(frame, "����� �Դϴ�.");
			}else if(command.equals("����")){
				frame.setBackground(Color.black);
				JOptionPane.showMessageDialog(frame, "������ �Դϴ�.");
			}else if(command.equals("�ϴ�")){
				frame.setBackground(Color.cyan);
				JOptionPane.showMessageDialog(frame, "�ϴû� �Դϴ�.");
			}
		}
	}
	ButtonListener btnListener = new ButtonListener(this);
	private void init() {
		Button bt1 = new Button("�Ķ�");
		Button bt2 = new Button("����");
		Button bt3 = new Button("�ʷ�");
		Button bt4 = new Button("���");
		Button bt5 = new Button("����");
		Button bt6 = new Button("�ϴ�");
		//������Ʈ ��� 
		setLayout(g1);
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		this.add(bt6);
		this.addWindowListener(new WindowExit()); //����
		bt1.addActionListener(btnListener);
		bt2.addActionListener(btnListener);
		bt3.addActionListener(btnListener);
		bt4.addActionListener(btnListener);
		bt5.addActionListener(btnListener);
		bt6.addActionListener(btnListener);
	}
	private void eventInit() {
		
		
		//�̺�Ʈ ���
	}
	
	public MyFrame01(String t, int w, int h) {
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
		MyFrame01 f = new MyFrame01("�����",400,500);
		f.setVisible(true);
		
	}
	
}
