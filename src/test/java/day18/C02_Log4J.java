package day18;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class C02_Log4J {

//3. Logger object olustur:
//    private static Logger logger = LogManager.getLogger(Demo1.class.getName());
//4. Logger fonksiyonuyla istenilen fonksiyonu kullan
//                 logger.debug("Debug logger");
//        logger.info("Info logger");
//        logger.error("Error logger");
//        logger.fatal("Fatal logger");
    private static Logger logger= LogManager.getLogger(C02_Log4J.class.getName());

@Test
    public void log4jTest(){
    //Logger objesi ile yazdırma işlemmi
logger.fatal("Fatal.Log!");
logger.error("Error Log!");
logger.warn("Warn Log");
logger.debug("Debug log!");
logger.info("İnfo Log!");



    }
}