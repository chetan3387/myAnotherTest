package practice;
//first priority will go to finally. 999 will print.
public class tryCathFinallyReturn {
	public static int m1() {
		try {
			return 111;
		}
		catch(Exception e) {
			return 222;
		}
		finally {
			return 999;
		}
	}
	public static void main(String []args) {
		System.out.println(m1());
	}
}
