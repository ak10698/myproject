package hm.gg.translations.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hm.gg.translations.facade.TranslationsFacade;
import hm.gg.translations.facade.dto.TranslationsDtoRes;
import hm.gg.translations.model.Translations;
import hm.gg.translations.service.TranslationsService;
import hm.gg.translations.utils.TranslationsLogFactory;
import hm.gg.translations.utils.TranslationsLogger;

public class TranslationsFacadeImpl implements TranslationsFacade {

	private static final TranslationsLogger logger = TranslationsLogFactory.getLoggerInstance(TranslationsFacadeImpl.class.getName());
	@Autowired(required =true)
	private TranslationsService transService ;
	
	public TranslationsService getTransService() {
		return transService;
	}

	public void setTransService(TranslationsService transService) {
		this.transService = transService;
	}
	
	@Override
	public TranslationsDtoRes addTransConfiguration(Object trans)  {
		System.out.println("its in facade");
		TranslationsDtoRes translationsDtoRes = new TranslationsDtoRes();
		try{
			transService.addTransConfiguration(trans);
			translationsDtoRes.setErrorCode(0);
			translationsDtoRes.setStatusMsg("Report Sent");
			
			logger.log(TranslationsLogger.INFO, "Success: Insertion operation in Serve Impl is done");
		}catch(Exception e){
			translationsDtoRes.setErrorCode(1);
			translationsDtoRes.setStatusMsg("Got Exception");
			logger.log(TranslationsLogger.INFO, "Failure: Insertion operation in Serve Impl isn't done");
			//throw new Exception(e.getMessage());
			System.out.println(e.getMessage());
		}
		return translationsDtoRes;
	}

	@Override
	public void editTransConfiguration(Object trans) {
		if(trans!=null){
			transService.editTransConfiguration(trans);
			}
	}

	@Override
	public void deleteTransConfiguration(int id) {
			transService.deleteTransConfiguration(id);
	}

	@Override
	public List getAllTransConfiguration() {
		return transService.getAllTransConfiguration();
	}
	
	/*public static void main(String[] rs) 
	{
		Translations trans = new Translations();
		//emailEntity.setId(1);
		
    	trans.setGg_key("samplekey657652");
    	trans.setGg_value("alue2");
    	trans.setModel("model2776687");
    	
		
    	ApplicationContext context = new ClassPathXmlApplicationContext("facade-context.xml");
    	TranslationsFacade transDao = (TranslationsFacade) context.getBean("transFacade");
    	try {
			transDao.addTransConfiguration(trans);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("dsa:"+e);
		}
       
	}*/

}
