package hm.gg.translations.dao.impl;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;

import hm.gg.translations.dao.TranslationsDao;
import hm.gg.translations.model.Translations;
@Repository
public class TranslationDaoImpl implements TranslationsDao {
	
	private HibernateTemplate template=null;
	// TODO inject
	/*public void setSessionFactory(SessionFactory sessionFactory) {
		 template = new HibernateTemplate(sessionFactory);
	}*/
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.template = hibernateTemplate;
	}
	@Override
	@Transactional
	public void addTransConfiguration(Object trans) throws Exception {
		Translations translations = (Translations)trans;
		System.out.println("In DAO: Translations::"+translations);
		if(trans!=null){
	           try{
	        	   template.save(trans);
	           }catch(Exception e){
	        	   System.out.println(e);
	           }
			}
	}
	@Override
	public void editTransConfiguration(Object trans) {
		template.update(trans);
	}
	@Override
	public void deleteTransConfiguration(int id) {
		template.delete(id);
	}
	@Override
	@Transactional
	public List getAllTransConfiguration() {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		List list = template.getSessionFactory().getCurrentSession().createQuery("from Translations").list();
		//String translationJSON = "Translations=\'"+gson.toJson(list)+"\'";
/*//		String translationJSON = gson.toJson(list);
//		return translationJSON;
*/
		return list;
		//return template.getSessionFactory().getCurrentSession().createQuery("from Translations").list();
	}
	/*public static void main(String[] rs) 
	{
		Translations trans = new Translations();
		//emailEntity.setId(1);
		
    	trans.setGg_key("samplekey657652");
    	trans.setGg_value("alue2");
    	trans.setModel("model2776687");
    	
		
    	ApplicationContext context = new ClassPathXmlApplicationContext("dao-context.xml");
    	TranslationsDao transDao = (TranslationsDao) context.getBean("transDao");
    	try {
    		Gson gson = new Gson();
    		//System.out.println("JSON:"+"\"Translations:\""+gson.toJson(transDao.getAllTransConfiguration()));
			System.out.println("LIST:"+transDao.getAllTransConfiguration());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("dsa:"+e);
		}
       
	}*/
}
