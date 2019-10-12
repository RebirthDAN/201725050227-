package cn.edu.scau.cmi.zhengdinghao.factory;

public class ChickenFactory implements Factory{
	@Override
	public Meat getMeat() {
		return new Chicken();
	}
}
