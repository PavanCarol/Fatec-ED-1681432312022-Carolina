package verissimo;

public class fibonacci {
	  public static void main(String[] args){
	        int var1 = 1;
	        int var2 = 0;
	        
	     
	        
	        for(int i = 0; i < 8; i++){
	            var1 = var1 + var2;
	            var2 = var1 - var2;
	            System.out.println(var1);
	        }
	    }
}
