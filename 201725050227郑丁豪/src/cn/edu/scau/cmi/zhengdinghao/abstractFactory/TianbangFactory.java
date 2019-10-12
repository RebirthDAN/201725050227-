package cn.edu.scau.cmi.zhengdinghao.abstractFactory;

public class TianbangFactory implements Factory{
	@Override
	public Pork getPork() {
		return new TianbangPork();
	}
	public Beef getBeef() {
		return new TianbangBeef();
	}
	public Chicken getChicken() {
		return new TianbangChicken();
	}
}
