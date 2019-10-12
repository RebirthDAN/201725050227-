package cn.edu.scau.cmi.zhengdinghao.client;

import cn.edu.scau.cmi.zhengdinghao.factory.*;

public class MeatFactoryClient {
	public static void main(String args[]) {
		Factory pFactory = new PorkFactory();
		Factory bFactory = new BeefFactory();
		Factory cFactory = new ChickenFactory();
		Meat pork = pFactory.getMeat();
		Meat beef = bFactory.getMeat();
		Meat chicken = cFactory.getMeat();
		pork.type();
		beef.type();
		chicken.type();
	}
}
