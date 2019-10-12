package cn.edu.scau.cmi.zhengdinghao.abstractFactory;

public class AonongFactory implements Factory{
	@Override
	public Pork getPork() {
		return new AonongPork();
	}
	public Beef getBeef() {
		return new AonongBeef();
	}
	public Chicken getChicken() {
		return new AonongChicken();
	}
}
