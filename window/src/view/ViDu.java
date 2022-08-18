package view;

import javax.swing.JFrame;

public class ViDu {
	public static void main(String[] args) {
		// gắn tên
		JFrame jf = new JFrame();
		jf.setTitle("ViDu JFrame");
		// size
		jf.setSize(600,400);
		// cho phép hiển thị
		jf.setVisible(true);
		
//		while(true) {
//			System.out.println("Chương trình đang chạy"); 
//		}
		jf.setLocation(300,300);
		// thoát ra khỏi chương trình khi đóng cửa sổ
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		// cho phép hiển thị
				jf.setVisible(true);
	}
}


