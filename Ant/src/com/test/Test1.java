package com.test;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * �򵥵�swing��ʹ��
 * @author ������
 *
 */
public class Test1 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		JFrame jfaFrame = new JFrame("Hello Ant");
		jfaFrame.setSize(new Dimension(200, 300));
		jfaFrame.setBackground(new Color(200, 200, 200));
		jfaFrame.setAlwaysOnTop(true);
		jfaFrame.getContentPane().add(new JButton("Ant"));
		jfaFrame.setVisible(true);
		jfaFrame.setDefaultCloseOperation(jfaFrame.EXIT_ON_CLOSE);
	}
}
