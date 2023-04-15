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
*/
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

        // Matrisin elemanlarını kullanıcıdan al
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + i + "][" + j + "] elemanını girin: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Matrisi ekrana yazdır
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
