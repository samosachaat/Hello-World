import java.io.IOException;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		try {
		
		String APSC = "set volume 2 \n say \"Hello World \" \n ";
		String[] command = {"osascript", "-e", APSC};
				executeAppleScript(command);
				executeAppleScript(command);
				executeAppleScript(command);
				executeAppleScript(command);
				
		APSC = "set volume 5 \n say \"Hello user! \" \n ";
		String[] command3 = {"osascript", "-e", APSC};
			executeAppleScript(command3);
			
		//find to way to find their name (file paths) cba atm, got exams *melting emoji*
		
		APSC = "set volume 3 \n say \"I see you! \" \n ";
		String[] command1 = {"osascript", "-e", APSC};
			executeAppleScript(command1);
			executeAppleScript(command1);
			executeAppleScript(command1);
			executeAppleScript(command1);
			executeAppleScript(command1);
			
		APSC = "set volume 10 \n say \"Look behind you \" \n ";
		String[] command2 = {"osascript", "-e", APSC};
			executeAppleScript(command2);
			
		/*APSC = "set volume 10 \n say \"NOW! \" \n ";
		String[] command3 = {"osascript", "-e", APSC};
			executeAppleScript(command3);*/

			
		APSC = "set volume 3 \n say \"he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he he\" \n ";
		String[] command4 = {"osascript", "-e", APSC};
			executeAppleScript(command4);
			
		APSC = "set volume 10 \n say \"BOOM \" \n ";
		String[] command5 = {"osascript", "-e", APSC};
			executeAppleScript(command5);


		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void executeAppleScript(String[] script) throws IOException{
        // Construct the command to execute AppleScript
        String[] command = script;

        // Execute the command
        Process process = Runtime.getRuntime().exec(command);
        
       // Runtime.getRuntime().
        
       // process.wait

        // Wait for the process to finish
        try {
            //int exitCode = process.waitFor();
        	process.waitFor();
        	System.out.println(process.getErrorStream());
            //System.out.println("Exit Code: " + exitCode);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
 }

}
