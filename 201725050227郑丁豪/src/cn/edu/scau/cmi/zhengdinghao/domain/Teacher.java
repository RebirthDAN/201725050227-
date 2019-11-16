package cn.edu.scau.cmi.zhengdinghao.domain;

import java.util.HashSet;
import java.util.Set;

public class Teacher implements java.io.Serializable {
  public Teacher() {
  }

  private Long id;
  private String name;
  private Set students = new HashSet(0);
  
  public Teacher(Long id,String name) {
	  this.id = id;
	  this.name = name;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set getStudents() {
    return this.students;
  }

  public void setStudents(Set students) {
    this.students = students;
  }
}
