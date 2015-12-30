package hm.gg.translations.facade;

import java.util.List;

import hm.gg.translations.facade.dto.TranslationsDtoRes;
import hm.gg.translations.model.Translations;

public interface TranslationsFacade {
	TranslationsDtoRes addTransConfiguration(Object trans) throws  Exception;

	void editTransConfiguration(Object trans);

	void deleteTransConfiguration(int id);
	public List getAllTransConfiguration();

}
