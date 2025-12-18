import java.util.Scanner;
public class Numtri{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>=n+1){
                System.out.print(num++ +"  ");
                }else{
                    System.out.print("");
                }
                
            }
            System.out.println();
        }
    }
}