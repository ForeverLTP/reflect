package com.bdcom.test;



public class Test6 {

	public static void main(String []args){
		System.out.println(Demo2.name);
	}
}
class Demo1{
	public static  String name = "demo1";
	static {
		System.out.println("���Ǹ��࣡");
	}
}
class Demo2 extends Demo1{
	
	static{
		System.out.println("�������࣡");
	}
}