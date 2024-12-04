import javax.swing.*;
import java.util.*;
public class Withdrawal {
	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		//System.out.println(balance);
		//รับจำนวนเงินที่ต้องถอน
		int moneyWithdraw = Integer.parseInt(
				JOptionPane.showInputDialog("Your balance : "+balance+
						"\nInput money to withdraw:"));
		//ตรวจสอบเงื่อนไข
		if(moneyWithdraw > balance) {
			JOptionPane.showMessageDialog(null,
					"Error : Cannot withdraw more than balance",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);			
		}else if(moneyWithdraw>50000) {
			JOptionPane.showMessageDialog(null,
					"Error : Cannot withdraw more than 50,000",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);				
		}else if(moneyWithdraw%100!=0) {
			JOptionPane.showMessageDialog(null,
					"Error : Cannot withdraw "+(moneyWithdraw%100)+" baht.",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);	
		}
		//ในกรณีที่ผ่านทุกเงื่อนไขข้างต้น
		else {
			JOptionPane.showMessageDialog(null,
					"You withdraw "+ moneyWithdraw + " baht."+
					"\n1,000 = "+(moneyWithdraw/1000)+
					"\n500 = "+((moneyWithdraw%1000)/500)+
					"\n100 = "+((moneyWithdraw%500)/100));
		}	 

	}

}
