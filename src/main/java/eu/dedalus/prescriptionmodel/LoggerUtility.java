package eu.dedalus.prescriptionmodel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class was automatically generated by the data modeler tool.
 */
public class LoggerUtility implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    private static Logger log = null;

	public static Logger initLog(){
	  if(log == null){
        log = LoggerFactory.getLogger("MYLOG");
        log.info("logger created");
	  } else {
	      log.info("logger returned");
	  }
	   return log;
	}
}