package page;

import javax.swing.JFrame;
import page.Seletpage;

@SuppressWarnings("serial")
public class Music extends JFrame{

	public static void main() {
		// TODO Auto-generated method stub
		Music music_open = new Music();
		music_open.playmusic();
	}

	private void playmusic() {
		// TODO Auto-generated method stub
		if(Seletpage.music.toString() != "2") {
			System.out.println("≤•∑≈“Ù¿÷");
		}else System.out.println("πÿ±’“Ù¿÷");
	}

}
