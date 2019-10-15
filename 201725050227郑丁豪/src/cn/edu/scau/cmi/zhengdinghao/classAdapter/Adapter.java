package cn.edu.scau.cmi.zhengdinghao.classAdapter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Adapter extends SortUtil implements StudentSortUtil{
	@Override
	public void sortStudent(List<Student> listStudent) {
		Collections.sort(listStudent, new Comparator<Student>() {
			@Override
			public int compare(Student s1,Student s2) {
				int x = s1.getId()-s2.getId();
				if(x > 0){
					return 1;
				}else if (x < 0){
					return -1;
				}
				return 0;
			}
		}); 
	}
}
