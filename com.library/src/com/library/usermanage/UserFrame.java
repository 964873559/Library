package com.library.usermanage;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class UserFrame extends JFrame{
	
	 public static DefaultTableModel tableModel;   //���ģ�Ͷ���
	 public static  JTable table;
	String[] columnNames = {"���","�û���","�˺�"};
	public static int a = 1;
	
	public UserFrame(UserButtons userButtons, BottomButtons bottomButtons, 
			JudgeText text_2) {
	
		setTitle("\u7528\u6237\u7BA1\u7406");
		setBounds(350, 250, 579, 442);
		/*
		 *�������
		 */
		tableModel = new DefaultTableModel(null,columnNames);
		table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);   //֧�ֹ���
		scrollPane.setViewportView(table);
        table.setEnabled(false);
        table.getTableHeader().setReorderingAllowed(false); //���������ƶ� 
        table.getTableHeader().setResizingAllowed(false);//���ɱ༭
        DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(JLabel.CENTER);
		table.setDefaultRenderer(Object.class, r);
		/*
		 * �߽粼�����δ���Panel
		 */
		getContentPane().add(scrollPane,BorderLayout.CENTER);
		this.add(userButtons,BorderLayout.NORTH);
		this.add(bottomButtons,BorderLayout.SOUTH);
		this.setVisible(true);
		this.setResizable(false);
		
		
	}
}
