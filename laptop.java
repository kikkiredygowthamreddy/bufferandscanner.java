import java.io.IOException;
import java.util.Scanner;
public class laptop{
    public static void main (String args[]) throws IOException{
        System.out.println("enter something like number");
       // InputStreamReader in = new InputStreamReader(System.in);
       // BufferedReader bf = new BufferedReader(in);
        //int num = Integer.parseInt(bf.readLine());
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();
        
    }
    
}