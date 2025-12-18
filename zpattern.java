import java.util.Scanner;
public class Two3
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=0;
	    for(int i=1;i<=n;i++){
	        
	     for(int j=1;j<=n;j++){
	        if(i==1||j==n-2||i==n)
	          System.out.printf("* ");
	          else
	          System.out.print("  ");
	     }
	    System.out.println();
	
}
}
}

