package cs105.w2.s2;

public class ICEx6 {

	public static void main(String[] args) {
		String originStr = "Something beautiful!";
		String temporaryStr ="";
		for (int i = originStr.length()-1; i >= 0; i--) {
			temporaryStr = temporaryStr + originStr.charAt(i);
		}
		
		originStr = temporaryStr;
		
		System.out.println(originStr);

	}

}
