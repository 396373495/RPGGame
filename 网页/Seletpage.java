package page;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Seletpage implements ActionListener{

	public static void main() {
    	// TODO Auto-generated method stub
        Seletpage seletpage=new Seletpage();
        seletpage.initUI();
    }

	static String music;

	private void initUI() {
		// TODO Auto-generated method stub
		JFrame seletpage1 = new JFrame();
		seletpage1.setTitle("ǿ��֮·");
		seletpage1.setSize(400,300);
		seletpage1.setLocation(400, 300);
		
		//���ý��汳��
		setbackground(seletpage1);
		
		seletpage1.setLayout(new FlowLayout(1,200,30));
		
		JLabel mus_jl = new JLabel("����");
		JRadioButton mus_on = new JRadioButton("��");
	    JRadioButton mus_no = new JRadioButton("��");
	    ButtonGroup group = new ButtonGroup(); 

	    group.add(mus_on);
	    group.add(mus_no);
	    
	    JButton seletpage1_close = new JButton("ȷ��");
	    
		//mus_jl.setOpaque(true);
		//mus_jl.setForeground(new Color(255,0,158));
		//mus_jl.setBackground(Color.BLUE);
		//mus_jl.setPreferredSize(new Dimension(20,25));
		
		seletpage1.add(mus_jl);
		seletpage1.add(mus_on);
		seletpage1.add(mus_no);
		seletpage1.add(seletpage1_close);
		
		seletpage1.setDefaultCloseOperation(2);
		seletpage1.setVisible(true);
		
		//������ѡ�����ֽ��п���
		seletpage1_close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DefaultButtonModel model = (DefaultButtonModel) mus_on.getModel();
				if(model.getGroup().isSelected(model)) {
					music = "1";
				}else {
					music = "2";
				}
				System.out.println(music);
				seletpage1.setVisible(false);
				Homepage.homepage1.setVisible(true);
				Music.main();
			}
			
		});
	}

	private void setbackground(JFrame seletpage1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
