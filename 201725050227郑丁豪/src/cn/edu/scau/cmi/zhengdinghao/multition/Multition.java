package cn.edu.scau.cmi.zhengdinghao.multition;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Multition extends JFrame {
	JTextField text;
	JButton button;
	JLabel label;
	public void run() {
		setBounds(550,240,500,500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("����ģʽ");
		setLayout(new FlowLayout(5));
		getContentPane().add(new JLabel("������Ԫ˧����������ÿո����"));
		text = new JTextField(10);
		getContentPane().add(text);
		button = new JButton("ȷ��");
		getContentPane().add(button);
		button.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				Marshal marshal = Marshal.setMarshal(Integer.parseInt(text.getText().split("\\s")[0]),text.getText().split("\\s")[1]);
				label = new JLabel("\n"+marshal.getName()+marshal);
				add(label);
				setVisible(true);
			}
		});
		setVisible(true);
	}
}
