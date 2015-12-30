package hm.gg.translations.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import hm.gg.translations.dao.TranslationsDao;
import hm.gg.translations.model.Translations;
import hm.gg.translations.service.TranslationsService;
import hm.gg.translations.utils.TranslationsLogFactory;
import hm.gg.translations.utils.TranslationsLogger;


public class TranslationsServiceImpl implements TranslationsService{
	
	private static final TranslationsLogger logger = TranslationsLogFactory.getLoggerInstance(TranslationsServiceImpl.class.getName());
	
	@Autowired(required =true)
	private TranslationsDao transDao;

	public TranslationsDao getTransDao() {
		return transDao;
	}

	public void setTransDao(TranslationsDao transDao) {
		this.transDao = transDao;
	}

	@Override
	public void addTransConfiguration(Object trans) throws Exception {
		System.out.println("This is Insertion operation in Serve Impl class");
		try{
			transDao.addTransConfiguration(trans);
			logger.log(TranslationsLogger.INFO, "Success: Insertion operation in Serve Impl is done");
		}catch(Exception e){
			logger.log(TranslationsLogger.INFO, "Failure: Insertion operation in Serve Impl isn't done");
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public void editTransConfiguration(Object trans) {
		if(trans!=null){
		transDao.editTransConfiguration(trans);
		}
	}

	@Override
	public void deleteTransConfiguration(int id) {
		
		transDao.deleteTransConfiguration(id);
		
	}

	@Override
	public List getAllTransConfiguration() {
		return transDao.getAllTransConfiguration();
	}

	/*public static void main(String[] rs) throws Exception
	{
		Translations trans = new Translations();
		//emailEntity.setId(1);
		
    	trans.setGg_key("samplekey1");
    	trans.setGg_value("alue1");
    	trans.setModel("model1");
    	
		
    	ApplicationContext context = new ClassPathXmlApplicationContext("service-context.xml");
    	TranslationsService transDao = (TranslationsService) context.getBean("transService");
    	transDao.addTransConfiguration(trans);
       
	}*/
}
