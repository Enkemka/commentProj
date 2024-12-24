
public class threadOne  {

	
	public static void main(String[]args){
		
		UserComment one = new UserComment("userOne");
		
        Thread first = new Thread(one);	
         first.start();
		
	
	}
	
}
