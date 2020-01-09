package cn.edu.scau.cmi.zhengdinghao.abstractFactory;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AbstractFactory extends JFrame{
	Factory wFactory = new WensFactory();
	Factory tFactory = new TianbangFactory();
	Factory aFactory = new AonongFactory();
	JButton wPork,wBeef,wChicken,tPork,tBeef,tChicken,aPork,aBeef,aChicken;
	JLabel label;
	public void run() {
		setBounds(550,240,500,500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("π§≥ßƒ£ Ω");
		setLayout(new FlowLayout(5));
		wPork = new JButton("Œ¬ œ÷Ì»‚");
		wBeef = new JButton("Œ¬ œ≈£»‚");
		wChicken = new JButton("Œ¬ œº¶»‚");
		tPork = new JButton("ÃÏ∞Ó÷Ì»‚");
		tBeef = new JButton("ÃÏ∞Ó≈£»‚");
		tChicken = new JButton("ÃÏ∞Óº¶»‚");
		aPork = new JButton("∞¡≈©÷Ì»‚");
		aBeef = new JButton("∞¡≈©≈£»‚");
		aChicken = new JButton("∞¡≈©º¶»‚");
		getContentPane().add(wPork);
		getContentPane().add(wBeef);
		getContentPane().add(wChicken);
		getContentPane().add(tPork);
		getContentPane().add(tBeef);
		getContentPane().add(tChicken);
		getContentPane().add(aPork);
		getContentPane().add(aBeef);
		getContentPane().add(aChicken);
		wPork.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				Pork wp = wFactory.getPork();
				label = new JLabel(wp.typePork());
				add(label);
				setVisible(true);
			}
		});
		wBeef.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				Beef wb = wFactory.getBeef();
				label = new JLabel(wb.typeBeef());
				add(label);
				setVisible(true);
			}
		});
		wChicken.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				Chicken wc = wFactory.getChicken();
				label = new JLabel(wc.typeChicken());
				add(label);
				setVisible(true);
			}
		});
		tPork.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				Pork tp = tFactory.getPork();
				label = new JLabel(tp.typePork());
				add(label);
				setVisible(true);
			}
		});
		tBeef.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				Beef tb = tFactory.getBeef();
				label = new JLabel(tb.typeBeef());
				add(label);
				setVisible(true);
			}
		});
		tChicken.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				Chicken tc = tFactory.getChicken();
				label = new JLabel(tc.typeChicken());
				add(label);
				setVisible(true);
			}
		});
		aPork.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				Pork ap = aFactory.getPork();
				label = new JLabel(ap.typePork());
				add(label);
				setVisible(true);
			}
		});
		aBeef.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				Beef ab = aFactory.getBeef();
				label = new JLabel(ab.typeBeef());
				add(label);
				setVisible(true);
			}
		});
		aChicken.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e) {
				Chicken ac = aFactory.getChicken();
				label = new JLabel(ac.typeChicken());
				add(label);
				setVisible(true);
			}
		});
		setVisible(true);
	}
}
