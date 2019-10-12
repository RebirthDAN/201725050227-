package cn.edu.scau.cmi.zhengdinghao.factory;

public class BeefFactory implements Factory{
	@Override
	public Meat getMeat() {
		return new Beef();
	}
}
