package interview;

public class SingletonClass {

	private static final long serialversionUID=1L;
	
	private SingletonClass() {
		// TODO Auto-generated constructor stub
	}
	
	static class SingletonHolder {
		private static volatile SingletonClass instance=new SingletonClass();
	}
	
	public static SingletonClass getInstance() {
		return SingletonHolder.instance;
	}
	
	protected Object readResolve() {
		return getInstance();
	}
}
