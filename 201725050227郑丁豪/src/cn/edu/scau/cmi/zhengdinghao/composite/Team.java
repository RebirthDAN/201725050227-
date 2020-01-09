package cn.edu.scau.cmi.zhengdinghao.composite;

import java.util.ArrayList;

public class Team extends Organization{
	public String name;
	ArrayList<Organization> organizations;
	public Team(String name) {
		this.name = name;
		organizations = new ArrayList<>();
	}
	public void addChild(Organization organization) {
		organizations.add(organization);
	}
	public void removeChild(Organization organization) {
		organizations.remove(organization);
	}
	public String getName() {
		int len = organizations.size();
		String allName = name;
		for(int i = 0;i < len;i++) {
			Organization organization = organizations.get(i);
			allName +=("<br>" + organization.getName());
		}
		return allName;
	}
}
