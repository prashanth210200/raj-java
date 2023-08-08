package CharsMethod;

public class Repeat_and_Non_Repeat_Char {
    public static void main(String[] args) {
		String name="Raj Saranya".toLowerCase();
		char ch[]=name.toCharArray();
		int count=1;
		for(int i=0;i<ch.length;i++) {
               count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]&&ch[i]!=' ') {
					count++;
					ch[j]=' ';
				}
				
		}
			if(count>1) {
				System.out.println(ch[i]+"-"+count);
		}
			else if(count==1&&ch[i]!=' ')
				System.out.println(ch[i]+"-"+count);
	}
}
}
