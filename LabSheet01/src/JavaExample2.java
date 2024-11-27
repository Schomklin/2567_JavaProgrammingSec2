import javax.swing.*;
public class JavaExample2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//แสดงผลและรับข้อมูลชื่อสินค้าทาง Dialog box
		String productName = JOptionPane.showInputDialog("Input Product Name:");
		//แสดงผลและรับข้อมูลจำนวนสินค้าทาง Dialog box
		String strProductUnit = JOptionPane.showInputDialog("Input Product Unit:");
		int productUnit = Integer.parseInt(strProductUnit);
		//แสดงผลและรับข้อมูลราคาสินค้าทาง Dialog box
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog(""
				+ "Input Price per Unit:"));
		
		double totalPriceofProduct = productUnit *productPrice;
		//คำนวณภาษีเพิ่ม 7%
		double totalwithVat = totalPriceofProduct * 1.07;
		String frmtotalPriceofProduct = String.format("%,.2f",totalPriceofProduct);
		String frmtotalwithVat = String.format("%,.2f",totalwithVat);
		//สั่งแสดงผลทาง Dialog box
		JOptionPane.showMessageDialog(null, 
				"Total Price is "+frmtotalPriceofProduct +" baht."+
		        "\nAdd VAT7% is "+frmtotalwithVat+ " baht.");
		
		
		
		

	}

}
