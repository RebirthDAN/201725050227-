package cn.edu.scau.cmi.zhengdinghao.factory;

public class PorkFactory implements Factory{
	@Override
	public Meat getMeat() {
		return new Pork();
	}
}
