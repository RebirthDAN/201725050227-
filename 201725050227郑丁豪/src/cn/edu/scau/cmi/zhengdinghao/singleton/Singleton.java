package cn.edu.scau.cmi.zhengdinghao.singleton;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Singleton extends JFrame{
	JTextField text;
	JButton button;
	JLabel label;
	public void run() {
		setBounds(550,240,500,500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("单例模式");
		setLayout(new FlowLayout(5));
		getContentPane().add(new JLabel("请输入主席名称"));
		text = new JTextField(10);
		getContentPane().add(text);
		button = new JButton("确定");
		getContentPane().add(button);
		button.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				Chairman chairman = Chairman.setChairman(text.getText());
				label = new JLabel("\n"+chairman.getName()+chairman);
				add(label);
				setVisible(true);
			}
		});
		setVisible(true);
	}
}
