package com.bdcom.test;



public class Test {
	
	public static Test test = null;
	public static Test test1 = null;
	public void print(){
		System.out.println("print���Ծ�");
	}
	
	@Override
	protected void finalize() throws Throwable {//��ϵͳ��gc����������ʱ�˷���Ҳ������
		System.out.println("�Ծ�");
		test = this;
		//System.out.println(test==null?"����":"������");
	}
	@SuppressWarnings("static-access")
	public  static void main(String[] args) throws Throwable{
		
		test = new Test();
		test = null;
		
		//������ᴴ��һ��finallizer�ĵ����ȼ����߳������Ҫ����ǰ�߳���Ϣһ���finallizer�߳�ִ��
		System.gc();
		System.out.println("��һ�λ��յĽ����");
		Thread.currentThread().sleep(1000);
		if(test == null){
			System.out.println("������");
		}else{
			System.out.println("�һ�����");
		}
		
		//�ڶ��ι۲�
		test = null;
		System.gc();
		System.out.println("�ڶ��λ��յĽ����");
		Thread.currentThread().sleep(1000);
		if(test == null){
			System.out.println("������");
		}else{
			System.out.println("�һ�����");
		}
	}

}


