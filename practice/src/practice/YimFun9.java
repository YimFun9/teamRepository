// 박민
package practice;
import java.awt.BorderLayout;
import java.util.Locale;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.github.javafaker.Faker;

public class YimFun9 extends JFrame {
//	똥 싸기~!

	// 윈도우 빌더 테스트
	public YimFun9() {
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("^^7");
		pnl.add(lbl);
		add(pnl);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new YimFun9(); // 다 나오나요?

		Faker faker = new Faker(new Locale("ko"));
		System.out.println(faker.name().fullName());

		// 잘됩니다!
		// 나와용

	}

}
