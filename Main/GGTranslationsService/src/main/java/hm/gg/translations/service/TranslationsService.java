package hm.gg.translations.service;

import java.util.List;

import hm.gg.translations.model.Translations;

public interface TranslationsService {
	
	void addTransConfiguration(Object trans) throws  Exception;

	void editTransConfiguration(Object trans);

	void deleteTransConfiguration(int id);
	List getAllTransConfiguration();
}