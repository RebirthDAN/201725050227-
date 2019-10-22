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
		System.out.println("��������֯����");
		Team team = new Team(reader.nextLine());
		teams.add(team);
		while(true) {
			System.out.println("��ѡ�񴴽�����֯���ͣ�");
			switch (reader.nextLine()) {
			case "������֯":
				System.out.println("�����봴���ĸ��˵����֣�");
				o = new Person(reader.nextLine());
				break;
			case "�Ŷ���֯":
				System.out.println("�����봴�����Ŷӵ����֣�");
				o = new Team(reader.nextLine());
				teams.add((Team)o);
				break;
			default:
				break;
			}
			System.out.println("�����봴�������������֯����");
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
