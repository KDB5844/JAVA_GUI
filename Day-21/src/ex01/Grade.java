package ex01;


import java.awt.*;
import java.awt.event.*;
 
public class Grade extends Frame implements ActionListener {
 
    private static final long serialVersionUID = 1L; // ��Ŭ������ �ڵ������� �ø��� ����
 
    // �ʵ� ���� ����
    int k;
    int e;
    int m;
    String g;
    int avg1 = (k+e+m)/3;
    Button bt1, bt2;
    TextField tf1, tf2, tf3, tf4;
    Label label_g1, label_g2, label_kor, label_math, label_eng, label_math2, label_sum, label_avg, label_grade, label1, label2, label3;
    Panel p1, p2;
 
    // �����ؼ� ȭ���� ������ �� ȭ���� ���׸� Ű�� ������.
    // Grade Ŭ���� ������ ����
    public Grade() {
        super("Grade");
        this.setLayout(null);
        this.setBounds(700, 300, 400, 250);
        this.setVisible(true);
        this.addWindowListener(new WindowExit()); // ���� ���� Ŭ���� ������
 
        // �ǳ� ������
        
        
 
        // �ؽ�Ʈ �ʵ� ������
        tf1 = new TextField("", 4);
        tf2 = new TextField("", 4);
        tf3 = new TextField("", 4);
        //tf4 = new TextField("", 4);
 
        // �� ������
        label_g1 = new Label("������ �Է��ϼ���.");
        label_g1.setBackground(Color.yellow);
        label_g2 = new Label("������ �Է��ϼ���.");
        label_g2.setBackground(Color.yellow);
        label_kor = new Label("�� ��");
        label_math = new Label("�� ��");
        label_eng = new Label("�� ��");
        label_sum = new Label("0");
        label_avg = new Label("0.0");
        label_grade = new Label("x");
        label1 = new Label("�� ��");
        label2 = new Label("�� ��");
        label3 = new Label("�� ��");
        //label_math2 = new Label("����");
 
        // ��ư ������
        bt1 = new Button("��� Ȯ��!");
        //bt2 = new Button("g2 ���� ����");
 
        // �׼� ������
        bt1.addActionListener(this);
        //bt2.addActionListener(this);
 
        // �ǳ� �߰�
        
        
 
        // ������ �߰� (���� : ���⼭ ������ �ٲ�� �ؽ�Ʈ �ʵ� ��ư ���� �� �⿩�����ϴ�.)
        add(label_kor);
        add(tf1);
        add(label_math);
        add(tf2);
        add(label_eng);
        add(tf3);
        add(label_sum);
        add(label_avg);
        add(label_grade);
        //add(label_math2);
        //p2.add(tf4);
        add(label_g1);
        add(label_g2);
        add(bt1);
        add(label1);
        add(label2);
        add(label3);
        //add(bt2);
        
        label_kor.setBounds(20, 60, 50, 30);
        label_eng.setBounds(20, 120, 50, 30);
        label_math.setBounds(20, 180, 50, 30);
        tf1.setBounds(70, 60, 100, 25);
        tf2.setBounds(70, 120, 100, 25);
        tf3.setBounds(70, 180, 100, 25);
        label1.setBounds(200, 60, 50, 30);
        label2.setBounds(200, 120, 50, 30);
        label3.setBounds(200, 180, 50, 30);
        label_sum.setBounds(280, 60, 50, 30);
        label_avg.setBounds(280, 118, 50, 30);
        label_grade.setBounds(280, 180, 50, 30);
        bt1.setBounds(1, 218, 400, 25);
    }
    
    // �׼������� �޼ҵ� ����
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand(); // ��ư�� ���ڿ� ��ȯ
        int score;
        int score1;
        String s, s1, s2, math, eng, kor;
 
        if (str.equals("��� Ȯ��!")) {
            // System.out.println(str);
            try {
                // �Ʒ��� ���ǵ� ������ ���⼭ ó���ؼ� ����Ѵ�.
                kor = tf1.getText(); // �ؽ�Ʈ �ʴ��� ���ڿ��� kor�� ����
                eng = tf2.getText(); // �ؽ�Ʈ �ʴ��� ���ڿ��� eng�� ����
                math = tf3.getText(); // �ؽ�Ʈ �ʴ��� ���ڿ��� eng�� ����
                int a = Integer.parseInt(eng); // math ���ڿ��� ���ڷ�
                int b = Integer.parseInt(math); // eng ���ڿ��� ���ڷ�
                int c = Integer.parseInt(kor); // kor ���ڿ��� ���ڷ�
                this.input_Grade(a, b, c); // �����Է�
                score = this.sum_Grade(); // ���� ���ؼ� score������ ����
                score1 = this.avg_Grade(); // ���� ���ؼ� score������ ����
                s = Integer.toString(score); // ������ score ������ ���ڿ��� s ������ ����
                s1 = Integer.toString(score1); // ������ score ������ ���ڿ��� s ������ ����
                if(score1 >= 90) {
                	g = "A";
                }else if(score1 >= 80) {
                	g = "B";
                }else
                	g = "F";
                
                label_sum.setText(s); // �󺧿� ���� ���
                label_avg.setText(s1); // �󺧿� ���� ���
                label_grade.setText(g);
            } catch (Exception ev) {
                label_g1.setText("���ڸ� �Է��ϼ���.");
            }
        }else ;
    }
    
    
    public void input_Grade(int a, int b, int c) {
    	k = c;
    	e = a;
        m = b;
    }
 
    public int sum_Grade() {
        return e + m + k;
    }
    
    public int avg_Grade() {
    	return (k + e + m)/3;
    }
    
    
 
    // ���� ���� Ŭ����
    public class WindowExit extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
 
    public static void main(String[] args) {
        new Grade();
    }
}
 
