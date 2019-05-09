package ex01;


import java.awt.*;
import java.awt.event.*;
 
public class Grade extends Frame implements ActionListener {
 
    private static final long serialVersionUID = 1L; // 이클립스가 자동생성한 시리얼 버전
 
    // 필드 변수 선언
    int k;
    int e;
    int m;
    String g;
    int avg1 = (k+e+m)/3;
    Button bt1, bt2;
    TextField tf1, tf2, tf3, tf4;
    Label label_g1, label_g2, label_kor, label_math, label_eng, label_math2, label_sum, label_avg, label_grade, label1, label2, label3;
    Panel p1, p2;
 
    // 실행해서 화면이 백지일 때 화면을 조그만 키워 보세요.
    // Grade 클래스 생성자 정의
    public Grade() {
        super("Grade");
        this.setLayout(null);
        this.setBounds(700, 300, 400, 250);
        this.setVisible(true);
        this.addWindowListener(new WindowExit()); // 윈도 종료 클래스 생성자
 
        // 판넬 생성자
        
        
 
        // 텍스트 필드 생성자
        tf1 = new TextField("", 4);
        tf2 = new TextField("", 4);
        tf3 = new TextField("", 4);
        //tf4 = new TextField("", 4);
 
        // 라벨 생성자
        label_g1 = new Label("점수를 입력하세요.");
        label_g1.setBackground(Color.yellow);
        label_g2 = new Label("점수를 입력하세요.");
        label_g2.setBackground(Color.yellow);
        label_kor = new Label("국 어");
        label_math = new Label("수 학");
        label_eng = new Label("영 어");
        label_sum = new Label("0");
        label_avg = new Label("0.0");
        label_grade = new Label("x");
        label1 = new Label("총 점");
        label2 = new Label("평 균");
        label3 = new Label("학 점");
        //label_math2 = new Label("수학");
 
        // 버튼 생성자
        bt1 = new Button("결과 확인!");
        //bt2 = new Button("g2 성적 총점");
 
        // 액션 리슨너
        bt1.addActionListener(this);
        //bt2.addActionListener(this);
 
        // 판넬 추가
        
        
 
        // 아이템 추가 (주의 : 여기서 순서가 바뀌면 텍스트 필드 버튼 등이 뒤 썩여버립니다.)
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
    
    // 액션퍼폼더 메소드 정의
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand(); // 버튼의 문자열 반환
        int score;
        int score1;
        String s, s1, s2, math, eng, kor;
 
        if (str.equals("결과 확인!")) {
            // System.out.println(str);
            try {
                // 아래에 정의된 성적을 여기서 처리해서 출력한다.
                kor = tf1.getText(); // 텍스트 필더의 문자열을 kor에 저장
                eng = tf2.getText(); // 텍스트 필더의 문자열을 eng에 저장
                math = tf3.getText(); // 텍스트 필더의 문자열을 eng에 저장
                int a = Integer.parseInt(eng); // math 문자열을 숫자로
                int b = Integer.parseInt(math); // eng 문자열을 숫자로
                int c = Integer.parseInt(kor); // kor 문자열을 숫자로
                this.input_Grade(a, b, c); // 성적입력
                score = this.sum_Grade(); // 성적 더해서 score변수에 저장
                score1 = this.avg_Grade(); // 성적 더해서 score변수에 저장
                s = Integer.toString(score); // 정수형 score 변수를 문자열형 s 변수에 저장
                s1 = Integer.toString(score1); // 정수형 score 변수를 문자열형 s 변수에 저장
                if(score1 >= 90) {
                	g = "A";
                }else if(score1 >= 80) {
                	g = "B";
                }else
                	g = "F";
                
                label_sum.setText(s); // 라벨에 총점 출력
                label_avg.setText(s1); // 라벨에 총점 출력
                label_grade.setText(g);
            } catch (Exception ev) {
                label_g1.setText("숫자를 입력하세요.");
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
    
    
 
    // 윈도 종료 클래스
    public class WindowExit extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
 
    public static void main(String[] args) {
        new Grade();
    }
}
 
