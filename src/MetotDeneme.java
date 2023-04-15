
public class MetotDeneme {
	public static int topla(int x,int y) {
		int toplam;
		toplam=x+y;
		return toplam;
	}
	public static boolean ciftMi(int x) {
		if(x%2==0) {
			return true;
		}
		else {
		return false;
		}
	}
	public static int fiboHesap(int x) {
		int a=0,b=1,toplam = 0;
		for (int i = 1; i <= x; i++) {
			toplam=a+b;
			a=b;
			b=toplam;

		}
		//System.out.println(toplam);
		return toplam;
	}

	public static void main(String[] args) {
		int x;
		x=topla(54,4);
		System.out.println(x);
		boolean y;
		y=ciftMi(x); 
		String durum = y?"sayi çift":"sayi tek";	
			System.out.println(durum);
			int fibo;
			fibo=fiboHesap(5);
			System.out.println(fibo);
		}
	

	}
	


