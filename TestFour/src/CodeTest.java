
public class CodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CodeTest codeTest = new CodeTest();
		codeTest.stringSet();
		codeTest.isTrue();

	}
	
	String bracesTrue = "({Hello})[World!]";
	String[] test = null; //hold the specified characters to check order
	
	public void stringSet() {
		
		//check the order of the parenthesis and brackets. can contain strings.
		//({string})[string] = true 
		//[]{]}[ = false  <-- example
				
		String[] braces = {"(", "{", "}", ")", "[", "]"}; 
		//0 = ( 
		//1 = {
		//2 = }
		//3 = )
		//4 = [
		//5 = ]
		

		
		for (int i = 0; i < bracesTrue.length(); i++) {
			
			//trying to compare each letter in string array to see if any parenthesis and the like exist
			//in each slot
			if (braces[i].equals("(") || braces[i].equals("{") || braces[i].equals("}") || braces[i].equals(")") || braces[i].equals("[") || braces[i].equals("]"))
				//if( month == 1 || month == 2 || month == 3 ) mental note
			{
				
				test[i] = braces[i]; //printing out null still...
							
				System.out.println(test[i]); //prints each loop of collected char from string array
			}
			
		}
		
		
		
		}
	boolean isTrue() {
		
		for (int i = 0; i < bracesTrue.length(); )
		if(test[i].equals("(") && test[i].equals("{") && test[i].equals("}") && test[i].equals(")") && test[i].equals("[") && test[i].equals("]")) {
			
			i++;
			return true;
		}
		return false;
		
		
		
		
		
	}
	

	
	

}

	


