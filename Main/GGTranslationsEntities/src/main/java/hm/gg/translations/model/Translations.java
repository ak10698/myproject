package hm.gg.translations.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Hello world!
 *
 */
@Entity
@Table(name="gg_translation_config")
public class Translations implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
    private int id;
	@Column(name = "module", unique = true)
	private String model;
	@Column(name = "gg_key", unique = true)
	private String gg_key;
	@Column(name = "gg_value")
	private String gg_value;
	
	
	public Translations(){}
	public Translations(int id ,String model,String gg_key,String gg_value){
		this.id = id;
		this.model = model;
		this.gg_key = gg_key;
		this.gg_value = gg_value;
				
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getGg_key() {
	return gg_key;
}
public void setGg_key(String gg_key) {
	this.gg_key = gg_key;
}
public String getGg_value() {
	return gg_value;
}
public void setGg_value(String gg_value) {
	this.gg_value = gg_value;
}


@Override
public String toString() {
	return "Translations [id=" + id + ", model=" + model + ", gg_key=" + gg_key + ", gg_value=" + gg_value + "]";
}

}
