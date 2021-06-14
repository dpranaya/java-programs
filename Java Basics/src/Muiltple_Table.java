import java.util.Scanner;
public class Muiltple_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int N = in.nextInt();
	        if(N>=2||N<=20){
	            for(int i=1;i<=10;i++){
	                
	                System.out.println(N+" x "+i+" = "+N*i );
	            }
	        }
	}

}
