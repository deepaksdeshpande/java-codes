/**
 * 
 */
package annotation;

/**
 * @author Deepak Deshpande
 *
 */
public @interface CustomWithParam {
	public int id();
	abstract String name();
	public String email();
	abstract String password();
}
