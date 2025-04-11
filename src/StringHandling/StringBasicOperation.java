package StringHandling;

public class StringBasicOperation {

	public static void main(String[] args) {
		String str = "Hello";
		String str1 = "Java" ;
		
		//length of string
		int res = str.length();								//returns the length of string
		System.out.println("The given String Length is:"+res);
		
		//concatenate String
		str = str.concat(str1);								//concatenated string
		System.out.println("Concatenation string:" +str);
		
		//StringBuffer for concatenation
		StringBuffer sbf = new StringBuffer("");          //its another way to concatenate string
		sbf.append("Helloe");
		sbf.append("Java 1");
		System.out.println(sbf);
		
		//charAt
		System.out.println(str.charAt(1));                //it returns the character at index 1
		
		
		//indexOf => it will return the index of given characters
		System.out.println(str.indexOf("H"));  
		System.out.println(str.indexOf("ello")); 
		System.out.println(str.indexOf('e',2));
		System.out.println(str.lastIndexOf('e'));   
		
		//getChars --> it will replace the ch array from 0th index with the characters of index 0,3 of string str3 
		char ch[]= {'s','a','k','s','h','i'};
		String str3 = "bule";
		str3.getChars(0,3,ch,1);	 //1 = ch[]	array to replace from which index || 0,3 =>	string str3 characters of 0th and 3rd index 
		System.out.println(ch);
		
		//startsWith  //endsWith      --> it will return boolean value
		String st ="Camera";
		System.out.println(st.startsWith("Cam"));
		System.out.println(st.endsWith("era"));              //both are its case senstive
		
		//compareTo
		String a = "sakshi";
		String b = "sakshi";
		System.out.println(a.compareTo("sakshi"));        // it will return integer value if both the string data is same
		System.out.println(a.compareTo("saks"));          //it will return integer of how many characters are not there
		System.out.println(a.compareToIgnoreCase("Saks"));  // it will ignore case sentiveness
		
		//substring
		String s = "hello sakshi how are you";
		String x = s.substring(10);								//it will return the copy of the string from the front of 10th index
		System.out.println(x);
		
		//replace
		String q = "heeleelblo";
		String t = q.replace('e', 'j');
		System.out.println(t);
		
		//trim --> removes the whitespace
		String A = "    Hello";
		String B = A.trim();
		System.out.println(B);
		
		//toUppercase //toLowercase
		String X = "heello";
		System.out.println(X.toUpperCase());
		System.out.println(X.toLowerCase());
		

	}

}
