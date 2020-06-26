package page;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import game.GHframe;

public class Occupationpage implements ActionListener{

	public static void main() {
		// TODO Auto-generated method stub
		Occupationpage occupation = new Occupationpage();
		occupation.initUI();
	}

	static String OC;
	static JRadioButton OC_text1;
	static JRadioButton OC_text2;
	static JFrame OCpage1;

	private void initUI() {
		// TODO Auto-generated method stub
		OCpage1 = new JFrame();
		OCpage1.setTitle("ǿ��֮·");
		OCpage1.setSize(400,300);
		OCpage1.setLocation(490, 230);

        //���汳��
        setbackground(OCpage1);
        
      //�߿򲼾ֹ���������
        OCpage1.setLayout(new BorderLayout());
        OCpage1.add(newNorthPanel(),BorderLayout.NORTH);
        OCpage1.add(newCenterPanel(),BorderLayout.CENTER);
        OCpage1.add(newSouthPanel(),BorderLayout.SOUTH);
        

        OCpage1.setDefaultCloseOperation(3);
        OCpage1.setVisible(true);
	}

	//����
	private Component newNorthPanel() {
		// TODO Auto-generated method stub
		JPanel northPanel = new JPanel();
		
		JLabel biaoti = new JLabel("ְҵѡ��");
		
        biaoti.setForeground(new Color(41,36,33));
        biaoti.setFont(new Font("",Font.BOLD,30));
        biaoti.setHorizontalAlignment(JLabel.CENTER);
        
        northPanel.setOpaque(false);
        
        northPanel.add(biaoti);
        
        return northPanel;
	}

	//ְҵѡ��
	private Component newCenterPanel() {
		// TODO Auto-generated method stub
		JPanel centerPanel = new JPanel();
        //�����������Ĵ�С
		centerPanel.setPreferredSize(new Dimension(0,0));
		centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        //ʵ����һ��ImageIcon��Ķ���
		ImageIcon image1 = new ImageIcon("./pic/touxiang1.jpg");
        ImageIcon image2 = new ImageIcon("./pic/touxiang2.jpg");
        
        JLabel OC_image1 = new JLabel(image1);
        JLabel OC_image2 = new JLabel(image2);
        
        OC_text1 = new JRadioButton("����");
        OC_text2 = new JRadioButton("С��");
        
        ButtonGroup OC_text = new ButtonGroup(); 
        OC_text.add(OC_text1);
        OC_text.add(OC_text2);
        
        //�������͸��ɫ
        centerPanel.setOpaque(false);
        
        centerPanel.add(OC_image1);
        centerPanel.add(OC_text1);
        centerPanel.add(OC_image2);
        centerPanel.add(OC_text2);
        
        return centerPanel;
	}

	//��½��ť
	private Component newSouthPanel() {
		// TODO Auto-generated method stub
		JPanel southPanel = new JPanel();
		//�����������Ĵ�С
		southPanel.setPreferredSize(new Dimension(0,50));
		
        JButton OC_login = new JButton("ȷ             ��");
        
        OC_login.setBackground(new Color(0,199,140));
        OC_login.setPreferredSize(new Dimension(120,30));
        
        //�������͸��ɫ
        southPanel.setOpaque(false);
        
        southPanel.add(OC_login);
        
        //ѡ��ְҵ�Ժ�
        OC_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DefaultButtonModel OC_select = (DefaultButtonModel) OC_text1.getModel();
				if(OC_select.getGroup().isSelected(OC_select)) {
					OC = "1";
				}else {
					OC = "2";
				}
				System.out.println(OC);
				OCpage1.setVisible(false);
				GHframe.main();//��GHframeҳ���main()�е�ɾ��
			}
        	
        });
		
		return southPanel;
	}

	private void setbackground(JFrame oCpage1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
