package cn.edu.scau.cmi.zhengdinghao.client;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Transaction;

import cn.edu.scau.cmi.zhengdinghao.domain.*;
import cn.edu.scau.cmi.zhengdinghao.dao.StudentDAO;
import cn.edu.scau.cmi.zhengdinghao.dao.TeacherDAO;

public class HibernateClient {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		Student student;
		Teacher teacher;
		Long i;
		Set<Student> students;
		while(true) {
			System.out.println("请选择功能：\n功能1：添加学生\r\n" + 
				"功能2：修改学生\r\n" + 
				"功能3：删除学生\r\n" + 
				"功能4：添加教师\r\n" + 
				"功能5：修改教师\r\n" + 
				"功能6：删除教师\r\n" + 
				"功能7：学生选择指导教师\r\n" + 
				"功能8：学生修改指导教师\r\n" + 
				"功能9：教师选择被指导的学生\r\n" + 
				"功能10：教师修改被指导的学生\r\n" + 
				"");
			switch (reader.nextInt()) {
			case 1:
				System.out.println("请输入要添加的学生id与姓名");
				student = new Student(reader.nextLong(),reader.nextLine());
				newStudent(student);
				break;
			case 2:
				System.out.println("请输入要修改的学生id");
				student = findStudent(reader.nextLong());
				System.out.println("请输入修改后的学生的姓名");
				student.setName(reader.nextLine());
				updateStudent(student);
				break;
			case 3:
				System.out.println("请输入要删除的学生id");
				student = new Student(reader.nextLong(),null);
				deleteStudent(student);
				break;
			case 4:
				System.out.println("请输入要添加的老师id与姓名");
				teacher = new Teacher(reader.nextLong(),reader.nextLine());
				newTeacher(teacher);
				break;
			case 5:
				System.out.println("请输入要修改的老师id");
				teacher = new Teacher(reader.nextLong(),null);
				System.out.println("请输入修改后的老师的姓名");
				teacher.setName(reader.nextLine());
				updateTeacher(teacher);
				break;
			case 6:
				System.out.println("请输入要删除的老师id");
				teacher = new Teacher(reader.nextLong(),null);
				deleteTeacher(teacher);
				break;
			case 7:
				System.out.println("请输入要操作的学生id");
				student = findStudent(reader.nextLong());
				System.out.println("请输入指导老师的id");
				teacher = findTeacher(reader.nextLong());
				student.setTeacher(teacher);
				updateStudent(student);
				break;
			case 8:
				System.out.println("请输入要操作的学生id");
				student = findStudent(reader.nextLong());
				System.out.println("请输入指导老师的id");
				teacher = findTeacher(reader.nextLong());
				student.setTeacher(teacher);
				updateStudent(student);
				break;
			case 9:
				System.out.println("请输入要操作的老师id");
				teacher = findTeacher(reader.nextLong());
				System.out.println("请输入学生们的id -1为结束");
				students = new HashSet<>();
				while((i = reader.nextLong())!=-1) {
				student = findStudent(i);
				students.add(student);
				}
				teacher.setStudents(students);
				updateTeacher(teacher);
				break;
			case 10:
				System.out.println("请输入要操作的老师id");
				teacher = findTeacher(reader.nextLong());
				System.out.println("请输入学生们的id -1为结束");
				students = new HashSet<>();
				while((i = reader.nextLong())!=-1) {
				student = findStudent(i);
				students.add(student);
				}
				teacher.setStudents(students);
				updateTeacher(teacher);
				break;
			default:
				break;
			}
		}
	}
	
	public static void newStudent(Student student) {
		StudentDAO studentDAO = new StudentDAO();
		Transaction transaction = studentDAO.getSession().beginTransaction();
		studentDAO.save(student);
		transaction.commit();
	}
	
	public static void updateStudent(Student student) {
		StudentDAO studentDAO = new StudentDAO();
		Transaction transaction = studentDAO.getSession().beginTransaction();
		studentDAO.attachDirty(student);
		transaction.commit();
	}
	
	public static void deleteStudent(Student student) {
		StudentDAO studentDAO = new StudentDAO();
		Transaction transaction = studentDAO.getSession().beginTransaction();
		studentDAO.delete(student);
		transaction.commit();
	}
	
	public static void newTeacher(Teacher teacher) {
		TeacherDAO teacherDAO = new TeacherDAO();
		Transaction transaction = teacherDAO.getSession().beginTransaction();
		teacherDAO.save(teacher);
		transaction.commit();
	}
	
	public static void updateTeacher(Teacher teacher) {
		TeacherDAO teacherDAO = new TeacherDAO();
		Transaction transaction = teacherDAO.getSession().beginTransaction();
		teacherDAO.attachDirty(teacher);
		transaction.commit();
	}
	
	public static void deleteTeacher(Teacher teacher) {
		TeacherDAO teacherDAO = new TeacherDAO();
		Transaction transaction = teacherDAO.getSession().beginTransaction();
		teacherDAO.delete(teacher);
		transaction.commit();
	}
	
	public static Student findStudent(Long id) {
		StudentDAO studentDAO = new StudentDAO();
		return studentDAO.findById(id);
	}
	
	public static Teacher findTeacher(Long id) {
		TeacherDAO teacherDAO = new TeacherDAO();
		return teacherDAO.findById(id);
	}
}
