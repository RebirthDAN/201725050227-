package cn.edu.scau.cmi.zhengdinghao.composite;

public class Person extends Organization{
	public String name;
	public String getName() {
		return name;
	}
	public Person(String name) {
		this.name = name;
	}
}
