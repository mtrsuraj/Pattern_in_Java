import java.util.*;
public class InvertedHalfPiramid {
    public static void main(String ard[]){
        Scanner In = new Scanner(System.in);
        int n= In.nextInt();
        int m= In.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=i; j<=m; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
