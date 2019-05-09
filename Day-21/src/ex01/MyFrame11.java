package ex01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;

public class MyFrame11 extends Frame {
	void WindowExample(){  
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	
	//�� �Ʒ��� ������Ʈ ��ü ����
	private Label fri_lb = new Label("�����ϴ� ������?");
	private Checkbox a_cb = new Checkbox("�ٳ���");//�ڽ���ư ����
	private Checkbox b_cb = new Checkbox("����");
	private Checkbox c_cb = new Checkbox("���ξ���");
	
	private Label sex_b = new Label("����� ������?");
	private CheckboxGroup cg = new CheckboxGroup(); //������ư ����
	private Checkbox man_cb = new Checkbox("����",cg, true);
	private Checkbox woman_cb = new Checkbox("����",cg,false);
	
	private GridLayout gl = new GridLayout(4,1);
	
	private Panel p = new Panel();
	private GridLayout gl1 = new GridLayout(1,3);
	
	private Panel p1 = new Panel();
	private GridLayout gl2 = new GridLayout(1,2);
	private void init() {
		this.setLayout(gl1);
		this.add(fri_lb);
		
		p.setLayout(gl1);
		p.add(a_cb);p.add(b_cb);p.add(c_cb);
		
		this.add(p);
		this.add(sex_b);
		
		p1.setLayout(gl2);
		p1.add(man_cb);	p1.add(woman_cb);
		
		this.add(p1);
		//������Ʈ ��� 
	}
	private void eventInit() {
		//�̺�Ʈ ���
	}
	
	public MyFrame11(String t, int w, int h) {
		super(t);
		size.width = w;
		size.height = h;
		super.setSize(800,800);
		loc.x = (screenSize.width/2) - (getWidth()/2);
		loc.y = (screenSize.height/2) - (getHeight()/2);
		setLocation(loc);
		setResizable(false);
		
		init();
		eventInit();
	}
	public static void main(String[] args) {
		MyFrame11 f = new MyFrame11("�����",400,500);
		
		f.setVisible(true);
	}
}
