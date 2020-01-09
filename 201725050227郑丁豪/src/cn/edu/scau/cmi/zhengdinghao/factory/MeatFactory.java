package cn.edu.scau.cmi.zhengdinghao.factory;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MeatFactory extends JFrame{
	JButton pork,beef,chicken;
	JLabel label;
	Factory pFactory = new PorkFactory();
	Factory bFactory = new BeefFactory();
	Factory cFactory = new ChickenFactory();
	public void run() {
		setBounds(550,240,500,500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("工厂模式");
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
				Meat pork = pFactory.getMeat();
				label = new JLabel(pork.type());
				add(label);
				setVisible(true);
			}
		});
		beef.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				Meat beef = bFactory.getMeat();
				label = new JLabel(beef.type());
				add(label);
				setVisible(true);
			}
		});
		chicken.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				Meat chicken = cFactory.getMeat();
				label = new JLabel(chicken.type());
				add(label);
				setVisible(true);
			}
		});
		setVisible(true);
	}
}
