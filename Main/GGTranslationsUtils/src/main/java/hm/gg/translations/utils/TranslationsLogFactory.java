package hm.gg.translations.utils;

import java.util.logging.Logger;

public class TranslationsLogFactory {
	public static TranslationsLogger getLoggerInstance(final String className) {
		TranslationsLogger logger = new TranslationsSlf4jLoggerImpl(className);
		return logger;
	}

	public static TranslationsLogger getLoggerInstance(final String className, final String contractName) {
		TranslationsLogger logger = new TranslationsSlf4jLoggerImpl(className);
		return logger;
	}
	
	public static void printLogs() {
		printSlf4jLogs();
		printLog4j2Logs();
		printJulLogs();
	}
	
	public static void printSlf4jLogs() {
		final TranslationsLogger logger = new TranslationsSlf4jLoggerImpl(TranslationsLogFactory.class.getName());
		logger.log(TranslationsLogger.INFO,  "--------- Slf4j INFO  Log ---------");
		logger.log(TranslationsLogger.DEBUG, "--------- Slf4j DEBUG Log ---------");
		logger.log(TranslationsLogger.WARN,  "--------- Slf4j WARN  Log ---------");
		logger.log(TranslationsLogger.ERROR, "--------- Slf4j ERROR Log ---------");
	}
	
	public static void printLog4j2Logs() {
		final TranslationsLogger logger = new TranslationsSlf4jLoggerImpl(TranslationsLogFactory.class.getName());
		logger.log(TranslationsLogger.INFO,  "--------- Log4j2 INFO  Log ---------");
		logger.log(TranslationsLogger.DEBUG, "--------- Log4j2 DEBUG Log ---------");
		logger.log(TranslationsLogger.WARN,  "--------- Log4j2 WARN  Log ---------");
		logger.log(TranslationsLogger.ERROR, "--------- Log4j2 ERROR Log ---------");
	}
	
	public static void printJulLogs() {
		final Logger jul = Logger.getLogger("com/sel2in/smsWebSend/logger/Sel2inLogFactory.getName()");
		jul.info(   "--------- J.U.L. INFO    Log ---------");
		jul.warning("--------- J.U.L. WARNING Log ---------");
		jul.severe( "--------- J.U.L. SEVERE  Log ---------");
	}

}
