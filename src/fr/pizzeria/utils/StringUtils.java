/**
 * 
 */
package fr.pizzeria.utils;

import java.lang.reflect.Field;

/** Classe utilitaire qui fournit des services de génération / conversion de chaine de caractère
 * Nouvelle méthode toString
 * 
 * @author Axel B.
 *
 */
public class StringUtils {
	
	/**Methode qui converti un objet en chaine de caractère
	 * @param object
	 * @return
	 */
	public static String getStringValue(Object object){
		
		String chaine = "";
		try{
			Field[] fields = object.getClass().getDeclaredFields();
			for ( Field f : fields){
				f.setAccessible(true);
				if(f.isAnnotationPresent(ToString.class)){
					ToString annotation = f.getAnnotation(ToString.class);
					Object value = f.get(object);
					if(!annotation.separateur().equals("")){
						value += annotation.separateur();
					}
					
					if(!annotation.before().equals("")){
						value += annotation.before();
					}
					if(!annotation.after().equals("")){
						  value += annotation.after();
					}
					if(annotation.upperCase()){
						value = value.toString().toUpperCase();
					}
					
					
					chaine += value;
				}}return chaine;}catch(Exception e)
	{
		return null;

	}
}

}
