package page;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Homepage implements ActionListener{
	
	public static void main() {
    	// TODO Auto-generated method stub
        Homepage homepage=new Homepage();
        homepage.initUI();
    }

	static JFrame homepage1;

	public void initUI() {
		// TODO Auto-generated method stub
		homepage1 = new JFrame();
		homepage1.setTitle("强者之路");
		homepage1.setSize(400,300);
        homepage1.setLocation(400, 300);
        
        //主界面背景
        setbackground(homepage1);
        
        //居中对齐，x相隔200，y相隔50
        homepage1.setLayout(new FlowLayout(1,200,50));
        
        JButton JB1 = new JButton("开始冒险");
        JButton JB2 = new JButton("游戏帮助");
        JButton JB3 = new JButton("游戏设置");

        homepage1.add(JB1);
        homepage1.add(JB2);
        homepage1.add(JB3);
        
        homepage1.setDefaultCloseOperation(3);
        homepage1.setVisible(true);
        
        JB1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				homepage1.setVisible(false);
				Occupationpage.main();
			}
        	
        });
        
        //点击打开pic目录下的帮助文件
        JB2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
                    String[] cmd = new String[]{"cmd.exe", "/c", "start",".\\pic\\help.txt"};
                    Runtime.getRuntime().exec(cmd);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                	System.out.println("未找到文件！");
					e1.printStackTrace();
                }
			}
        	
        });
        
        //点击游戏设置进入设置界面
        JB3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//homepage1.setVisible(false);
				Seletpage.main();
			}
        	
        });
	}

	private void setbackground(JFrame homepage1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
