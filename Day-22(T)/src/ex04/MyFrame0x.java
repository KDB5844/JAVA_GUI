package ex04;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import ex01.MyFrame0x.WindowExit;

/*
 * �͸�(��ø)Ŭ������ �����Ͽ� �̺�Ʈ�� ����ϴ� ���
 */

class MyActionListener implements ActionListener{
	private Label lb = null;
	
	public MyActionListener(Label lb) {
		this.lb = lb;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		Button bt = (Button)arg0.getSource();
		//arg0.getSource() �̺�Ʈ�� �߻��� ������Ʈ ������ ��ȯ�ϴ� �޼���
		//�ٿ�ĳ�����ؼ� �ش� ������Ʈ�� ����� Ȱ���� �� �ִ�.
		System.out.println(bt.getLabel());
		if(bt.getLabel().equals("apple")) {
			lb.setText("���");
		}else if(bt.getLabel().equals("banana")) {
			lb.setText("�ٳ���");
		}else if(bt.getLabel().equals("bea")) {
			lb.setText("��");
		}
	}
	
}
public class MyFrame0x extends Frame{
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	
	
	//�� �Ʒ��� ������Ʈ ��ü ����
	
	private Button bt = new Button("���ÿϷ�");
	private Label lb = new Label("���� �� ��ư Ŭ��",Label.CENTER);
	 
    Checkbox apple = new Checkbox("���"); 
    Checkbox bea = new Checkbox("��");
    Checkbox banana = new Checkbox("�ٳ���");
	
	private Panel p = new Panel();
	private GridLayout gl1 = new GridLayout();
	
	private void init() {
		//������Ʈ ���
		
		
		this.add(bt);
		this.add(lb, BorderLayout.SOUTH);
		p.add(apple); p.add(bea); p.add(banana);
		this.add(p, BorderLayout.NORTH);
		
	}
	private void eventInit() {
		
		bt.addActionListener(new MyActionListener(lb));//��ư�� �̺�Ʈ�� ���!
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
		
		init();	//������Ʈ�� �ʱ�ȭ �ϴ� �޼���
		eventInit();	//�̺�Ʈ�� ����ϴ� �޼���
	}
	
	public static void main(String[] args) {
		MyFrame0x f = new MyFrame0x("����", 400, 250);
		f.setVisible(true);
	}
}
