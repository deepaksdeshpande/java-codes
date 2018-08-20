/**
 * 
 */
package interview;

/**
 * @author Deepak Deshpande
 *
 */
public class InterfaceImpl implements I1, I2 {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Implemented both Interfaces successfully");
	}
	
	public static void main(String[] args) {
		InterfaceImpl i = new InterfaceImpl();
		i.eat();
	}

}
