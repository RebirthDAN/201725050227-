package cn.edu.scau.cmi.zhengdinghao.simpleFactory;

public class Factory {
	public static Meat getMeat(String string) {
		if(string.equalsIgnoreCase("pork")) {
			return new Pork();
		}else if(string.equalsIgnoreCase("beef")) {
			return new Beef();
		}else if(string.equalsIgnoreCase("chicken")) {
			return new Chicken();
		}else {
			System.out.println("no such meat.");
			return null;
		}
	}
}
