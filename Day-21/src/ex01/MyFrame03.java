package ex01;

import java.awt.*;

public class MyFrame03 extends Frame {
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	
	//�� �Ʒ��� ������Ʈ ��ü ����
	private Button bt1 = new Button("��");
	private Button bt2 = new Button("��");
	private Button bt3 = new Button("��");
	private Button bt4 = new Button("��");
	private Button bt5 = new Button("��");
	private Panel pn1 = new Panel();
	private void init() {
		//������Ʈ ��� 
		pn1.add(bt1);
		pn1.add(bt2);
		pn1.setLayout(new GridLayout(1,2));
		pn1.add(bt3);
		pn1.add(bt4);
		pn1.add(bt5);
		
		//Panel�� default ���̾ƿ��� FlowLayout�̴�.
		this.add(pn1,BorderLayout.SOUTH);
	}
	private void eventInit() {
		//�̺�Ʈ ���
	}
	
	public MyFrame03(String t, int w, int h) {
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
		MyFrame03 f = new MyFrame03("�����",400,500);
		f.setVisible(true);
	}
}
