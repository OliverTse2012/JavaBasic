package logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = Logger.getLogger("logging"); 
        log.setLevel(Level.WARNING);
        
        Logger log2 = Logger.getLogger("com.logging"); 
        log2.setLevel(Level.WARNING);
        log.info("aaa");
        log2.info("bbb");
	}
}
