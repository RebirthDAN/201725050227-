package cn.edu.scau.cmi.zhengdinghao.client;

import java.util.ArrayList;
import java.util.Scanner;

import cn.edu.scau.cmi.zhengdinghao.composite.Organization;
import cn.edu.scau.cmi.zhengdinghao.composite.Person;
import cn.edu.scau.cmi.zhengdinghao.composite.Team;

public class OCompositeClient {
	public static void main(String args[]) {
		ArrayList<Team> teams = new ArrayList<>();
		Organization o = null;
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入组织名：");
		Team team = new Team(reader.nextLine());
		teams.add(team);
		while(true) {
			System.out.println("请选择创建的组织类型：");
			switch (reader.nextLine()) {
			case "个人组织":
				System.out.println("请输入创建的个人的名字：");
				o = new Person(reader.nextLine());
				break;
			case "团队组织":
				System.out.println("请输入创建的团队的名字：");
				o = new Team(reader.nextLine());
				teams.add((Team)o);
				break;
			default:
				break;
			}
			System.out.println("请输入创建对象的所属组织名：");
			String string = reader.nextLine();
			for(Team t:teams) {
				if(string.equals(t.name)) {
					t.addChild(o);
					System.out.println(t.getName());
				}
			}
		}
	}
}
