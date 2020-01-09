package cn.edu.scau.cmi.zhengdinghao.simpleFactory;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimpleFactory extends JFrame {
	JButton pork,beef,chicken;
	JLabel label;
	public void run() {
		setBounds(550,240,500,500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("简单工厂模式");
		setLayout(new FlowLayout(5));
		pork = new JButton("猪肉");
		beef = new JButton("牛肉");
		chicken = new JButton("鸡肉"); 
		getContentPane().add(pork);
		getContentPane().add(beef);
		getContentPane().add(chicken);
		pork.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				Meat meat = Factory.getMeat("Pork");
				label = new JLabel(meat.type());
				add(label);
				setVisible(true);
			}
		});
		beef.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				Meat meat = Factory.getMeat("Beef");
				label = new JLabel(meat.type());
				add(label);
				setVisible(true);
			}
		});
		chicken.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				Meat meat = Factory.getMeat("Chicken");
				label = new JLabel(meat.type());
				add(label);
				setVisible(true);
			}
		});
		setVisible(true);
	}
}
