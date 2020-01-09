package cn.edu.scau.cmi.zhengdinghao.composite;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Composite extends JFrame {
	ArrayList<Organization> organizations = new ArrayList<>();
	ArrayList<Team> teams = new ArrayList<>();
	Organization o = null;
	JTextField name;
	JButton button;
	JRadioButton teamButton,personButton;
	ButtonGroup group = new ButtonGroup();
	JLabel label;
	public void run() {
		setBounds(550,240,500,500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("��ȫ���ģʽ");
		setLayout(new FlowLayout(5));
		getContentPane().add(new JLabel("�����봴������������Լ�������֯���ÿո����(����������������)"));
		name = new JTextField(10);
		getContentPane().add(name);
		button = new JButton("ȷ��");
		getContentPane().add(button);
		teamButton = new JRadioButton("�Ŷ���֯");
		personButton = new JRadioButton("������֯");
		teamButton.setSelected(true);
		group.add(teamButton);
		group.add(personButton);
		getContentPane().add(teamButton);
		getContentPane().add(personButton);
		getContentPane().add(new JLabel("������֯�����ֺͳ�ԱΪ:"));
		label = new JLabel();
		add(label);
		button.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				if(teamButton.isSelected()) {
					o = new Team(name.getText().split("\\s")[0]);
					teams.add((Team)o);
					organizations.add(o);
					if(name.getText().split("\\s").length != 1) {
						for(Team t:teams) {
							if(name.getText().split("\\s")[1].equals(t.name)) {
								t.addChild(o);
								label.setText("<html>"+t.getName()+"</html>");
								setVisible(true);
							}
						}
					}
				}else {
					o = new Person(name.getText().split("\\s")[0]);
					organizations.add(o);
					if(name.getText().split("\\s").length != 1) {
						for(Team t:teams) {
							if(name.getText().split("\\s")[1].equals(t.name)) {
								t.addChild(o);
								label.setText("<html>"+t.getName()+"</html>");
								setVisible(true);
							}
						}
					}
				}
			}
		});
		setVisible(true);
	}
}
