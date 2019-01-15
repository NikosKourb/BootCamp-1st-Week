package cb;

public class Swap2 {

	public static void main(String[] args) {
		int[] mylist = {1,2,3,4,5,6,7,8};
		int z=mylist.length;
	       
        System.out.print("{ ");
        for (int y=0; y<mylist.length; y++) {
        	
            System.out.print(mylist[y]+",");
            
        }
        System.out.print(" }");
        
        swap(mylist);
        
        System.out.print(" { ");
        for (int z1=0; z1<mylist.length; z1++) {
        	
            System.out.print(mylist[z1]+",");
            
        }
        System.out.print(" }");
    }   
    public static void swap(int[]a) {
    	int i=0;
    	int x=a[i];
        for (i=0; i<(a.length-1); i++) {
        	a[i]=a[i+1];
        }
        a[a.length-1]=x;

	}

}
