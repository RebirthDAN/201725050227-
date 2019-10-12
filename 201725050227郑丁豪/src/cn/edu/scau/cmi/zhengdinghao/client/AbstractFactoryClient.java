package cn.edu.scau.cmi.zhengdinghao.client;

import cn.edu.scau.cmi.zhengdinghao.abstractFactory.*;

public class AbstractFactoryClient {
	public static void main(String args[]) {
		Factory wFactory = new WensFactory();
		Factory tFactory = new TianbangFactory();
		Factory aFactory = new AonongFactory();
		Beef wBeef = new WensBeef();
		Pork tPork = new TianbangPork();
		Chicken aChicken = new AonongChicken();
		wBeef.typeBeef();
		tPork.typePork();
		aChicken.typeChicken();
	}
}
