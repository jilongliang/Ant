package com.test;

/**
 * spit��ʹ��
 * @author ������
 *
 */
public class Spit {
	public static void main(String[] args) {
		String str="3243x242342,l42342342;34242";
		
		String [] strList=str.split(",|;|x");
		for (int i = 0; i < strList.length; i++) {
			System.out.println(strList[i]);
		}
	}
}
