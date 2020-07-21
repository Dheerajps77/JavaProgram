package WorkingWithJavaReflectionAPI;
class ToGetClassName {
	
	public void getClassName(Object c)
	{
		try {
			Class c1=c.getClass();
			System.out.println(c1.getSimpleName());
			
		} catch (Exception e) {
			throw e;
		}
	}
	public static void main(String[] args) throws ClassNotFoundException {
		
		Simple simple=new Simple();
		ToGetClassName obj1=new ToGetClassName();
		obj1.getClassName(simple);
	}
}
