package com.library.main;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Version extends JFrame {

	private JPanel contentPane;


	/**
	 * �汾��ϢFrame
	 */
	public Version() {
		setBounds(420, 320, 450, 300);
		setTitle("�汾��Ϣ");
		setResizable(false);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*
		 * �汾��ϢLabel
		 */
		JLabel lblNewLabel = new JLabel("\u6D4B\u8BD5\u7248\u672C");
		lblNewLabel.setBounds(173, 21, 109, 54);
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);
		
		/*
		 * �汾��Label
		 */
		JLabel lblNewLabel_1 = new JLabel("Version 1.0");
		lblNewLabel_1.setBounds(157, 85, 109, 37);
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_1);
		
		/*
		 * ������Ա
		 */
		JLabel lblNewLabel_2 = new JLabel("\u5F00\u53D1\u4EBA\u5458\uFF1A");
		lblNewLabel_2.setBounds(72, 157, 109, 37);
		lblNewLabel_2.setFont(new Font("����", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("���ǟj�����Ǳ󣬻�����");
		lblNewLabel_3.setBounds(167, 157, 249, 37);
		lblNewLabel_3.setFont(new Font("����", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_3);
		
	}
}
