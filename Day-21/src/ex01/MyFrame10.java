package ex01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.*;

public class MyFrame10 extends Frame {
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	
	//�� �Ʒ��� ������Ʈ ��ü ����
	private Label lb = new Label("��ȭ�� ����",Label.CENTER);
	private Button[] bt = new Button[12];
	private String[] str = new String[] {"*","0","#"};
	
	private BorderLayout bl = new BorderLayout(10,10);
	private Panel p = new Panel();
	private GridLayout gl = new GridLayout(4,3,5,5);
	
	private void init() {
		//������Ʈ ��� 
		this.setLayout(bl);
		this.add("North",lb);
		
		p.setLayout(gl);
		for(int i = 0; i < bt.length; ++i) {
			if(i >= 9) {
				bt[i] = new Button(str[i - 9]);
			}
			else {
				bt[i] = new Button(String.valueOf(i + 1));
			}
			p.add(bt[i]);
		}
		this.add("Center",p);
	}
	private void eventInit() {
		//�̺�Ʈ ���
	}
	
	public MyFrame10(String t, int w, int h) {
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
		MyFrame10 f = new MyFrame10("�����",400,500);
		f.setVisible(true);
	}
}
