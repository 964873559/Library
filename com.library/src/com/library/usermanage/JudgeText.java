package com.library.usermanage;

import javax.swing.JTextPane;

import com.library.userdata.UserData;

//������Ϣ����
public class JudgeText{
	protected JTextPane txtInf;
	public static String ID;
	public static int HBOOK ;
	public static String NAME;
	public static String NUM;
	public static String BOOK;
	
	public void SetText(){
		String str = UserButtons.textField_1.getText();
		for (int i = 0; i < UserData.account.length; i++) {
			String aSource_1 = UserData.account[i];
			String aSource_2 = UserData.id[i]; 
			String aSource_3 = UserData.name[i];
			if (aSource_1 == null || str == null||aSource_2 == null||aSource_3 == null) {
				UserButtons.txtInf.setText("δ�ܳɹ��ҵ��û�");
			}
			else if (aSource_1.equals(str)||aSource_2.equals(str)||aSource_3.equals(str)) {
				while(UserFrame.tableModel.getRowCount()>0){
					 UserFrame.tableModel.removeRow(UserFrame.tableModel.getRowCount()-1);}
				JudgeText.ID = UserData.id[i];
				JudgeText.NAME = UserData.name[i];
				JudgeText.NUM = UserData.account[i];
				JudgeText.HBOOK = UserData.hbooks[i];
				UserFrame.tableModel.addRow(new Object[] {JudgeText.ID,JudgeText.NAME,JudgeText.NUM});
				UserButtons.txtInf.setText("��ѯ�ɹ���");
				return;
			}
		}
	}
}
