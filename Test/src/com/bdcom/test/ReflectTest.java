package com.bdcom.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class ReflectTest {

	public static void main(String[]args){
		//�����ȡHuman����
		try {
			Class<?> human = Class.forName("com.bdcom.test.Human");
			
			Method[] methods = human.getDeclaredMethods();//��ȡ������������з���
			Field[] fields = human.getDeclaredFields();//��ȡ�����������������
			try {
				Object obj = human.newInstance();
				Method age = human.getMethod("setAge", int.class);
				age.invoke(obj, 10);
				Method getAge = human.getMethod("getAge");
				System.out.println(getAge.invoke(obj));
				
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
class Human{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	public Human() {
		super();
	}
	public Human(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
}