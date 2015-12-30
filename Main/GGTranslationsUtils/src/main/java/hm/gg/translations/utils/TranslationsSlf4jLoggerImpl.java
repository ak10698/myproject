package hm.gg.translations.utils;

import org.slf4j.LoggerFactory;

public class TranslationsSlf4jLoggerImpl implements TranslationsLogger {


	private transient final org.slf4j.Logger logger;

	public TranslationsSlf4jLoggerImpl(String className) {
		logger = LoggerFactory.getLogger(className);
	}

	public void log(final int level, Object message1) {
		String message = (String)message1;
		message = logger.getName() + ": " + message;
		switch (level) {
		case 1:
			logger.trace(message);
			break;
		case 2:
			logger.info(message);
			break;
		case 3:
			logger.debug(message);
			break;
		case 4:
			logger.warn(message);
			break;
		case 5:
			logger.error(message);
			break;
		default:
			logger.warn("No Logger Level Found");
		}
	}

	public void log(final int level, Object message1, final Throwable thrower) {
		String message = (String)message1;
		message = logger.getName() + ": " + message;
		switch (level) {
		case 1:
			logger.trace(message, thrower);
			break;
		case 2:
			logger.info(message, thrower);
			break;
		case 3:
			logger.debug(message, thrower);
			break;
		case 4:
			logger.warn(message, thrower);
			break;
		case 5:
			logger.error(message, thrower);
			break;
		default:
			logger.warn("No Logger Level Found");
		}
	}

}
