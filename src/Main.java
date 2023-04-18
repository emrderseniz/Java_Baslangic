import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int row,col;
		Scanner girdi = new Scanner(System.in);
		
	//	System.out.println("Mayın tarlasına hoş geldiniz!\n Lütfen istediğiniz Boyutları girin \n varsayılan 4x4 \n satır sayısını giriniz:");
	//	row=girdi.nextInt();
	//	System.out.print("Sütun sayısını giriniz:");
	//	col=girdi.nextInt();
		
		MayinTarlasi oyun = new MayinTarlasi(5, 5);
		oyun.run();
		}



}