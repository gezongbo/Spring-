package com.lddx.bean;

import org.springframework.stereotype.Component;

//��ע���Ч����ͬ��<bean id="person" class="com.lddx.bean.Person"></bean>
//��ע���Ϊ��ǰ���õ�javabean��Ĭ������һ��idֵ��Ϊid="person"
@Component   
public class Person {
	
	public void eat(){
		System.out.println("��...");
	}
	public void say(){
		System.out.println("˵...");
	}
}