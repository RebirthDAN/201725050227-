package cn.edu.scau.cmi.zhengdinghao.client;

import java.util.Scanner;
import cn.edu.scau.cmi.zhengdinghao.simpleFactory.*;

public class SimpleFactoryClient {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("��������Ҫ�����ࣺ");
		String string = reader.nextLine();
		Meat meat = Factory.getMeat(string);
		meat.type();
	}
}
