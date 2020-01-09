package cn.edu.scau.cmi.zhengdinghao.client;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import cn.edu.scau.cmi.zhengdinghao.OComposite.OCcomposite;
import cn.edu.scau.cmi.zhengdinghao.abstractFactory.AbstractFactory;
import cn.edu.scau.cmi.zhengdinghao.classAdapter.ClassAdapter;
import cn.edu.scau.cmi.zhengdinghao.composite.Composite;
import cn.edu.scau.cmi.zhengdinghao.factory.MeatFactory;
import cn.edu.scau.cmi.zhengdinghao.multition.Multition;
import cn.edu.scau.cmi.zhengdinghao.objectAdapter.ObjectAdapter;
import cn.edu.scau.cmi.zhengdinghao.simpleFactory.SimpleFactory;
import cn.edu.scau.cmi.zhengdinghao.singleton.*;

public class FinalClient {	
	public static void main(String args[]) {
		Client client = new Client();
		client.run();
	}
}

class Client extends JFrame {
	JLabel nameLabel,idLabel;
	JButton ex1,ex2,ex3,ex4,ex5,ex6,ex7,ex8,ex9;
	public void run() {
		setBounds(550,240,500,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("FinalClient");
		setLayout(null);
		nameLabel = new JLabel("姓名：郑丁豪");
		nameLabel.setBounds(5, 250, 100, 30);
		idLabel = new JLabel("学号：201725050227");
		idLabel.setBounds(5, 270, 200, 30);
		this.add(nameLabel);
		this.add(idLabel);
		ex1 = new JButton("实验一：单例模式");
		ex1.setBounds(30,5,200, 40);
		ex1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Singleton singleton = new Singleton();
            	singleton.run();
            }
        });
		ex2 = new JButton("实验二：多例模式");
		ex2.setBounds(260,5,200, 40);
		ex2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Multition multition = new Multition();
            	multition.run();
            }
        });
		ex3 = new JButton("实验三：简单工厂模式");
		ex3.setBounds(30,55,200, 40);
		ex3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	SimpleFactory simpleFactory = new SimpleFactory();
            	simpleFactory.run();
            }
        });
		ex4 = new JButton("实验四：工厂模式");
		ex4.setBounds(260,55,200, 40);
		ex4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	MeatFactory meatFactory = new MeatFactory();
            	meatFactory.run();
            }
        });
		ex5 = new JButton("实验五：抽象工厂模式");
		ex5.setBounds(30,105,200, 40);
		ex5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	AbstractFactory abstractFactory = new AbstractFactory();
            	abstractFactory.run();
            }
        });
		ex6 = new JButton("实验六：对象适配器模式");
		ex6.setBounds(260,105,200, 40);
		ex6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ClassAdapter classAdapter = new ClassAdapter();
            	classAdapter.run();
            }
        });
		ex7 = new JButton("实验七：类适配器模式");
		ex7.setBounds(30,155,200, 40);
		ex7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ObjectAdapter objectAdapter = new ObjectAdapter();
        		objectAdapter.run();
            }
        });
		ex8 = new JButton("实验八：安全型组合模式");
		ex8.setBounds(260,155,200, 40);
		ex8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Composite composite = new Composite();
            	composite.run();
            }
        });
		ex9 = new JButton("实验九：一致型组合模式");
		ex9.setBounds(30,205,430, 40);
		ex9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	OCcomposite oCcomposite = new OCcomposite();
            	oCcomposite.run();
            }
        });
		this.add(ex1);
		this.add(ex2);
		this.add(ex3);
		this.add(ex4);
		this.add(ex5);
		this.add(ex6);
		this.add(ex7);
		this.add(ex8);
		this.add(ex9);
		setVisible(true);
	}
}
