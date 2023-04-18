import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
	int rowNumber,colNumber,size;
	int[][] map;
	int[][] board;
	boolean gameStatus=true;
	
	Random rastgele=new Random();
	Scanner girdi = new Scanner(System.in);

	MayinTarlasi(int rowNumber, int colNumber) {
		this.rowNumber=rowNumber;
		this.colNumber=colNumber;
		this.map=new int[rowNumber][colNumber];
		this.board=new int[rowNumber][colNumber];
		this.size=rowNumber*colNumber;
	}
	public void kontrol(int row, int col) {
		if(board[row][col]==0) {
			if(map[row][col+1] == -1) {
				board[row][col]++;				
			}
			if(map[row+1][col]==-1) {
				board[row][col]++;			
			}
			if(map[row][col-1]==-1) {
				board[row][col]++;
			}
			if(map[row-1][col]==-1) {
				board[row][col]++;
			}
		}
	}
	public void run() {
		prepGame();
		System.out.println("Oyun Başladı!");
		print(map);		
		while(gameStatus) {
			print(board);
			int r,c;
			System.out.print("Satır numarasını girin:");
			r=girdi.nextInt();
			System.out.print("Sütun numarasını girin:");
			c=girdi.nextInt();
			if (map[r][c]!=-1) {
			kontrol(r, c);
			}
			else {
				gameStatus=false;
				System.out.println("Game Over!");
				}
			//continue;
		}
	}
	
	public void prepGame() {
		int randRow,randCol,count=0;
		while(count!=(size/4)) {
			randRow=rastgele.nextInt(rowNumber);
			randCol=rastgele.nextInt(colNumber);
			if(map[randRow][randCol]!=-1) {
			   map[randRow][randCol]=-1;
			}
			count++;
		}
		
	}
	public void print(int[][] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[0].length; j++) {
				if(dizi[i][j] >=0 ) {
					System.out.print(" ");
				}
				System.out.print(dizi[i][j]+" ");
				
				}
			System.out.println();
}
		System.out.println("------------");
	}
}

