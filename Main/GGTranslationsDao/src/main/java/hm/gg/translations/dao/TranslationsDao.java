package hm.gg.translations.dao;


import java.util.List;

import hm.gg.translations.model.Translations;

/**
 * Hello world!
 *
 */
public interface TranslationsDao {
	void addTransConfiguration(Object trans) throws  Exception;

	void editTransConfiguration(Object trans);

	void deleteTransConfiguration(int id);
	public List getAllTransConfiguration();
}
