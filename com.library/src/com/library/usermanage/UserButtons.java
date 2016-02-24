package com.library.usermanage;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class UserButtons extends JPanel{
	
	public static JTextField textField_1;
	public static JTextPane txtInf;

	public UserButtons(){
		Init();
	}

	private void Init() {
		
		this.setLayout(new FlowLayout());
//		�������û���ѯ����Ť
		JButton btnNewButton = new JButton("\u7528\u6237\u67E5\u8BE2");
		this.add(btnNewButton);
		
//		��ť�����¼�
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new JudgeText().SetText();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		/*
		 * �����ı���Ĵ���
		 */
			textField_1 = new JTextField(20);
			textField_1.setText("                  �������û���Ϣ                 ");
			this.add(textField_1);
			/*
	    	������ı���ʾ������ʧ
			������¼�*/
			textField_1.addMouseListener(new MouseListener(){
				@Override
				public void mouseClicked(MouseEvent e) {
					textField_1.setText("");
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
				}
				
				@Override
				public void mouseReleased(MouseEvent e) {
				}
				
				@Override
			public void mouseEntered(MouseEvent e) {
			}
			
				@Override
				public void mouseExited(MouseEvent e) {
			}
		});
			
			/*
			 * ��ʾ��Ϣ�Ĵ���
			 */
				txtInf = new JTextPane();
				txtInf.setText("�����ѯ�����û�");
				txtInf.setForeground(Color.RED);
				txtInf.setBackground(getBackground());
				txtInf.setEditable(false);
				this.add(txtInf );
	}
	}
