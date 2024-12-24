import java.text.SimpleDateFormat;
import java.util.Random;
public class UserComment implements Runnable {
	
	private String userName;
	 
	
	public UserComment(String userName) {
		this.userName=userName;
	}
	
	public String getName(){
		return userName;
	}
	
	@Override
	public void run() {
		String[] comments = {
		"Hi "  ,	
		"How are you doing "	,
		" hows it going "	,		
		"hello "		
		};
		
		Random chat = new Random ();
		
		Random latency = new Random();
		
		String msg;
		int lat;
		
		for(int i = 0;i<10;i++) {
			
			
			
		
		
		 msg=comments[chat.nextInt(4)];
		
		 lat=latency.nextInt(10000);
		
		 System.out.println("["
				
				 +"]"
				 +getName()
				 +":"
				 +msg
				 );
		
		 try {
			 Thread.sleep(lat);
			 
		 }catch(InterruptedException e) {
			 
		 }
		 
		
		}
			
		
	}

}
