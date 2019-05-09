package ex01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;



import java.awt.*;


public class MyFrame0 extends Frame implements ActionListener{
	Dimension screenSize = 
			Toolkit.getDefaultToolkit().getScreenSize();
	Dimension size = new Dimension();
	Point loc = new Point();
	
	//�� �Ʒ��� ������Ʈ ��ü ����
	Button bt1 = new Button("���� �Ϸ�");
	Checkbox c1 = new Checkbox("���");
	Checkbox c2 = new Checkbox("��");
	Checkbox c3 = new Checkbox("�ٳ���");
	private Label lb = new Label("���� �� ��ư Ŭ��",Label.CENTER);
	private GridLayout gl1 = new GridLayout(3,1);
	Panel p = new Panel(); 
	public class WindowExit extends WindowAdapter { //���� 
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
	}
	private void init() {
		setLayout(gl1);
		p.add(c1);
		p.add(c2);
		p.add(c3);
		this.add(p,"North");
		this.add(bt1,"Center");
		this.add(lb,"South");
				
		//������Ʈ ��� 
		this.addWindowListener(new WindowExit()); //����
	}
	private void eventInit() {
		//�̺�Ʈ ���
		bt1.addActionListener(this);
		
	}
	
	public MyFrame0(String t, int w, int h) {
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
		MyFrame0 f = new MyFrame0("�����",350,300);
		f.setVisible(true);
		
	}

		

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals("���")) {
			JOptionPane.showMessageDialog(this, "���");
		}else if(c2.equals("��")){
			JOptionPane.showMessageDialog(this, "��");
		}else if(c3.equals("�ٳ���")){
			JOptionPane.showMessageDialog(this, "�ٳ���");
		}else if(c1.equals("���") && c2.equals("��")){
			JOptionPane.showMessageDialog(this, "���  ��");
		}else if(c1.equals("���") && c3.equals("�ٳ���")){
			JOptionPane.showMessageDialog(this, "���  �ٳ���");
		}else if(c2.equals("��") && c3.equals("�ٳ���")){
			JOptionPane.showMessageDialog(this, "��  �ٳ���");
		}else {
			JOptionPane.showMessageDialog(this, "�ƹ��͵�");
		}
		
	}
}
