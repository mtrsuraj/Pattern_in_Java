import java.util.*;
public class HalfRectangle {
    public static void main(String args[]){
        Scanner onj = new Scanner(System.in);
        int n= onj.nextInt();
        int m = onj.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
