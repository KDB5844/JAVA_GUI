package ex01;

import java.awt.*;
import java.awt.event.*;

class Exec_02_sub extends Frame implements ActionListener{
	private BorderLayout bl = new BorderLayout();//전체화면
	private Button jbt1 = new Button("주먹");
	private Button jbt2 = new Button("가위");
	private Button jbt3 = new Button("보자기");
	private Button jbt4 = new Button("전적");
	private Button jbt5 = new Button("다시");
	private Button jbt6 = new Button("종료");
	Image img = Toolkit.getDefaultToolkit().getImage("C:\\fastrcp.gif");
	
	private int[] result = new int[3];
	private Label lb = new Label("메세지 : 주먹,가위,보자기 키를 누르세요" );
	private Panel jp1 = new Panel();
	private Panel jp2 = new Panel();
	//private Panel jp3 = new Panel();
	
	private GridLayout gl1 = new GridLayout(6,1,10,10);
	
	public Exec_02_sub(String title) {
		super(title);
		
		this.init();
		this.start();
		
		super.setSize(600,400);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension f1 = super.getSize();
		int xpos = (int)(screen.height/2 - f1.height/2);
		int ypos = (int)(screen.width/2 - f1.width/2);
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		super.setVisible(true);
	}
	public void paint(Graphics g) {
		g.drawImage(img, 70, 100, 420, 250, this);
	}
	
	public void init(){
		this.setLayout(bl);
		this.add("North", jp1);
		jp1.add(lb);
		this.add("East", jp2);
		jp2.setLayout(gl1);
		jp2.add(jbt1);
		jp2.add(jbt2);
		jp2.add(jbt3);
		jp2.add(jbt4);
		jp2.add(jbt5);
		jp2.add(jbt6);
	}

	public void start(){
		jbt1.addActionListener(this);
		jbt2.addActionListener(this);
		jbt3.addActionListener(this);
		jbt4.addActionListener(this);
		jbt5.addActionListener(this);
		jbt6.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int x = (int)(Math.random()*3)+1;
		if (x == 1) img = Toolkit.getDefaultToolkit().getImage("C:\\r.jpg");
		else if (x == 2) img = Toolkit.getDefaultToolkit().getImage("C:\\c.jpg");
		else img = Toolkit.getDefaultToolkit().getImage("C:\\p.jpg");
		repaint();

		if(e.getSource() == jbt1) {
			if (x == 1) {
				lb.setText("메세지 : 비겼습니다.");
				++result[1];
			}
			else if (x==2) {
				lb.setText("메세지 : 이겼습니다.");
				++result[0];
			}
			else {
				lb.setText("메세지 : 지셨습니다.");
				++result[2];
			}
			
		}else if (e.getSource() == jbt2) {
			if (x == 2) {
				lb.setText("메세지 : 비겼습니다.");
				++result[1];
			}
			else if (x==3) {
				lb.setText("메세지 : 이겼습니다.");
				++result[0];
			}
			else {
				lb.setText("메세지 : 지셨습니다.");
				++result[2];
			}
			
		}else if (e.getSource() == jbt3) {
			if (x == 3) { 
				lb.setText("메세지 : 비겼습니다.");
				++result[1];
			}
			else if (x==1) {
				lb.setText("메세지 : 이겼습니다.");
				++result[0];
			}
			else {
				lb.setText("메세지 : 지셨습니다.");
				++result[2];
			}
			
		}else if (e.getSource() == jbt4) {
			lb.setText("메세지 : 승리 : " + result[0] + 
								"무승부 : " + result[1] + "패배 : " + result[2]);

		}else if (e.getSource() == jbt5) {
			img = Toolkit.getDefaultToolkit().getImage("C:\\fastrcp.gif");
			lb.setText("메세지 : 주먹,가위,보자기 키를 누르세요");
			repaint();
		}else if (e.getSource() == jbt6) {
			System.exit(0);
		}
	}

}

public class GabbTest {
	public static void main(String[] ar) {
		Exec_02_sub ex = new Exec_02_sub("가위 바위 보 게임");
	}
}