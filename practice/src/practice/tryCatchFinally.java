package practice;
//if no execption thn finally block always execute.
public class tryCatchFinally {
	public static void main(String []args) {
		try {
			//System.out.println(10/0);
			System.out.println("try");
		}
		catch(Exception e) {
			System.out.println("error bc ="+e);
		}
		finally {
			System.out.println("finally");
		}
	}

}
