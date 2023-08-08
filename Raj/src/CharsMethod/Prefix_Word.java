package CharsMethod;

public class Prefix_Word {
    public static void main(String[] args) {
  	  String name[] = {"Kumar", "MathanKumar", "KumarG"};
  	  String word="";
  	  
  	  for(int i=0;i<name.length;i++) {
  		  if(word.equals("")) {
  			  word=name[i];
  		  }
  		  else if(!name[i].contains(word)) {
  			  word="";
  		  }
  	  }
  	  System.out.println(word);
	}
}
//