/*
public class MultiverseArray {

	public static void main(String[] args) {
		int[][] list1=new int[][] {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
		
		
		};
		for (int i = 0; i < list1.length; i++) {
			System.out.println(list1.length);
			System.out.println("i="+ i);
			for (int j = 0; j < list1[0].length; j++) {
				System.out.println("j="+ j);
				System.out.print(list1[i][j] +",");
			}
			System.out.println();
		}
		

}
}
*/ // 22:16 güncellemesi 22:20
import java.util.Random;
import java.util.Scanner;

public class MultiverseArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Matrisin boyutlarını kullanıcıdan al
        System.out.print("Matrisin satır sayısını girin: ");
        int row = input.nextInt();

        System.out.print("Matrisin sütun sayısını girin: ");
        int col = input.nextInt();

        // Kullanıcıdan girilen boyutlarda bir matris oluştur
        int[][] matrix = new int[row][col];
        int k=0;
        Random rastgele = new Random();

        // Matrisin elemanlarını kullanıcıdan al
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
            	k=rastgele.nextInt(row*col);
            	System.out.println("[" + i + "][" + j + "] elemanı için girilen değer: "+ k);
                
            	matrix[i][j] = k;
                
                
            }
        }

        // Matrisi ekrana yazdır
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]<10) {
                	System.out.print(matrix[i][j] + "  |");
                }
                else {
                	System.out.print(matrix[i][j] + " |");
                }
                }
            System.out.println("");
            }
           
        }
    }

