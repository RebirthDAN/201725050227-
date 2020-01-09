package cn.edu.scau.cmi.zhengdinghao.multition;

public class Marshal {
	private String name;
	public static Marshal m1 = new Marshal();
	public static Marshal m2 = new Marshal();
	public static Marshal m3 = new Marshal();
	public static Marshal m4 = new Marshal();
	public static Marshal m5 = new Marshal();
	public static Marshal m6 = new Marshal();
	public static Marshal m7 = new Marshal();
	public static Marshal m8 = new Marshal();
	public static Marshal m9 = new Marshal();
	public static Marshal m10 = new Marshal();
	
	private Marshal() {
	}
	
	public static Marshal getMarshal(int num) {
		switch(num) {
			case 1:
				return m1;
			case 2:
				return m2;
			case 3:
				return m3;
			case 4:
				return m4;
			case 5:
				return m5;
			case 6:
				return m6;
			case 7:
				return m7;
			case 8:
				return m8;
			case 9:
				return m9;
			case 10:
				return m10;
			default:
				return null;
		}
	}
	
	public static Marshal setMarshal(int num,String name) {
		switch(num) {
			case 1:
				m1.name = name;
				return m1;
			case 2:
				m2.name = name;
				return m2;
			case 3:
				m3.name = name;
				return m3;
			case 4:
				m4.name = name;
				return m4;
			case 5:
				m5.name = name;
				return m5;
			case 6:
				m6.name = name;
				return m6;
			case 7:
				m7.name = name;
				return m7;
			case 8:
				m8.name = name;
				return m8;
			case 9:
				m9.name = name;
				return m9;
			case 10:
				m10.name = name;
				return m10;
			default:
				return null;
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
