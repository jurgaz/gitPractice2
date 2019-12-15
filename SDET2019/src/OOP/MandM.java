package OOP;

public class MandM {
	
	String color = "";
	
	//constructor method - helps create objects for the class - needs Access-modifier, Class-Name (Argument) {Code block}
	
	public MandM(String colorOftheObject) {
          color = colorOftheObject;
	}
	//method
	//Access-Modifier Return_DataTYpe Method-Name(Arguments) {Code block}
	public String getColor() {
		return color;
	}
		//getColor - getters method - always have a "return" datatype; can have arguments or doesn't have to have an argument;
		
	// setters method - change a value - Access-modifier, Return Datatype, the method name, argument
	//	public void - doesn't return anything
		public void setColor(String newColor) {
		color = newColor;
		}
		
		
	}
   
	
	
	

