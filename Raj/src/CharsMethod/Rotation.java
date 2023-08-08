package CharsMethod;

public class Rotation {
    public static void main(String[] args) {
   	 //String a="java";
   	 //String b="Developer";
		StringBuffer course=new StringBuffer("Java");
		StringBuffer designation=new StringBuffer("Developer");
		//course.append(a);
		
		System.out.println(course.insert(2, designation));
		
	}
}

