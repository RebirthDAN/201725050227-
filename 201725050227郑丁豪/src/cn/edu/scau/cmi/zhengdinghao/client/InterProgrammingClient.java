package cn.edu.scau.cmi.zhengdinghao.client;

import cn.edu.scau.cmi.zhengdinghao.interProgramming.*;

public class InterProgrammingClient {
	public static void main(String args[]) {
		Student a = new GraduateStudent();
		Student b = new UndergraduateStudent();
		a.learning();
		b.learning();
	}
}
