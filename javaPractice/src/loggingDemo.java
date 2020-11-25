
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class loggingDemo {
	// mandatory statement for all
	private final static Logger log = LogManager.getLogger(loggingDemo.class.getName());  
             
	public static void main(String[] args)	{
		log.debug("debug");
		log.error("error");
	}
}
