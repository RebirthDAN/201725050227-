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
			System.out.println("��ѡ���ܣ�\n����1�����ѧ��\r\n" + 
				"����2���޸�ѧ��\r\n" + 
				"����3��ɾ��ѧ��\r\n" + 
				"����4����ӽ�ʦ\r\n" + 
				"����5���޸Ľ�ʦ\r\n" + 
				"����6��ɾ����ʦ\r\n" + 
				"����7��ѧ��ѡ��ָ����ʦ\r\n" + 
				"����8��ѧ���޸�ָ����ʦ\r\n" + 
				"����9����ʦѡ��ָ����ѧ��\r\n" + 
				"����10����ʦ�޸ı�ָ����ѧ��\r\n" + 
				"");
			switch (reader.nextInt()) {
			case 1:
				System.out.println("������Ҫ��ӵ�ѧ��id������");
				student = new Student(reader.nextLong(),reader.nextLine());
				newStudent(student);
				break;
			case 2:
				System.out.println("������Ҫ�޸ĵ�ѧ��id");
				student = findStudent(reader.nextLong());
				System.out.println("�������޸ĺ��ѧ��������");
				student.setName(reader.nextLine());
				updateStudent(student);
				break;
			case 3:
				System.out.println("������Ҫɾ����ѧ��id");
				student = new Student(reader.nextLong(),null);
				deleteStudent(student);
				break;
			case 4:
				System.out.println("������Ҫ��ӵ���ʦid������");
				teacher = new Teacher(reader.nextLong(),reader.nextLine());
				newTeacher(teacher);
				break;
			case 5:
				System.out.println("������Ҫ�޸ĵ���ʦid");
				teacher = new Teacher(reader.nextLong(),null);
				System.out.println("�������޸ĺ����ʦ������");
				teacher.setName(reader.nextLine());
				updateTeacher(teacher);
				break;
			case 6:
				System.out.println("������Ҫɾ������ʦid");
				teacher = new Teacher(reader.nextLong(),null);
				deleteTeacher(teacher);
				break;
			case 7:
				System.out.println("������Ҫ������ѧ��id");
				student = findStudent(reader.nextLong());
				System.out.println("������ָ����ʦ��id");
				teacher = findTeacher(reader.nextLong());
				student.setTeacher(teacher);
				updateStudent(student);
				break;
			case 8:
				System.out.println("������Ҫ������ѧ��id");
				student = findStudent(reader.nextLong());
				System.out.println("������ָ����ʦ��id");
				teacher = findTeacher(reader.nextLong());
				student.setTeacher(teacher);
				updateStudent(student);
				break;
			case 9:
				System.out.println("������Ҫ��������ʦid");
				teacher = findTeacher(reader.nextLong());
				System.out.println("������ѧ���ǵ�id -1Ϊ����");
				students = new HashSet<>();
				while((i = reader.nextLong())!=-1) {
				student = findStudent(i);
				students.add(student);
				}
				teacher.setStudents(students);
				updateTeacher(teacher);
				break;
			case 10:
				System.out.println("������Ҫ��������ʦid");
				teacher = findTeacher(reader.nextLong());
				System.out.println("������ѧ���ǵ�id -1Ϊ����");
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
