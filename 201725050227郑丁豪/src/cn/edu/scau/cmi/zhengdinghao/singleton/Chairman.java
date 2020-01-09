package cn.edu.scau.cmi.zhengdinghao.singleton;

public class Chairman {
	private String name = "Nobody";
	public static Chairman chairman = new Chairman();
	
	private Chairman() {
	}
	
	public static Chairman setChairman(String name) {
		chairman.name = name;
		return chairman;
	}
	
	public static Chairman getChairman() {
		return chairman;
	}
	
	public String getName() {
		return name;
	}
}
