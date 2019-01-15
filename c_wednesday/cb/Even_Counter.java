package cb;

import java.util.Scanner;

public class Even_Counter {
 
    public static void main(String[] args) {
        
        int[] even=new int[1000];
        for (int i=1;i<=1000;i++) {
            even[i-1]=i*2;
            System.out.println(even[i-1]);
            
        }
        
        System.out.println("Give me an even number to return the position: ");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        
        for(int j=0;j<even.length;j++) {
            if(even[j]!=number)
                continue;
                System.out.println("In position: "+(j+1));
            
            
            }
        scanner.close();
    }
}