package gamestart;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyFrameMouse implements MouseListener {
	static int [] clx = {68,126,184,242,300,358,416,474,532};
	static int [] cly = {87,139,191,243,295,347,399,451,503,555};
	

	
	public void mouseClicked(MouseEvent e) {
		 int x,y;
		 int i,j;
		 Point dp = e.getPoint();//得到点击的位置
         x=dp.x;
         y=dp.y-35;
         System.out.println(Gamestart.rmove);
         //------------红色棋子--------------
         if(Gamestart.rdClicked) {
			 if(Gamestart.rmove) {
				 if(Gamestart.rd == 1) {
			         for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.redsoldier1.getX() == clx[i] && Gamestart.redsoldier1.getY() == cly[j]) {
			        			 if(cly[j] > 295) {
			        				 //过河之前只能向前走
			        				 if(x > clx[i] && x < clx[i+1] && y > cly[j-1] && y < cly[j]) {
				        				 Gamestart.redsoldier1.setLocation(clx[i],cly[j-1]);		//设置位置
								         Gamestart.rdClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;
			        				 }
			        			 }else {
			        				 //判断向前走的位置
			        			//	 if(Gamestart.redsoldier1.getX() == clx[0])
			        				 System.out.println("******************************");
			        				 if(x > clx[i] && x < clx[i+1] && y > cly[j-1] && y < cly[j]) {
				        				 Gamestart.redsoldier1.setLocation(clx[i],cly[j-1]);		//设置位置
								         Gamestart.rdClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;
			        				 }
			        				 //判断右走的位置
			        				 if(x > clx[i+1] && x < clx[i+2] && y > cly[j] && y < cly[j+1]) {
				        				 Gamestart.redsoldier1.setLocation(clx[i+1],cly[j]);		
								         Gamestart.rdClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;
			        				 }
			        				//判断左走的位置
			        			/*	 if(x > clx[i-1] && x < clx[i-2] && y > cly[j] && y < cly[j+1]) {
			        					 Gamestart.redsoldier1.setLocation(clx[i-1],cly[j]);		
								         Gamestart.rdClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;
			        				 }*/
			        			 }
			        		 }
			        		 
			        	 }
			         }
				 }
			 }else {
				 ErrorTip.tip();
			 }
         }
         //红色兵
     /*    if(Gamestart.rdClicked) {
			 if(Gamestart.rmove) {
		        if(Gamestart.rd == 1) {	//判断棋子
			         if(x > clx[0] && x < clx[1] && y > cly[5] && y < cly[6]) {//设置范围
			        	 if(Gamestart.redsoldier1.getX() == clx[0] && Gamestart.redsoldier1.getY() == cly[6]) {
					         Gamestart.redsoldier1.setLocation(clx[0],cly[5]);		//设置位置
					         Gamestart.rdClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.rd == 2) {
			         if(x > clx[2] && x < clx[3] && y > cly[5] && y < cly[6]) {
			        	 if(Gamestart.redsoldier2.getX() == clx[2] && Gamestart.redsoldier2.getY() == cly[6]) {
					         Gamestart.redsoldier2.setLocation(clx[2],cly[5]);
					         Gamestart.rdClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.rd == 3) {
			         if(x > clx[4] && x < clx[5] && y > cly[5] && y < cly[6]) {
			        	 if(Gamestart.redsoldier3.getX() == clx[4] && Gamestart.redsoldier3.getY() == cly[6]) {
					         Gamestart.redsoldier3.setLocation(clx[4],cly[5]);
					         Gamestart.rdClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.rd == 4) {
			         if(x > clx[6] && x < clx[7] && y > cly[5] && y < cly[6]) {
			        	 if(Gamestart.redsoldier4.getX() == clx[6] && Gamestart.redsoldier4.getY() == cly[6]) {
					         Gamestart.redsoldier4.setLocation(clx[6],cly[5]);
					         Gamestart.rdClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.rd == 5) {
			         if(x > clx[8] && x < clx[9] && y > cly[5] && y < cly[6]) {
			        	 if(Gamestart.redsoldier5.getX() == clx[8] && Gamestart.redsoldier5.getY() == cly[6]) {
					         Gamestart.redsoldier5.setLocation(clx[8],cly[5]);
					         Gamestart.rdClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		         }
			 }else {
				 ErrorTip.tip();
			 }
         }*/
         //红炮
         if(Gamestart.rgClicked) {
			 if(Gamestart.rmove) {
		        if(Gamestart.rg == 1) {	//判断棋子
		        	
		         }
		        //-------------------------第二个炮
		         if(Gamestart.rg == 2) {
		         
		         }
			 }else {
				 ErrorTip.tip();
			 }
         }
		 //黑色棋子
         if(Gamestart.bdClicked) {
			 if(Gamestart.bmove) {
		         if(Gamestart.bd == 1) {	//判断棋子
			         if(x > clx[0] && x < clx[1] && y > cly[4] && y < cly[5]) {		//设置范围
			        	 if(Gamestart.blacksoldier1.getX() == clx[0] && Gamestart.blacksoldier1.getY() == cly[3]) {
					         Gamestart.blacksoldier1.setLocation(clx[0],cly[4]);		//设置位置
					         Gamestart.bdClicked = false;
							 Gamestart.bmove = false;
							 Gamestart.rmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.bd == 2) {
			         if(x > clx[2] && x < clx[3] && y > cly[4] && y < cly[5]) {
			        	 if(Gamestart.blacksoldier2.getX() == clx[2] && Gamestart.blacksoldier2.getY() == cly[3]) {
					         Gamestart.blacksoldier2.setLocation(clx[2],cly[4]);
					         Gamestart.bdClicked = false;
							 Gamestart.bmove = false;
							 Gamestart.rmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.bd == 3) {
			         if(x > clx[4] && x < clx[5] && y > cly[4] && y < cly[5]) {
			        	 if(Gamestart.blacksoldier3.getX() == clx[4] && Gamestart.blacksoldier3.getY() == cly[3]) {
					         Gamestart.blacksoldier3.setLocation(clx[4],cly[4]);
					         Gamestart.bdClicked = false;
							 Gamestart.bmove = false;
							 Gamestart.rmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.bd == 4) {
			         if(x > clx[6] && x < clx[7] && y > cly[4] && y < cly[5]) {
			        	 if(Gamestart.blacksoldier4.getX() == clx[6] && Gamestart.blacksoldier4.getY() == cly[3]) {
					         Gamestart.blacksoldier4.setLocation(clx[6],cly[4]);
					         Gamestart.bdClicked = false;
							 Gamestart.bmove = false;
							 Gamestart.rmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.bd == 5) {
			         if(x > clx[8] && x < clx[8]+53 && y > cly[4] && y < cly[5]) {
			        	 if(Gamestart.blacksoldier5.getX() == clx[8] && Gamestart.blacksoldier5.getY() == cly[3]) {
					         Gamestart.blacksoldier5.setLocation(clx[8],cly[4]);
					         Gamestart.bdClicked = false;
							 Gamestart.bmove = false;
							 Gamestart.rmove = true;
			        	 }
			         }
		         }
			 }else {
				 ErrorTip.tip();
			 }
         }
     }
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
