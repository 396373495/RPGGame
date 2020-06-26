package RPG;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginUser implements ActionListener{
	
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        LoginUser login=new LoginUser();
        login.initUI();
    }

	protected JTextField tf_id;
	protected JPasswordField pf_paswd;
	static JFrame jf;

	private void initUI() {
		// TODO Auto-generated method stub
		jf = new JFrame();
		jf.setTitle("ǿ��֮·");
		jf.setSize(400,300);
        jf.setLocation(400, 300);
        
        //JFrame����
        setbackground(jf);
        
      //�߿򲼾ֹ���������
        jf.setLayout(new BorderLayout());
        jf.add(newNorthPanel(),BorderLayout.NORTH);
        jf.add(newWestPanel(),BorderLayout.WEST);
        jf.add(newSouthPanel(),BorderLayout.SOUTH);
        jf.add(newCenterPanel(),BorderLayout.CENTER);
        
        //͸����
        jf.setDefaultCloseOperation(3);//1�����أ�2�����ز��ͷţ�3��ֱ�ӹر�
        jf.setVisible(true);
	}

	//�����в����Ĵ�С���������������������û���������ģ��
    private Component newCenterPanel() {
		// TODO Auto-generated method stub
    	JPanel centerPanel = new JPanel();
    	//���һ����������ʽ���ֹ���������
        centerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        tf_id=new JTextField();
        tf_id.setPreferredSize(new Dimension(180,25));
        tf_id.setText("pig");
        JLabel lab_Reg=new JLabel("�û���");
        
        pf_paswd=new JPasswordField();
        pf_paswd.setPreferredSize(new Dimension(180,25));
        pf_paswd.setText("pig");
        JLabel laPwd=new JLabel("����");
        
        centerPanel.add(tf_id);
        centerPanel.add(lab_Reg);
        centerPanel.add(pf_paswd);
        centerPanel.add(laPwd);
        
        centerPanel.setOpaque(false);
        return centerPanel;
	}

	//�����ϲ����Ĵ�С������������������½ģ��
	private Component newSouthPanel() {
		// TODO Auto-generated method stub
		JPanel southPanel=new JPanel();
		southPanel.setPreferredSize(new Dimension(0,50));
		
        JButton login_bu= new JButton("��             ¼");
        //login_bu.setBackground(new Color(0,199,140));
        login_bu.setPreferredSize(new Dimension(120,30));
        
        southPanel.add(login_bu);
        southPanel.setOpaque(false);
        
        //�����½
        login_bu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String tf_id2=tf_id.getText();
		        String pf_paswd2=new String(pf_paswd.getPassword());
		        LogUser user = new LogUser();
		        user.setTf_id3(tf_id2);
		        user.setPf_paswd3(pf_paswd2);
		        //��֤�˻�����ȷ���¸�����
		        UserDB.init(user);
		        System.out.println(LogUser.getTf_id3()+"���ݳɹ�");
			}
        	
        });
        
		return southPanel;
	}

	//�����������Ĵ�С����������������ͷ��ģ��
	private Component newWestPanel() {
		// TODO Auto-generated method stub
		JPanel westPanel=new JPanel();
        westPanel.setPreferredSize(new Dimension(105,0));
        westPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        ImageIcon image=new ImageIcon("./pic/touxiang2.jpg");
        JLabel jlabelImage=new JLabel(image);
        westPanel.setOpaque(false);
        westPanel.add(jlabelImage);
        return westPanel;
	}

	//���ñ������Ĵ�С��������������������ģ��
	private Component newNorthPanel() {
		// TODO Auto-generated method stub
		JPanel northPanel=new JPanel();
        northPanel.setPreferredSize(new Dimension(0,100));
        JLabel biaoti=new JLabel("�û���½");
        biaoti.setForeground(new Color(41,36,33));
        biaoti.setFont(new Font("",Font.BOLD,30));
        biaoti.setHorizontalAlignment(JLabel.CENTER);
        northPanel.add(biaoti);
        northPanel.setOpaque(false);
        return northPanel;
	}

	//��������������������ģ��
	@SuppressWarnings("deprecation")
	private void setbackground(JFrame jf) {
		// TODO Auto-generated method stub
		ImageIcon image=new ImageIcon("./pic/bg3.jpg");
		JLabel jlb=new JLabel(image);
		jlb.setBounds(0, 0, image.getIconWidth(), image.getIconHeight());
		jf.getLayeredPane().add(jlb,new Integer(Integer.MIN_VALUE));
        JPanel contentPanel=(JPanel)jf.getContentPane();
        contentPanel.setOpaque(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
