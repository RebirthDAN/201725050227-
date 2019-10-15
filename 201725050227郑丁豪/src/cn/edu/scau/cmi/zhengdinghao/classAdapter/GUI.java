package cn.edu.scau.cmi.zhengdinghao.classAdapter;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI extends JFrame{
	JTextField text1;
	JTextField text2;
	JButton button;
	JLabel label;
	List<Student> listStudent;
	Student student;
	Adapter adapter;
	public void run() {
		setBounds(550,240,550,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("EX04");
		setLayout(new FlowLayout(5));
		listStudent = new ArrayList<Student>();
		adapter = new Adapter();
		getContentPane().add(new JLabel("请分别输入需要排序的学生学号和姓名"));
		text1 = new JTextField(10);
		getContentPane().add(text1);
		text2 = new JTextField(10);
		getContentPane().add(text2);
		button = new JButton("确定");
		getContentPane().add(button);
		label = new JLabel();
		getContentPane().add(label);
		button.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				student = new Student(Integer.parseInt(text1.getText()),text2.getText());
				listStudent.add(student);
				adapter.sortStudent(listStudent);
				String string = "<html>";
				for(Student student:listStudent) {
					string+=("<br>"+student.getName());
				}
				string+="</html>";
				label.setText(string);
				setVisible(true);
			}
		});
		setVisible(true);
	}
}