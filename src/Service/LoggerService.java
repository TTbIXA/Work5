package Service;

import java.util.logging.Logger;

public class LoggerService {
    private static final Logger logger = Logger.getLogger(LoggerService.class.getName());

    public void log(String message){
        logger.info(message);
    }
}
