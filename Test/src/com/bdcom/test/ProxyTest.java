package com.bdcom.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;



public class ProxyTest {

	public static void main(String[]args){
		
		Person stu = new Student();
		InvocationHandler  handler = new StundentProxy(stu);
		Person per = (Person)Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
				stu.getClass().getInterfaces(), handler);
		per.sendFee("����");
	}
}
interface Person{
	public void sendFee(String name);
}
class Student implements Person{

	@Override
	public void sendFee(String name) {
		System.out.println(name + "�ύѧ�ѣ�");
	}
	
	
}
class StundentProxy implements InvocationHandler{

	private Object student;
	
	public StundentProxy(Object student) {
		
		this.student = student;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		System.out.println("����ִ��");
		return method.invoke(student, args);
	}
	
}
