package com.library.usermanage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BottomButtons extends JPanel{
	
	public static MoreDetails md = null;
	public BottomButtons(){
		Init();
	}
	public  void Init() {
		//		�����µİ�ť
//	�ֱ���ʾ��������ť
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 228, 434, 24);
		this.add(panel_1);
		
//		�����ť
		JButton btnNewButton_1 = new JButton("\u8BE6\u7EC6\u4FE1\u606F");
		btnNewButton_1.addActionListener(new ActionListener(){//����¼�
            public void actionPerformed(ActionEvent e){
            	md = new MoreDetails();
            }
        });
		btnNewButton_1.setBounds(25, 0, 93, 23);
		panel_1.add(btnNewButton_1);
		
		
		JButton btnNewButton_2 = new JButton("\u6CE8\u9500\u7528\u6237");
		btnNewButton_2.addActionListener(new ActionListener() {
//		�����ť
			public void actionPerformed(ActionEvent e) {
				if(JudgeText.HBOOK==0){
					new DeleteUser();
				}
			}
		});
		btnNewButton_2.setBounds(177, 0, 93, 23);
		panel_1.add(btnNewButton_2);
		
	}

}
