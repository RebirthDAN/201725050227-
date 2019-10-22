package cn.edu.scau.cmi.zhengdinghao.OComposite;

public class Person extends Organization{
	public String name;
	public String getName() {
		return name;
	}
	public Person(String name) {
		this.name = name;
	}
	public void addChild(Organization organization) {
		
	};
	public void removeChild(Organization organization) {
		
	};
}
