package RPG;

import javax.swing.JOptionPane;

import RPG.LogUser;
import page.Homepage;
import RPG.LoginUser;

public class UserDB {

	private static String tf_id4;
	private static String pf_paswd4;

	public static void init(LogUser user) {
		// TODO Auto-generated method stub
		tf_id4 = LogUser.getTf_id3();
		pf_paswd4 = LogUser.getPf_paswd3();
		
		String usertrue = "pig";
		String pawdtrue = "pig";
		//String a = LogUser.getTf_id3();
		//System.out.println(a)
		if(tf_id4.equals(usertrue) && pf_paswd4.equals(pawdtrue)) {
			LoginUser.jf.setVisible(false);
			System.out.print("������ȷ��ת��������!");
			//��ת��������
			Homepage.main();
		}else JOptionPane.showMessageDialog(null, "�������ֵ����", "��¼����", JOptionPane.QUESTION_MESSAGE);
		
	}


}
