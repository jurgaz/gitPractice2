package OOP;

public class Runner {

	public static void main(String[] args) {
		
		MandM obj1 = new MandM("Green");
		
		MandM obj2 = new MandM ("Yellow");
		
		MandM obj3 = new MandM ("Yellow");
		System.out.println(obj3.getColor());
		obj3.setColor("Brown");
		System.out.println(obj3.getColor());
		
		MandM obj4 = new MandM ("Yellow");
		
		MandM obj5 = new MandM ("Blue");
		MandM obj6 = new MandM ("Blue");
		
		System.out.println(obj1.getColor());
		System.out.println(obj6.getColor());
	}

}
