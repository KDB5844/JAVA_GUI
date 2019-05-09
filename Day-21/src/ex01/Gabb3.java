package ex01;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class MFrame1 extends Frame implements ActionListener {

	public Button but1 = new Button("����");
	public Button but2 = new Button("����");
	public Button but3 = new Button("���ڱ�");
	public Button but4 = new Button("����");
	public Button but5 = new Button("�ٽ�");
	public Button but6 = new Button("����");
	Image img = Toolkit.getDefaultToolkit().getImage(
			"E:\\\\�ڹ�������\\\\Java\\\\work\\\\Day-21\\\\5.gif");
	private int win = 0, lose = 0, mu = 0;
	
	private Label msg2 = new Label(
			"        �޼���: �ָ�,����,���ڱ� Ű�� ��������                     ",
			Label.CENTER);

	class Exit extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(1);
		}
	}

	public void paint(Graphics g) {
		g.drawImage(img, 70, 100, 420, 250, this);
	}

	public MFrame1() {
		Exit ex = new Exit();
		addWindowListener(ex);

		setTitle("���� ���� �� ����");

		JPanel pan = new JPanel();
		JPanel pan2 = new JPanel();
		JPanel pan3 = new JPanel();
		JPanel pan4 = new JPanel();

		this.setBackground(Color.white);

		pan.setLayout(new FlowLayout());
		
		pan.setBackground(Color.yellow);
		pan4.add(pan);

		pan2.setLayout(new GridLayout(1, 1));
		pan2.add(msg2);
		pan2.setBackground(Color.white);
		pan4.add(pan2);

		add(pan4);

		pan3.add(but1);
		pan3.add(but2);
		pan3.add(but3);
		pan3.add(but4);
		pan3.add(but5);
		pan3.add(but6);
		add("South", pan3);


		setSize(600, 500);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
						
		setVisible(true);

	
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		but4.addActionListener(this);
		but5.addActionListener(this);
		but6.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
												
		int com = (int) (Math.random() * 3) + 1;
		repaint();
		if (com == 1)
			img = Toolkit.getDefaultToolkit().getImage("E:\\�ڹ�������\\Java\\work\\Day-21\\1.jpg");
		else if (com == 2)
			img = Toolkit.getDefaultToolkit().getImage("E:\\�ڹ�������\\Java\\work\\Day-21\\2.jpg");
		else
			img = Toolkit.getDefaultToolkit().getImage("E:\\�ڹ�������\\Java\\work\\Day-21\\3.jpg");
		

		
		if (ae.getSource() == but1) {
			switch (com) {
			case 1:
				Draw();
				mu++;
				break;
			case 2:
				Lose();
				lose++;
				break;
			case 3:
				Win();
				win++;
				break;
			}
		}
		if (ae.getSource() == but2) {
			switch (com) {
			case 1:
				Win();
				win++;
				break;
			case 2:
				Draw();
				mu++;
				break;
			case 3:
				Lose();
				lose++;
				break;
			}
		}
		if (ae.getSource() == but3) {
			switch (com) {
			case 1:
				Lose();
				lose++;
				break;
			case 2:
				Win();
				win++;
				break;
			case 3:
				Draw();
				mu++;
				break;
			}
		}

		if (ae.getSource() == but4) {
			msg2.setText("�� : " + win + " ��� : " + lose + " ������ : " + mu);
		}
		if (ae.getSource() == but5) {
			win = 0;
			lose = 0;
			mu = 0;
			img = Toolkit.getDefaultToolkit().getImage("E:\\�ڹ�������\\Java\\work\\Day-21\\5.gif");
			msg2.setText("�ٽ� ������������ �����մϴ�.");
			repaint();
		}
		if (ae.getSource() == but6) {
			System.exit(1);
		}
	}

	public void Win() { 
		msg2.setText("�̱�");
	}
	public void Lose() {
		msg2.setText("��");
	}
	public void Draw() {
		msg2.setText("���");
	}
}


public class Gabb3 {
	public static void main(String[] args) {
		MFrame1 mf = new MFrame1();
	}
}

