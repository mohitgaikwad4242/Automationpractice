package Pattern;

public class PrintStarTriangle {
//	public static void StarTriangle(int n) {
	public static void main(String[] args) {
		for(int i=0; i<5 ; i++)
		{
			for(int j=5-1; j>1 ; j--)	
			{
				System.out.println(" ");
			}
			for(int j=0; j<=i ; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}}

/*	public static void main(String[] args) {
		//int n=5;
		StarTriangle(4);
	}

}*/
