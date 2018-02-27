
package fr.pizzeria.utils;
import java.lang.annotation.*;


/**
 * @author Axel B
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ToString {
	
	String separateur() default " ";
	String before() default " ";
	String after() default " ";
	boolean upperCase() default false;

}
