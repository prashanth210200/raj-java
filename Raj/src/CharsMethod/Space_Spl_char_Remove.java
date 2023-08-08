package CharsMethod;

public class Space_Spl_char_Remove {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abc def / d  ";
		//String af=a.strip();
		
		//  ^  this Simple is used  to the specified the field should be present , other character will remove 
		
		
		String str = a.replaceAll("[^a-zA-Z0-9]", "");
		//String af=a.trim();
		System.out.println(str);

	}

}
