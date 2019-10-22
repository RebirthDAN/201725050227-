package cn.edu.scau.cmi.zhengdinghao.OComposite;

public abstract class Organization {
	public abstract String getName();
	public abstract void addChild(Organization organization);
	public abstract void removeChild(Organization organization);
}
