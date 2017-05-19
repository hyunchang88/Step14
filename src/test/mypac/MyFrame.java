package test.mypac;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	// 생성자
	public MyFrame(){

		// 레이아웃 설정
		this.setLayout(new BorderLayout());
		
		// 버튼 객체 만들고
		JButton btn = new JButton("눌러보셈");
		btn.addActionListener(this); // MyFrame 이 ActionListener 이니까 this 해준것. // 이제 버튼을 누르면 실행순서는 public void actionPerformed(ActionEvent e) 요기로 감
		
		// 프레임에 버튼을 추가하기 (버튼 객체를 frame의 북쪽에 배치 하는 것.)
		this.add(btn, BorderLayout.NORTH); // 클래스 명에 점 찍었으니 static, 대문자로 썻으니 final // 따라서 static final 멤버 필드 인 것임.
		
		// 프레임의 위치와 크기 설정
		this.setBounds(100, 100, 500, 500);
		// 프레임이 보이도록
		this.setVisible(true);
		// 닫기 아이콘을 눌렀을때 프로세스가 종료 되도록
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	// ActionListener 인터페이스에 정의된 추상 메소드 재정의
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "버튼을 눌렀네?");
	}
	
	
}
