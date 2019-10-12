package cn.edu.scau.cmi.zhengdinghao.abstractFactory;

public class WensFactory implements Factory{
	@Override
	public Pork getPork() {
		return new WensPork();
	}
	public Beef getBeef() {
		return new WensBeef();
	}
	public Chicken getChicken() {
		return new WensChicken();
	}
}
