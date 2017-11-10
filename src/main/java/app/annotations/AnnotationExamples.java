package app.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

/**
 * https://docs.oracle.com/javase/1.5.0/docs/guide/language/annotations.html
 * @author wums
 *
 */
public class AnnotationExamples {
	// annotations are used by tools and libraries
	// do not affect program semantics
	
	// elements: method declarations in an @interface
	
	// special kind of modifier
	// precedes other modifiers
	// can be used where other modifiers are used
	
	// markers: annotations w/out elements
	
	// annotations w/ 1 element -> name it value
	
	// meta annotations: is annotated itself
	
	@MyAnnotation(value = "My Annotation value")
	public String msg1 = "Hello World!";
	
	@MyAnnotation(value = "My second value")
	public String msg2 = "Hello World!";
	
	/**
	 * using reflection
	 * @param args
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws SecurityException, ClassNotFoundException {
		Field [] fields = Class.forName(AnnotationExamples.class.getName()).getFields();
		for(Field field : fields) {
			String name = field.getName();
			Annotation []  annotations = field.getAnnotations();
			for(Annotation a : annotations) {
				String desc = a.toString();
				System.out.printf("Field %s has annotation: %s.\n",name,desc);
				if(field.isAnnotationPresent(MyAnnotation.class)) {
					MyAnnotation myAnnotation = (MyAnnotation) field.getAnnotation(MyAnnotation.class);
					System.out.printf("Field %s's value for annotation is: %s.\n",name,myAnnotation.value());					
				}
			}
		}
	}
}

/**
 * This annotation contains a single value
 * @author wums
 *
 */
@Retention(RetentionPolicy.RUNTIME) // need this so we can use reflection on annotation
@interface MyAnnotation{
	String value();
}
