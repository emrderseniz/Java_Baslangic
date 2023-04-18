
/*public class PalindromKelimeler {

	public static void main(String[] args) {
		// ütü teğet tenet charat
		String metin="kapaks",hedefMetin="";
		for (int i = metin.length()-1; i >= 0; i--) {
			System.out.println("şu anda i:" + i);
			hedefMetin+=metin.charAt(i);
			System.out.println(hedefMetin);
		}
		if(metin.equals(hedefMetin)) {
			System.out.println(hedefMetin + " polindromik bir kelimedir");
			
		}else {
			
			System.out.println("değildir.");	
			
		}
		

	}

}
*/
public class PalindromKelimeler {

    public static void main(String[] args) {
        String metin = "kapak";
        String hedefMetin = "";
        for (int i = metin.length() - 1; i >= 0; i--)
            hedefMetin += metin.charAt(i);
        System.out.println(metin + (metin.equals(hedefMetin) ? " polindromik bir kelimedir" : " polindromik bir kelime değildir"));
    }

}
