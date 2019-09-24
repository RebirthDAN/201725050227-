package cn.edu.scau.cmi.zhengdinghao.client;

import cn.edu.scau.cmi.zhengdinghao.singleton.*;

public class SingletonClient {
	public static void main(String args[]) {
		Singleton singleton = new Singleton();
		singleton.run();
	}
}
